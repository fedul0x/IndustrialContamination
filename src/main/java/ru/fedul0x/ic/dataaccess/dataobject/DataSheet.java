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

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    private Set<DataSheetContaminationComposition> dataSheetContaminationCompositions = new HashSet<>(0);
//    private Set<StockCategory> stockCategories = new HashSet<StockCategory>(0);
    /**
     * Агрегатное состояние
     */
    private AggregativeState aggregativeState;
    /**
     * Образовано в результате (технологический процесс)
     */
    private String technologicalProcess;
    /**
     * Класс опасности
     */
    private Byte dangerousCode;

    /**
     * Дата создания
     */
    private Date creationDate;
    private DataOperator dataOperator;

    private Company company;

    public DataSheet() {
    }

    public DataSheet(Long id) {
        this.id = id;
    }

    public DataSheet(ContaminationByFederalClassification contamination, AggregativeState aggregativeState, String technologicalProcess, Byte dangerousCode, Date creationDate, DataOperator dataOperator) {
        this.contamination = contamination;
        this.aggregativeState = aggregativeState;
        this.technologicalProcess = technologicalProcess;
        this.dangerousCode = dangerousCode;
        this.creationDate = creationDate;
        this.dataOperator = dataOperator;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "data_sheet_id", unique = true, nullable = false)
    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne
    public ContaminationByFederalClassification getContamination() {
        return contamination;
    }

    public void setContamination(ContaminationByFederalClassification contamination) {
        this.contamination = contamination;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.dataSheet", cascade = CascadeType.ALL)
    public Set<DataSheetContaminationComposition> getDataSheetContaminationCompositions() {
        return dataSheetContaminationCompositions;
    }

    public void setDataSheetContaminationCompositions(Set<DataSheetContaminationComposition> dataSheetContaminationCompositions) {
        this.dataSheetContaminationCompositions = dataSheetContaminationCompositions;
    }

    @OneToOne
    public AggregativeState getAggregativeState() {
        return aggregativeState;
    }

    public void setAggregativeState(AggregativeState aggregativeState) {
        this.aggregativeState = aggregativeState;
    }

    @Column(name = "technological_process")
    public String getTechnologicalProcess() {
        return technologicalProcess;
    }

    public void setTechnologicalProcess(String technologicalProcess) {
        this.technologicalProcess = technologicalProcess;
    }

    @Column(name = "dangerous_code")
    public Byte getDangerousCode() {
        return dangerousCode;
    }

    public void setDangerousCode(Byte dangerousCode) {
        this.dangerousCode = dangerousCode;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date", nullable = false)
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @OneToOne
    public DataOperator getDataOperator() {
        return dataOperator;
    }

    public void setDataOperator(DataOperator dataOperator) {
        this.dataOperator = dataOperator;
    }

    @ManyToOne
    @JoinColumn(name = "company", nullable = true)
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.contamination);
        hash = 53 * hash + Objects.hashCode(this.aggregativeState);
        hash = 53 * hash + Objects.hashCode(this.technologicalProcess);
        hash = 53 * hash + Objects.hashCode(this.dangerousCode);
        hash = 53 * hash + Objects.hashCode(this.creationDate);
        hash = 53 * hash + Objects.hashCode(this.dataOperator);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataSheet other = (DataSheet) obj;
        if (!Objects.equals(this.contamination, other.contamination)) {
            return false;
        }
        if (!Objects.equals(this.aggregativeState, other.aggregativeState)) {
            return false;
        }
        if (!Objects.equals(this.technologicalProcess, other.technologicalProcess)) {
            return false;
        }
        if (!Objects.equals(this.dangerousCode, other.dangerousCode)) {
            return false;
        }
        if (!Objects.equals(this.creationDate, other.creationDate)) {
            return false;
        }
        if (!Objects.equals(this.dataOperator, other.dataOperator)) {
            return false;
        }
        return true;
    }

}
