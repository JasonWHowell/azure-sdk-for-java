/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Inbound NAT pool of the loadbalancer.
 */
@JsonFlatten
public class InboundNatPool extends SubResource {
    /**
     * Gets or sets a reference to frontend IP Addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * Gets or sets the transport potocol for the external endpoint. Possible
     * values are Udp or Tcp. Possible values include: 'Udp', 'Tcp'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private String protocol;

    /**
     * Gets or sets the starting port range for the NAT pool. You can spcify
     * any port number you choose, but the port numbers specified for each
     * role in the service must be unique. Possible values range between 1
     * and 65535, inclusive.
     */
    @JsonProperty(value = "properties.frontendPortRangeStart", required = true)
    private int frontendPortRangeStart;

    /**
     * Gets or sets the ending port range for the NAT pool. You can spcify any
     * port number you choose, but the port numbers specified for each role
     * in the service must be unique. Possible values range between 1 and
     * 65535, inclusive.
     */
    @JsonProperty(value = "properties.frontendPortRangeEnd", required = true)
    private int frontendPortRangeEnd;

    /**
     * Gets or sets a port used for internal connections on the endpoint. The
     * localPort attribute maps the eternal port of the endpoint to an
     * internal port on a role. This is useful in scenarios where a role must
     * communicate to an internal compotnent on a port that is different from
     * the one that is exposed externally. If not specified, the value of
     * localPort is the same as the port attribute. Set the value of
     * localPort to '*' to automatically assign an unallocated port that is
     * discoverable using the runtime API.
     */
    @JsonProperty(value = "properties.backendPort", required = true)
    private int backendPort;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the frontendIPConfiguration value.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource getFrontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set the frontendIPConfiguration value.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     */
    public void setFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the frontendPortRangeStart value.
     *
     * @return the frontendPortRangeStart value
     */
    public int getFrontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Set the frontendPortRangeStart value.
     *
     * @param frontendPortRangeStart the frontendPortRangeStart value to set
     */
    public void setFrontendPortRangeStart(int frontendPortRangeStart) {
        this.frontendPortRangeStart = frontendPortRangeStart;
    }

    /**
     * Get the frontendPortRangeEnd value.
     *
     * @return the frontendPortRangeEnd value
     */
    public int getFrontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Set the frontendPortRangeEnd value.
     *
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set
     */
    public void setFrontendPortRangeEnd(int frontendPortRangeEnd) {
        this.frontendPortRangeEnd = frontendPortRangeEnd;
    }

    /**
     * Get the backendPort value.
     *
     * @return the backendPort value
     */
    public int getBackendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort value.
     *
     * @param backendPort the backendPort value to set
     */
    public void setBackendPort(int backendPort) {
        this.backendPort = backendPort;
    }

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
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

}
