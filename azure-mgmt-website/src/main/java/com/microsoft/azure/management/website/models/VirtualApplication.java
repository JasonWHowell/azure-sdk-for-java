/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * The VirtualApplication model.
 */
public class VirtualApplication {
    /**
     * The virtualPath property.
     */
    private String virtualPath;

    /**
     * The physicalPath property.
     */
    private String physicalPath;

    /**
     * The preloadEnabled property.
     */
    private Boolean preloadEnabled;

    /**
     * The virtualDirectories property.
     */
    private List<VirtualDirectory> virtualDirectories;

    /**
     * Get the virtualPath value.
     *
     * @return the virtualPath value
     */
    public String getVirtualPath() {
        return this.virtualPath;
    }

    /**
     * Set the virtualPath value.
     *
     * @param virtualPath the virtualPath value to set
     */
    public void setVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
    }

    /**
     * Get the physicalPath value.
     *
     * @return the physicalPath value
     */
    public String getPhysicalPath() {
        return this.physicalPath;
    }

    /**
     * Set the physicalPath value.
     *
     * @param physicalPath the physicalPath value to set
     */
    public void setPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath;
    }

    /**
     * Get the preloadEnabled value.
     *
     * @return the preloadEnabled value
     */
    public Boolean getPreloadEnabled() {
        return this.preloadEnabled;
    }

    /**
     * Set the preloadEnabled value.
     *
     * @param preloadEnabled the preloadEnabled value to set
     */
    public void setPreloadEnabled(Boolean preloadEnabled) {
        this.preloadEnabled = preloadEnabled;
    }

    /**
     * Get the virtualDirectories value.
     *
     * @return the virtualDirectories value
     */
    public List<VirtualDirectory> getVirtualDirectories() {
        return this.virtualDirectories;
    }

    /**
     * Set the virtualDirectories value.
     *
     * @param virtualDirectories the virtualDirectories value to set
     */
    public void setVirtualDirectories(List<VirtualDirectory> virtualDirectories) {
        this.virtualDirectories = virtualDirectories;
    }

}
