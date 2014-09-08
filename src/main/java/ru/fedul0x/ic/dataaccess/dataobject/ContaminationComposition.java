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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import ru.fedul0x.ic.dataaccess.DataEntity;

/**
 *
 * @author Ivashin Alexey <ivashin.alexei@gmail.com>
 */
@Entity
@Table(name = "contamination_composition", schema = "public")
public class ContaminationComposition extends DataEntity {

    private String name;
//    private HashMap<Contamination, Double> contaminations;
//    private Set<StockCategory> stockCategories = new HashSet<StockCategory>(0);
    private Set<DataSheetContaminationComposition> dataSheetContaminationCompositions = new HashSet<>(0);

    public ContaminationComposition() {
    }

    public ContaminationComposition(String name) {
        this.name = name;
    }

    public ContaminationComposition(String name, Set<DataSheetContaminationComposition> dataSheetContaminationCompositions) {
        this.name = name;
        this.dataSheetContaminationCompositions = dataSheetContaminationCompositions;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "contamination_composition_id", unique = true, nullable = false)
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.contaminationComposition")
    public Set<DataSheetContaminationComposition> getDataSheetContaminationCompositions() {
        return dataSheetContaminationCompositions;
    }

    public void setDataSheetContaminationCompositions(Set<DataSheetContaminationComposition> dataSheetContaminationCompositions) {
        this.dataSheetContaminationCompositions = dataSheetContaminationCompositions;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
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
        final ContaminationComposition other = (ContaminationComposition) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}
