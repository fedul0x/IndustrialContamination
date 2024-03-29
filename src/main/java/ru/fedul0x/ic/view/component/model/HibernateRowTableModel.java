/*
 * Copyright 2013 Ivashin Alexey <ivashin.alexei@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.fedul0x.ic.view.component.model;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.fedul0x.ic.dataaccess.DataEntity;
import ru.fedul0x.ic.dataaccess.DataSourceHibernate;
import ru.fedul0x.ic.dataaccess.TitledColumn;
import ru.fedul0x.ic.dataaccess.TitledId;

/**
 * Model for JTable with hibernate data source
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class HibernateRowTableModel<T extends DataEntity> extends RowTableModel<T> {

    private ArrayList<Method> methods = new ArrayList<>();
    /**
     * Поля и их последовательность, с которой они должны находиться в JTable
     */
    private List<String> fields;

    public HibernateRowTableModel(Class rowClass, String[] fields) {
        super(rowClass);
        this.fields = new ArrayList<>();
        for (String str : fields) {
            this.fields.add(str);
        }

        List<String> columns = new ArrayList<>();
        DataSourceHibernate<T> dsh = new DataSourceHibernate<>(rowClass);
        ArrayList<T> data = (ArrayList<T>) dsh.findAll();
        HashMap<Field, Method> titleAndMethods = (HashMap<Field, Method>) getFieldsAndMethods(rowClass);
        List<String> alts = new ArrayList<>();
        for (Field key : titleAndMethods.keySet()) {
            alts.clear();
            if (null != key.getAnnotation(TitledColumn.class)) {
                alts.add(key.getAnnotation(TitledColumn.class).title());
            }
            if (null != key.getAnnotation(TitledId.class)) {
                alts.add(key.getAnnotation(TitledId.class).title());
            }
            try {
                if (null != getMethod(key).getAnnotation(TitledColumn.class)) {
                    alts.add(getMethod(key).getAnnotation(TitledColumn.class).title());
                }
                if (null != getMethod(key).getAnnotation(TitledId.class)) {
                    alts.add(getMethod(key).getAnnotation(TitledId.class).title());
                }
            } catch (NoSuchMethodException ex) {
                continue;
            }
            String column = "";
            for (String item : alts) {
                if ((item != null) && (!item.isEmpty())) {
                    column = item;
                }
            }
            //TODO REWRITE THIS
            Class cond;
            try {
                cond = getMethod(key).getReturnType().getSuperclass();
            } catch (NoSuchMethodException ex) {
                continue;
            }
            if ((cond == DataEntity.class)
                    || (cond == Set.class)) {
                continue;
            }

            //TODO REWRITE THIS
            if (!column.isEmpty()) {
                columns.add(column);
                try {
                    methods.add(getMethod(key));
//                columnClasses[column.length() - 1] = getMethod(key).getReturnType();
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(HibernateRowTableModel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //Проверка, есть ли в columns все, что есть в fields
        if (this.fields.size() > columns.size()) {
            throw new IllegalArgumentException("this.fields.size() > columns.size()");
        }
        //TODO containsALL maybe
        for (String str : fields) {
            if (!columns.contains(str)) {
                throw new IllegalArgumentException("(!columns.contains(str))");
            }
        }
        //Сортировака columns и methods в соответсвии с this.fields

        for (int i = columns.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                String argj = columns.get(j);
                String argjp1 = columns.get(j + 1);
                Method mj = methods.get(j);
                Method mjp1 = methods.get(j + 1);

                if (this.fields.indexOf(argj) > this.fields.indexOf(argjp1)) {
                    columns.set(j, argjp1);
                    columns.set(j + 1, argj);
                    methods.set(j, mjp1);
                    methods.set(j + 1, mj);
                }
            }
        }

        setDataAndColumnNames(data, columns);
        for (int i = 0; i < methods.size(); i++) {
            columnClasses[i] = methods.get(i).getReturnType();

        }
    }

    public HibernateRowTableModel(Class rowClass) {
        super(rowClass);
        List<String> columns = new ArrayList<>();
        DataSourceHibernate<T> dsh = new DataSourceHibernate<>(rowClass);
        ArrayList<T> data = (ArrayList<T>) dsh.findAll();
        HashMap<Field, Method> titleAndMethods = (HashMap<Field, Method>) getFieldsAndMethods(rowClass);
        List<String> alts = new ArrayList<>();
        for (Field key : titleAndMethods.keySet()) {
            alts.clear();
            if (null != key.getAnnotation(TitledColumn.class)) {
                alts.add(key.getAnnotation(TitledColumn.class).title());
            }
            if (null != key.getAnnotation(TitledId.class)) {
                alts.add(key.getAnnotation(TitledId.class).title());
            }
            try {
                if (null != getMethod(key).getAnnotation(TitledColumn.class)) {
                    alts.add(getMethod(key).getAnnotation(TitledColumn.class).title());
                }
                if (null != getMethod(key).getAnnotation(TitledId.class)) {
                    alts.add(getMethod(key).getAnnotation(TitledId.class).title());
                }
            } catch (NoSuchMethodException ex) {
                continue;
            }
            String column = "";
            for (String item : alts) {
                if ((item != null) && (!item.isEmpty())) {
                    column = item;
                }
            }
            //TODO REWRITE THIS
            Class cond;
            try {
                cond = getMethod(key).getReturnType().getSuperclass();
            } catch (NoSuchMethodException ex) {
                continue;
            }
            if ((cond == DataEntity.class)
                    || (cond == Set.class)) {
                continue;
            }

            //TODO REWRITE THIS
            if (!column.isEmpty()) {
                columns.add(column);
                try {
                    methods.add(getMethod(key));
//                columnClasses[column.length() - 1] = getMethod(key).getReturnType();
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(HibernateRowTableModel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        setDataAndColumnNames(data, columns);
        for (int i = 0; i < methods.size(); i++) {
            columnClasses[i] = methods.get(i).getReturnType();

        }
    }

    private Map<Field, Method> getFieldsAndMethods(Class<?> clazz) {
        Map<Field, Method> result = new HashMap<>();
        Method method;
        ArrayList<Field> fields = new ArrayList<>();
        fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
        try {
            fields.add(clazz.getSuperclass().getDeclaredField("id"));
        } catch (NoSuchFieldException | SecurityException ex) {
        }
        for (Field field : fields) {
            try {
                method = getMethod(field);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(getClass().getName()).log(Level.WARNING, null, ex);
                continue;
            }
            result.put(field, method);
        }
        return result;
    }

    private Method getMethod(Field field) throws NoSuchMethodException {
        Class<?> clazz = field.getDeclaringClass();
        String name = "get" + uppercase(field.getName());
        Method method = clazz.getMethod(name);
        return method;
    }

    private String uppercase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object result;
        try {
            result = methods.get(columnIndex).invoke(modelData.get(rowIndex));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            result = (Object) "";
            Logger.getLogger(HibernateRowTableModel.class.getName()).log(Level.WARNING, null, ex);
        }
        return result;
    }
}
