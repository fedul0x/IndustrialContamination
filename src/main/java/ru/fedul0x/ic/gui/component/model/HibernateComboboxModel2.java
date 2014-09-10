/*
 * Copyright 2014 Юлия.
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
package ru.fedul0x.ic.gui.component.model;

import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import ru.fedul0x.ic.dataaccess.DataEntity;
import ru.fedul0x.ic.dataaccess.DataSourceHibernate;
import ru.fedul0x.ic.dataaccess.dataobject.ContaminationComposition;

/**
 *
 * @author Юлия
 */
public class HibernateComboboxModel2<T extends DataEntity> implements ComboBoxModel<T> {

    private DataSourceHibernate<T> dsh;
    private List<T> items;
    private T selectedItem;

    public HibernateComboboxModel2() {
        //TODO rewrite this
        dsh = (DataSourceHibernate<T>) new DataSourceHibernate<>(ContaminationComposition.class);
        items = dsh.findAll();
        selectedItem = null;
    }

    @Override
    public void setSelectedItem(Object o) {
        selectedItem = (T) o;
    }

    @Override
    public Object getSelectedItem() {
        if (null == selectedItem) return null;
        if (selectedItem instanceof ContaminationComposition) {
            return ((ContaminationComposition) selectedItem).getName();
        } else {
            return selectedItem.getId();
        }
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public T getElementAt(int i) {
        return ((ContaminationComposition)items.get(i)).getName();
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
