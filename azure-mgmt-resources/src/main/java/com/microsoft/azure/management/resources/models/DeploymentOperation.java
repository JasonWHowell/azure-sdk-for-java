/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Deployment operation information.
 */
public class DeploymentOperation {
    /**
     * Gets or sets full deployment operation id.
     */
    private String id;

    /**
     * Gets or sets deployment operation id.
     */
    private String operationId;

    /**
     * Gets or sets deployment properties.
     */
    private DeploymentOperationProperties properties;

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
     * Get the operationId value.
     *
     * @return the operationId value
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId value.
     *
     * @param operationId the operationId value to set
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DeploymentOperationProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(DeploymentOperationProperties properties) {
        this.properties = properties;
    }

}
