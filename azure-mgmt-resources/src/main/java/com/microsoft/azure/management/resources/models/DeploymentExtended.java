/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment information.
 */
public class DeploymentExtended {
    /**
     * Gets or sets the ID of the deployment.
     */
    private String id;

    /**
     * Gets or sets the name of the deployment.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets deployment properties.
     */
    private DeploymentPropertiesExtended properties;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DeploymentPropertiesExtended getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
    }

}
