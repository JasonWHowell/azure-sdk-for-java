/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A NetworkInterface in a resource group.
 */
@JsonFlatten
public class NetworkInterface extends Resource {
    /**
     * Gets or sets the reference of a VirtualMachine.
     */
    @JsonProperty(value = "properties.virtualMachine")
    private SubResource virtualMachine;

    /**
     * Gets or sets the reference of the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroup networkSecurityGroup;

    /**
     * Gets or sets list of IPConfigurations of the NetworkInterface.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<NetworkInterfaceIPConfiguration> ipConfigurations;

    /**
     * Gets or sets DNS Settings in  NetworkInterface.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private NetworkInterfaceDnsSettings dnsSettings;

    /**
     * Gets the MAC Address of the network interface.
     */
    @JsonProperty(value = "properties.macAddress")
    private String macAddress;

    /**
     * Gets whether this is a primary NIC on a virtual machine.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /**
     * Gets or sets whether IPForwarding is enabled on the NIC.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIPForwarding;

    /**
     * Gets or sets resource guid property of the network interface resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    private String etag;

    /**
     * Get the virtualMachine value.
     *
     * @return the virtualMachine value
     */
    public SubResource getVirtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Set the virtualMachine value.
     *
     * @param virtualMachine the virtualMachine value to set
     */
    public void setVirtualMachine(SubResource virtualMachine) {
        this.virtualMachine = virtualMachine;
    }

    /**
     * Get the networkSecurityGroup value.
     *
     * @return the networkSecurityGroup value
     */
    public NetworkSecurityGroup getNetworkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup value.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set
     */
    public void setNetworkSecurityGroup(NetworkSecurityGroup networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
    }

    /**
     * Get the ipConfigurations value.
     *
     * @return the ipConfigurations value
     */
    public List<NetworkInterfaceIPConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations value.
     *
     * @param ipConfigurations the ipConfigurations value to set
     */
    public void setIpConfigurations(List<NetworkInterfaceIPConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
    }

    /**
     * Get the dnsSettings value.
     *
     * @return the dnsSettings value
     */
    public NetworkInterfaceDnsSettings getDnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings value.
     *
     * @param dnsSettings the dnsSettings value to set
     */
    public void setDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
    }

    /**
     * Get the macAddress value.
     *
     * @return the macAddress value
     */
    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress value.
     *
     * @param macAddress the macAddress value to set
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * Get the primary value.
     *
     * @return the primary value
     */
    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * Set the primary value.
     *
     * @param primary the primary value to set
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * Get the enableIPForwarding value.
     *
     * @return the enableIPForwarding value
     */
    public Boolean getEnableIPForwarding() {
        return this.enableIPForwarding;
    }

    /**
     * Set the enableIPForwarding value.
     *
     * @param enableIPForwarding the enableIPForwarding value to set
     */
    public void setEnableIPForwarding(Boolean enableIPForwarding) {
        this.enableIPForwarding = enableIPForwarding;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set
     */
    public void setResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
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
