/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import org.joda.time.DateTime;

/**
 * Deployment operation properties.
 */
public class DeploymentOperationProperties {
    /**
     * Gets or sets the state of the provisioning.
     */
    private String provisioningState;

    /**
     * Gets or sets the date and time of the operation.
     */
    private DateTime timestamp;

    /**
     * Gets or sets operation status code.
     */
    private String statusCode;

    /**
     * Gets or sets operation status message.
     */
    private Object statusMessage;

    /**
     * Gets or sets the target resource.
     */
    private TargetResource targetResource;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the timestamp value.
     *
     * @return the timestamp value
     */
    public DateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp value.
     *
     * @param timestamp the timestamp value to set
     */
    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Get the statusCode value.
     *
     * @return the statusCode value
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode value.
     *
     * @param statusCode the statusCode value to set
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Get the statusMessage value.
     *
     * @return the statusMessage value
     */
    public Object getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * Set the statusMessage value.
     *
     * @param statusMessage the statusMessage value to set
     */
    public void setStatusMessage(Object statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * Get the targetResource value.
     *
     * @return the targetResource value
     */
    public TargetResource getTargetResource() {
        return this.targetResource;
    }

    /**
     * Set the targetResource value.
     *
     * @param targetResource the targetResource value to set
     */
    public void setTargetResource(TargetResource targetResource) {
        this.targetResource = targetResource;
    }

}
