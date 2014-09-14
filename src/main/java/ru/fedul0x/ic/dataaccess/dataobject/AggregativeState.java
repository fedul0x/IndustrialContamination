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
package ru.fedul0x.ic.dataaccess.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import ru.fedul0x.ic.dataaccess.DataEntity;
import ru.fedul0x.ic.dataaccess.TitledColumn;

/**
 * Aggregative state of some contamination
 * <ul>
 * <li>твердый</li>
 * <li>жидкий</li>
 * <li>постообразный</li>
 * <li>шлам</li>
 * <li>гель</li>
 * <li>эмульсия</li>
 * <li>суспензия</li>
 * <li>сыпучий</li>
 * <li>гранулят</li>
 * <li>порошкообразный</li>
 * <li>пылеобразный</li>
 * <li>волокно</li>
 * <li>готовое изделие, потерявшее свои потребительские свойства</li>
 * <li>иное</li>
 * </ul>
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
@Entity
@Table(name = "aggregative_state", schema = "public")
public class AggregativeState extends DataEntity {

    private String name;

    public AggregativeState() {
    }

    public AggregativeState(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TitledColumn(name = "id", title="Агрегатное состояние", unique = true, nullable = false)
    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
