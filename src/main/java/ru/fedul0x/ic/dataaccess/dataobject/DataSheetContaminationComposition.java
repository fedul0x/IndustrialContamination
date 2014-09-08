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
package ru.fedul0x.ic.dataaccess.dataobject;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import ru.fedul0x.ic.dataaccess.DataEntity;

/**
 *
 * @author Юлия
 */
@Entity
@Table(name = "data_sheet_join_contamination_composition", schema = "public")
@AssociationOverrides({
    @AssociationOverride(name = "pk.dataSheet",
            joinColumns = @JoinColumn(name = "data_sheet_id")),
    @AssociationOverride(name = "pk.contaminationComposition",
            joinColumns = @JoinColumn(name = "contamination_composition_id"))})
public class DataSheetContaminationComposition extends DataEntity {

    private DataSheetContaminationCompositionId pk = new DataSheetContaminationCompositionId();
    private Double portion;

    public DataSheetContaminationComposition() {
    }

    @EmbeddedId
    public DataSheetContaminationCompositionId getPk() {
        return pk;
    }

    public void setPk(DataSheetContaminationCompositionId pk) {
        this.pk = pk;
    }

    @Transient
    public DataSheet getDataSheet() {
        return getPk().getDataSheet();
    }

    public void setDataSheet(DataSheet dataSheet) {
        getPk().setDataSheet(dataSheet);
    }

    @Transient
    public ContaminationComposition getContaminationComposition() {
        return getPk().getContaminationComposition();
    }

    public void setContaminationComposition(ContaminationComposition contaminationComposition) {
        getPk().setContaminationComposition(contaminationComposition);
    }

    @Column(name = "portion")
    public Double getPortion() {
        return portion;
    }

    public void setPortion(Double portion) {
        this.portion = portion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DataSheetContaminationComposition that = (DataSheetContaminationComposition) o;

        if (getPk() != null ? !getPk().equals(that.getPk())
                : that.getPk() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

}
