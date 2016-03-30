/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;


/**
 * Describes the properties of a VM size.
 */
public class VirtualMachineSize {
    /**
     * Gets or sets the VM size name.
     */
    private String name;

    /**
     * Gets or sets the Number of cores supported by a VM size.
     */
    private Integer numberOfCores;

    /**
     * Gets or sets the OS disk size allowed by a VM size.
     */
    private Integer osDiskSizeInMB;

    /**
     * Gets or sets the Resource disk size allowed by a VM size.
     */
    private Integer resourceDiskSizeInMB;

    /**
     * Gets or sets the Memory size supported by a VM size.
     */
    private Integer memoryInMB;

    /**
     * Gets or sets the Maximum number of data disks allowed by a VM size.
     */
    private Integer maxDataDiskCount;

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
     * Get the numberOfCores value.
     *
     * @return the numberOfCores value
     */
    public Integer getNumberOfCores() {
        return this.numberOfCores;
    }

    /**
     * Set the numberOfCores value.
     *
     * @param numberOfCores the numberOfCores value to set
     */
    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    /**
     * Get the osDiskSizeInMB value.
     *
     * @return the osDiskSizeInMB value
     */
    public Integer getOsDiskSizeInMB() {
        return this.osDiskSizeInMB;
    }

    /**
     * Set the osDiskSizeInMB value.
     *
     * @param osDiskSizeInMB the osDiskSizeInMB value to set
     */
    public void setOsDiskSizeInMB(Integer osDiskSizeInMB) {
        this.osDiskSizeInMB = osDiskSizeInMB;
    }

    /**
     * Get the resourceDiskSizeInMB value.
     *
     * @return the resourceDiskSizeInMB value
     */
    public Integer getResourceDiskSizeInMB() {
        return this.resourceDiskSizeInMB;
    }

    /**
     * Set the resourceDiskSizeInMB value.
     *
     * @param resourceDiskSizeInMB the resourceDiskSizeInMB value to set
     */
    public void setResourceDiskSizeInMB(Integer resourceDiskSizeInMB) {
        this.resourceDiskSizeInMB = resourceDiskSizeInMB;
    }

    /**
     * Get the memoryInMB value.
     *
     * @return the memoryInMB value
     */
    public Integer getMemoryInMB() {
        return this.memoryInMB;
    }

    /**
     * Set the memoryInMB value.
     *
     * @param memoryInMB the memoryInMB value to set
     */
    public void setMemoryInMB(Integer memoryInMB) {
        this.memoryInMB = memoryInMB;
    }

    /**
     * Get the maxDataDiskCount value.
     *
     * @return the maxDataDiskCount value
     */
    public Integer getMaxDataDiskCount() {
        return this.maxDataDiskCount;
    }

    /**
     * Set the maxDataDiskCount value.
     *
     * @param maxDataDiskCount the maxDataDiskCount value to set
     */
    public void setMaxDataDiskCount(Integer maxDataDiskCount) {
        this.maxDataDiskCount = maxDataDiskCount;
    }

}
