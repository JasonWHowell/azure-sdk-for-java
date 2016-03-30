/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;


/**
 * Contains ServiceProviderProperties in an ExpressRouteCircuit.
 */
public class ExpressRouteCircuitServiceProviderProperties {
    /**
     * Gets or sets serviceProviderName.
     */
    private String serviceProviderName;

    /**
     * Gets or sets peering location.
     */
    private String peeringLocation;

    /**
     * Gets or sets BandwidthInMbps.
     */
    private Integer bandwidthInMbps;

    /**
     * Get the serviceProviderName value.
     *
     * @return the serviceProviderName value
     */
    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

    /**
     * Set the serviceProviderName value.
     *
     * @param serviceProviderName the serviceProviderName value to set
     */
    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    /**
     * Get the peeringLocation value.
     *
     * @return the peeringLocation value
     */
    public String getPeeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation value.
     *
     * @param peeringLocation the peeringLocation value to set
     */
    public void setPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
    }

    /**
     * Get the bandwidthInMbps value.
     *
     * @return the bandwidthInMbps value
     */
    public Integer getBandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Set the bandwidthInMbps value.
     *
     * @param bandwidthInMbps the bandwidthInMbps value to set
     */
    public void setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
    }

}
