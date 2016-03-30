/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Describes a Virtual Machine Image.
 */
@JsonFlatten
public class VirtualMachineImage extends SubResource {
    /**
     * The plan property.
     */
    @JsonProperty(value = "properties.plan")
    private PurchasePlan plan;

    /**
     * The osDiskImage property.
     */
    @JsonProperty(value = "properties.osDiskImage")
    private OSDiskImage osDiskImage;

    /**
     * The dataDiskImages property.
     */
    @JsonProperty(value = "properties.dataDiskImages")
    private List<DataDiskImage> dataDiskImages;

    /**
     * Gets or sets the name of the resource.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets the location of the resource.
     */
    @JsonProperty(required = true)
    private String location;

    /**
     * Gets or sets the tags attached to the resource.
     */
    private Map<String, String> tags;

    /**
     * Get the plan value.
     *
     * @return the plan value
     */
    public PurchasePlan getPlan() {
        return this.plan;
    }

    /**
     * Set the plan value.
     *
     * @param plan the plan value to set
     */
    public void setPlan(PurchasePlan plan) {
        this.plan = plan;
    }

    /**
     * Get the osDiskImage value.
     *
     * @return the osDiskImage value
     */
    public OSDiskImage getOsDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage value.
     *
     * @param osDiskImage the osDiskImage value to set
     */
    public void setOsDiskImage(OSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
    }

    /**
     * Get the dataDiskImages value.
     *
     * @return the dataDiskImages value
     */
    public List<DataDiskImage> getDataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages value.
     *
     * @param dataDiskImages the dataDiskImages value to set
     */
    public void setDataDiskImages(List<DataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
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
     * Get the location value.
     *
     * @return the location value
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     */
    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

}
