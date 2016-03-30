/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * ApplicationGateways resource.
 */
@JsonFlatten
public class ApplicationGateway extends Resource {
    /**
     * Gets or sets sku of application gateway resource.
     */
    @JsonProperty(value = "properties.sku")
    private ApplicationGatewaySku sku;

    /**
     * Gets operational state of application gateway resource. Possible values
     * include: 'Stopped', 'Starting', 'Running', 'Stopping'.
     */
    @JsonProperty(value = "properties.operationalState", access = JsonProperty.Access.WRITE_ONLY)
    private String operationalState;

    /**
     * Gets or sets subnets of application gateway resource.
     */
    @JsonProperty(value = "properties.gatewayIPConfigurations")
    private List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations;

    /**
     * Gets or sets ssl certificates of application gateway resource.
     */
    @JsonProperty(value = "properties.sslCertificates")
    private List<ApplicationGatewaySslCertificate> sslCertificates;

    /**
     * Gets or sets frontend IP addresses of application gateway resource.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations;

    /**
     * Gets or sets frontend ports of application gateway resource.
     */
    @JsonProperty(value = "properties.frontendPorts")
    private List<ApplicationGatewayFrontendPort> frontendPorts;

    /**
     * Gets or sets probes of application gateway resource.
     */
    @JsonProperty(value = "properties.probes")
    private List<ApplicationGatewayProbe> probes;

    /**
     * Gets or sets backend address pool of application gateway resource.
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<ApplicationGatewayBackendAddressPool> backendAddressPools;

    /**
     * Gets or sets backend http settings of application gateway resource.
     */
    @JsonProperty(value = "properties.backendHttpSettingsCollection")
    private List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection;

    /**
     * Gets or sets HTTP listeners of application gateway resource.
     */
    @JsonProperty(value = "properties.httpListeners")
    private List<ApplicationGatewayHttpListener> httpListeners;

    /**
     * Gets or sets URL path map of application gateway resource.
     */
    @JsonProperty(value = "properties.urlPathMaps")
    private List<ApplicationGatewayUrlPathMap> urlPathMaps;

    /**
     * Gets or sets request routing rules of application gateway resource.
     */
    @JsonProperty(value = "properties.requestRoutingRules")
    private List<ApplicationGatewayRequestRoutingRule> requestRoutingRules;

    /**
     * Gets or sets resource guid property of the ApplicationGateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the ApplicationGateway resource
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
     * Get the sku value.
     *
     * @return the sku value
     */
    public ApplicationGatewaySku getSku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     */
    public void setSku(ApplicationGatewaySku sku) {
        this.sku = sku;
    }

    /**
     * Get the operationalState value.
     *
     * @return the operationalState value
     */
    public String getOperationalState() {
        return this.operationalState;
    }

    /**
     * Get the gatewayIPConfigurations value.
     *
     * @return the gatewayIPConfigurations value
     */
    public List<ApplicationGatewayIPConfiguration> getGatewayIPConfigurations() {
        return this.gatewayIPConfigurations;
    }

    /**
     * Set the gatewayIPConfigurations value.
     *
     * @param gatewayIPConfigurations the gatewayIPConfigurations value to set
     */
    public void setGatewayIPConfigurations(List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations) {
        this.gatewayIPConfigurations = gatewayIPConfigurations;
    }

    /**
     * Get the sslCertificates value.
     *
     * @return the sslCertificates value
     */
    public List<ApplicationGatewaySslCertificate> getSslCertificates() {
        return this.sslCertificates;
    }

    /**
     * Set the sslCertificates value.
     *
     * @param sslCertificates the sslCertificates value to set
     */
    public void setSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates) {
        this.sslCertificates = sslCertificates;
    }

    /**
     * Get the frontendIPConfigurations value.
     *
     * @return the frontendIPConfigurations value
     */
    public List<ApplicationGatewayFrontendIPConfiguration> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set the frontendIPConfigurations value.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to set
     */
    public void setFrontendIPConfigurations(List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
    }

    /**
     * Get the frontendPorts value.
     *
     * @return the frontendPorts value
     */
    public List<ApplicationGatewayFrontendPort> getFrontendPorts() {
        return this.frontendPorts;
    }

    /**
     * Set the frontendPorts value.
     *
     * @param frontendPorts the frontendPorts value to set
     */
    public void setFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        this.frontendPorts = frontendPorts;
    }

    /**
     * Get the probes value.
     *
     * @return the probes value
     */
    public List<ApplicationGatewayProbe> getProbes() {
        return this.probes;
    }

    /**
     * Set the probes value.
     *
     * @param probes the probes value to set
     */
    public void setProbes(List<ApplicationGatewayProbe> probes) {
        this.probes = probes;
    }

    /**
     * Get the backendAddressPools value.
     *
     * @return the backendAddressPools value
     */
    public List<ApplicationGatewayBackendAddressPool> getBackendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools value.
     *
     * @param backendAddressPools the backendAddressPools value to set
     */
    public void setBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
    }

    /**
     * Get the backendHttpSettingsCollection value.
     *
     * @return the backendHttpSettingsCollection value
     */
    public List<ApplicationGatewayBackendHttpSettings> getBackendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }

    /**
     * Set the backendHttpSettingsCollection value.
     *
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection value to set
     */
    public void setBackendHttpSettingsCollection(List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
    }

    /**
     * Get the httpListeners value.
     *
     * @return the httpListeners value
     */
    public List<ApplicationGatewayHttpListener> getHttpListeners() {
        return this.httpListeners;
    }

    /**
     * Set the httpListeners value.
     *
     * @param httpListeners the httpListeners value to set
     */
    public void setHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        this.httpListeners = httpListeners;
    }

    /**
     * Get the urlPathMaps value.
     *
     * @return the urlPathMaps value
     */
    public List<ApplicationGatewayUrlPathMap> getUrlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set the urlPathMaps value.
     *
     * @param urlPathMaps the urlPathMaps value to set
     */
    public void setUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
    }

    /**
     * Get the requestRoutingRules value.
     *
     * @return the requestRoutingRules value
     */
    public List<ApplicationGatewayRequestRoutingRule> getRequestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set the requestRoutingRules value.
     *
     * @param requestRoutingRules the requestRoutingRules value to set
     */
    public void setRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
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
