/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import java.util.List;

/**
 * The ResourceManagementErrorWithDetails model.
 */
public class ResourceManagementErrorWithDetails extends ResourceManagementError {
    /**
     * Gets or sets validation error.
     */
    private List<ResourceManagementError> details;

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<ResourceManagementError> getDetails() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     */
    public void setDetails(List<ResourceManagementError> details) {
        this.details = details;
    }

}
