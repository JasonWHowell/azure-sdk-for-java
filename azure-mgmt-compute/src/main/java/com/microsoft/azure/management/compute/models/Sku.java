/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;


/**
 * Describes a virtual machine scale set sku.
 */
public class Sku {
    /**
     * Gets or sets the sku name.
     */
    private String name;

    /**
     * Gets or sets the sku tier.
     */
    private String tier;

    /**
     * Gets or sets the sku capacity.
     */
    private Long capacity;

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
     * Get the tier value.
     *
     * @return the tier value
     */
    public String getTier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     */
    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

}
