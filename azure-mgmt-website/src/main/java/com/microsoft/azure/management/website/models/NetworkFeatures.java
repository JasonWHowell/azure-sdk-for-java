/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * This is an object used to store a full view of network features (presently
 * VNET integration and Hybrid Connections)
 * for a web app.
 */
@JsonFlatten
public class NetworkFeatures extends Resource {
    /**
     * The Vnet Name.
     */
    @JsonProperty(value = "properties.virtualNetworkName")
    private String virtualNetworkName;

    /**
     * The Vnet Summary view.
     */
    @JsonProperty(value = "properties.virtualNetworkConnection")
    private VnetInfo virtualNetworkConnection;

    /**
     * The Hybrid Connections Summary view.
     */
    @JsonProperty(value = "properties.hybridConnections")
    private List<RelayServiceConnectionEntity> hybridConnections;

    /**
     * Get the virtualNetworkName value.
     *
     * @return the virtualNetworkName value
     */
    public String getVirtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     * Set the virtualNetworkName value.
     *
     * @param virtualNetworkName the virtualNetworkName value to set
     */
    public void setVirtualNetworkName(String virtualNetworkName) {
        this.virtualNetworkName = virtualNetworkName;
    }

    /**
     * Get the virtualNetworkConnection value.
     *
     * @return the virtualNetworkConnection value
     */
    public VnetInfo getVirtualNetworkConnection() {
        return this.virtualNetworkConnection;
    }

    /**
     * Set the virtualNetworkConnection value.
     *
     * @param virtualNetworkConnection the virtualNetworkConnection value to set
     */
    public void setVirtualNetworkConnection(VnetInfo virtualNetworkConnection) {
        this.virtualNetworkConnection = virtualNetworkConnection;
    }

    /**
     * Get the hybridConnections value.
     *
     * @return the hybridConnections value
     */
    public List<RelayServiceConnectionEntity> getHybridConnections() {
        return this.hybridConnections;
    }

    /**
     * Set the hybridConnections value.
     *
     * @param hybridConnections the hybridConnections value to set
     */
    public void setHybridConnections(List<RelayServiceConnectionEntity> hybridConnections) {
        this.hybridConnections = hybridConnections;
    }

}
