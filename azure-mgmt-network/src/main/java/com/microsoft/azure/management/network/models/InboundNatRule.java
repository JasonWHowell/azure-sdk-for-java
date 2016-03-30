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
 * Inbound NAT rule of the loadbalancer.
 */
@JsonFlatten
public class InboundNatRule extends SubResource {
    /**
     * Gets or sets a reference to frontend IP Addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * Gets or sets a reference to a private ip address defined on a
     * NetworkInterface of a VM. Traffic sent to frontendPort of each of the
     * frontendIPConfigurations is forwarded to the backed IP.
     */
    @JsonProperty(value = "properties.backendIPConfiguration")
    private NetworkInterfaceIPConfiguration backendIPConfiguration;

    /**
     * Gets or sets the transport potocol for the external endpoint. Possible
     * values are Udp or Tcp. Possible values include: 'Udp', 'Tcp'.
     */
    @JsonProperty(value = "properties.protocol")
    private String protocol;

    /**
     * Gets or sets the port for the external endpoint. You can spcify any
     * port number you choose, but the port numbers specified for each role
     * in the service must be unique. Possible values range between 1 and
     * 65535, inclusive.
     */
    @JsonProperty(value = "properties.frontendPort")
    private Integer frontendPort;

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
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /**
     * Gets or sets the timeout for the Tcp idle connection. The value can be
     * set between 4 and 30 minutes. The default value is 4 minutes. This
     * emlement is only used when the protocol is set to Tcp.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn availability Group. This setting
     * is required when using the SQL Always ON availability Groups in SQL
     * server. This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP")
    private Boolean enableFloatingIP;

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
     * Get the backendIPConfiguration value.
     *
     * @return the backendIPConfiguration value
     */
    public NetworkInterfaceIPConfiguration getBackendIPConfiguration() {
        return this.backendIPConfiguration;
    }

    /**
     * Set the backendIPConfiguration value.
     *
     * @param backendIPConfiguration the backendIPConfiguration value to set
     */
    public void setBackendIPConfiguration(NetworkInterfaceIPConfiguration backendIPConfiguration) {
        this.backendIPConfiguration = backendIPConfiguration;
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
     * Get the frontendPort value.
     *
     * @return the frontendPort value
     */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort value.
     *
     * @param frontendPort the frontendPort value to set
     */
    public void setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
    }

    /**
     * Get the backendPort value.
     *
     * @return the backendPort value
     */
    public Integer getBackendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort value.
     *
     * @param backendPort the backendPort value to set
     */
    public void setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
    }

    /**
     * Get the idleTimeoutInMinutes value.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes value.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     */
    public void setIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
    }

    /**
     * Get the enableFloatingIP value.
     *
     * @return the enableFloatingIP value
     */
    public Boolean getEnableFloatingIP() {
        return this.enableFloatingIP;
    }

    /**
     * Set the enableFloatingIP value.
     *
     * @param enableFloatingIP the enableFloatingIP value to set
     */
    public void setEnableFloatingIP(Boolean enableFloatingIP) {
        this.enableFloatingIP = enableFloatingIP;
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
