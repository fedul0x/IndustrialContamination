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

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Юлия
 */
@Embeddable
public class DataSheetContaminationCompositionId implements Serializable {

    private DataSheet dataSheet;
    private ContaminationComposition contaminationComposition;

    @ManyToOne
    public DataSheet getDataSheet() {
        return dataSheet;
    }

    public void setDataSheet(DataSheet dataSheet) {
        this.dataSheet = dataSheet;
    }

    @ManyToOne
    public ContaminationComposition getContaminationComposition() {
        return contaminationComposition;
    }

    public void setContaminationComposition(ContaminationComposition contaminationComposition) {
        this.contaminationComposition = contaminationComposition;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DataSheetContaminationCompositionId that = (DataSheetContaminationCompositionId) o;

        if (dataSheet != null ? !dataSheet.equals(that.dataSheet) : that.dataSheet != null) {
            return false;
        }
        if (contaminationComposition != null ? !contaminationComposition.equals(that.contaminationComposition) : that.contaminationComposition != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result;
        result = (dataSheet != null ? dataSheet.hashCode() : 0);
        result = 31 * result + (contaminationComposition != null ? contaminationComposition.hashCode() : 0);
        return result;
    }
}
