/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;


/**
 * A Data Lake Analytics catalog U-SQL dependency information item.
 */
public class USqlAssemblyDependencyInfo {
    /**
     * Gets or sets the EntityId of the dependency.
     */
    private EntityId entityId;

    /**
     * Get the entityId value.
     *
     * @return the entityId value
     */
    public EntityId getEntityId() {
        return this.entityId;
    }

    /**
     * Set the entityId value.
     *
     * @param entityId the entityId value to set
     */
    public void setEntityId(EntityId entityId) {
        this.entityId = entityId;
    }

}
