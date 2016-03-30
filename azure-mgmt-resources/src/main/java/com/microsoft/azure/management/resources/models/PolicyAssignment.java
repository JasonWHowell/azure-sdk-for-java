/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Policy assignment.
 */
public class PolicyAssignment {
    /**
     * Gets or sets the policy assignment properties.
     */
    private PolicyAssignmentProperties properties;

    /**
     * Gets or sets the policy assignment name.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public PolicyAssignmentProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(PolicyAssignmentProperties properties) {
        this.properties = properties;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

}
