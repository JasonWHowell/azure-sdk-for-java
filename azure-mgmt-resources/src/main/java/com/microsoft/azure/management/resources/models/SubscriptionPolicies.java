/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Subscription policies.
 */
public class SubscriptionPolicies {
    /**
     * Gets or sets the subscription location placement Id.
     */
    private String locationPlacementId;

    /**
     * Gets or sets the subscription quota Id.
     */
    private String quotaId;

    /**
     * Get the locationPlacementId value.
     *
     * @return the locationPlacementId value
     */
    public String getLocationPlacementId() {
        return this.locationPlacementId;
    }

    /**
     * Set the locationPlacementId value.
     *
     * @param locationPlacementId the locationPlacementId value to set
     */
    public void setLocationPlacementId(String locationPlacementId) {
        this.locationPlacementId = locationPlacementId;
    }

    /**
     * Get the quotaId value.
     *
     * @return the quotaId value
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * Set the quotaId value.
     *
     * @param quotaId the quotaId value to set
     */
    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

}
