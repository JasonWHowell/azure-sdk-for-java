/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Target resource.
 */
public class TargetResource {
    /**
     * Gets or sets the ID of the resource.
     */
    private String id;

    /**
     * Gets or sets the name of the resource.
     */
    private String resourceName;

    /**
     * Gets or sets the type of the resource.
     */
    private String resourceType;

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
     * Get the resourceName value.
     *
     * @return the resourceName value
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName value.
     *
     * @param resourceName the resourceName value to set
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

}
