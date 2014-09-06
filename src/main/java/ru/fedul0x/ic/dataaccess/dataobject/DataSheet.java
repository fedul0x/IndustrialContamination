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
import javax.persistence.Id;
import javax.persistence.Table;
import ru.fedul0x.ic.dataaccess.DataEntity;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
@Entity
@Table(name = "data_sheet", schema = "public")
public class DataSheet extends DataEntity {

    /**
     * Классификация по ФККО
     */
    private ContaminationByFederalClassification contamination;
    /**
     * Состав отхода
     */
    private ContaminationComposition сontaminationComposition;
    /**
     * Класс опасности
     */
    private Byte dangerousCode;

    public DataSheet() {
    }

    public DataSheet(Long id) {
        this.id = id;
    }

    public DataSheet(ContaminationByFederalClassification contamination, ContaminationComposition сontaminationComposition, Byte dangerousCode) {
        this.contamination = contamination;
        this.сontaminationComposition = сontaminationComposition;
        this.dangerousCode = dangerousCode;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public ContaminationByFederalClassification getContamination() {
        return contamination;
    }

    public void setContamination(ContaminationByFederalClassification contamination) {
        this.contamination = contamination;
    }

    public ContaminationComposition getСontaminationComposition() {
        return сontaminationComposition;
    }

    public void setСontaminationComposition(ContaminationComposition сontaminationComposition) {
        this.сontaminationComposition = сontaminationComposition;
    }

    public Byte getDangerousCode() {
        return dangerousCode;
    }

    public void setDangerousCode(Byte dangerousCode) {
        this.dangerousCode = dangerousCode;
    }

}
