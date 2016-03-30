/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * The instance view of a virtual machine extension.
 */
public class VirtualMachineExtensionInstanceView {
    /**
     * Gets or sets the virtual machine extension name.
     */
    private String name;

    /**
     * Gets or sets the full type of the extension handler which includes both
     * publisher and type.
     */
    private String type;

    /**
     * Gets or sets the type version of the extension handler.
     */
    private String typeHandlerVersion;

    /**
     * Gets or sets the resource status information.
     */
    private List<InstanceViewStatus> substatuses;

    /**
     * Gets or sets the resource status information.
     */
    private List<InstanceViewStatus> statuses;

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
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the typeHandlerVersion value.
     *
     * @return the typeHandlerVersion value
     */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion value.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     */
    public void setTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Get the substatuses value.
     *
     * @return the substatuses value
     */
    public List<InstanceViewStatus> getSubstatuses() {
        return this.substatuses;
    }

    /**
     * Set the substatuses value.
     *
     * @param substatuses the substatuses value to set
     */
    public void setSubstatuses(List<InstanceViewStatus> substatuses) {
        this.substatuses = substatuses;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> getStatuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     */
    public void setStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
    }

}
