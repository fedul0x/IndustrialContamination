/*
 * Copyright 2014 Ivashin Alexey <ivashin.alexei@gmail.com>.
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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import ru.fedul0x.ic.dataaccess.DataSourceHibernate;
import ru.fedul0x.ic.dataaccess.dataobject.ContaminationComposition;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
public class HibernatedComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private final DataSourceHibernate<ContaminationComposition> dsh;
    private List<ContaminationComposition> items;
    private ContaminationComposition selectedItem;

    public HibernatedComboBoxModel() {
        dsh = (DataSourceHibernate<ContaminationComposition>) new DataSourceHibernate<>(ContaminationComposition.class);
        items = dsh.findAll();
        Collections.sort(items, new Comparator<ContaminationComposition>() {

            @Override
            public int compare(ContaminationComposition t, ContaminationComposition t1) {
                return t.getName().compareToIgnoreCase(t1.getName());
            }
        });
        
        selectedItem = null;
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public String getElementAt(int i) {
        return items.get(i).getName();
    }

    @Override
    public void setSelectedItem(Object o) {
        for (ContaminationComposition i : items) {
            if (i.getName() == ((String) o)) {
                selectedItem = i;
                System.out.println(selectedItem);
                break;
            }
        }
    }

    @Override
    public String getSelectedItem() {
        return null == selectedItem ? null : selectedItem.getName();
    }

}
