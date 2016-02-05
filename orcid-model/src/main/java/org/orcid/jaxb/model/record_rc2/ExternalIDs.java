/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.jaxb.model.record_rc2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.message.WorkExternalIdentifier;
import org.orcid.jaxb.model.message.WorkExternalIdentifiers;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "externalIdentifiers" })
@XmlRootElement(name = "external-ids", namespace = "http://www.orcid.org/ns/common")

public class ExternalIDs implements Serializable, ExternalIdentifiersContainer{
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "external-id", namespace = "http://www.orcid.org/ns/common")
    protected List<ExternalID> externalIdentifiers;
    
    public List<ExternalID> getExternalIdentifiers() {
        if (externalIdentifiers == null) {
            externalIdentifiers = new ArrayList<ExternalID>();
        }
        return this.externalIdentifiers;
    }  
    
    public static ExternalIDs valueOf(org.orcid.jaxb.model.message.WorkExternalIdentifiers messageWorkExternalIdentifiers) {
        ExternalIDs ids = new ExternalIDs();
        for (WorkExternalIdentifier id : messageWorkExternalIdentifiers.getWorkExternalIdentifier()){
            ids.getExternalIdentifiers().add(ExternalID.fromMessageExtId(id));
        }
        return ids;
    }

    @Override
    @XmlTransient
    @JsonIgnore
    public List<? extends GroupAble> getExternalIdentifier() {
        return getExternalIdentifiers();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalIDs)) {
            return false;
        }

        ExternalIDs that = (ExternalIDs) o;

        if (externalIdentifiers == null) {
            if (that.externalIdentifiers != null)
                return false;
        } else {
            if (that.externalIdentifiers == null)
                return false;
            else if (!(externalIdentifiers.containsAll(that.externalIdentifiers) && that.externalIdentifiers.containsAll(externalIdentifiers) && 
                    that.externalIdentifiers.size() == externalIdentifiers.size())) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = externalIdentifiers != null ? externalIdentifiers.hashCode() : 0;
        return result;
    }
}
