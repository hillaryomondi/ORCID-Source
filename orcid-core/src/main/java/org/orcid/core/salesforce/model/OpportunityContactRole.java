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
package org.orcid.core.salesforce.model;

import java.io.Serializable;

/**
 * 
 * @author Will Simpson
 *
 */
public class OpportunityContactRole implements Serializable {

    private static final long serialVersionUID = 1L;

    // The SalesForce Id of the role object itself
    private String id;
    private String opportunityId;
    private String contactId;
    private ContactRoleType roleType;

    public OpportunityContactRole() {
    }

    public OpportunityContactRole(ContactRoleType role) {
        this.roleType = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public ContactRoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(ContactRoleType roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "OpportunityContactRole [id=" + id + ", opportunityId=" + opportunityId + ", contactId=" + contactId + ", roleType=" + roleType + "]";
    }

}
