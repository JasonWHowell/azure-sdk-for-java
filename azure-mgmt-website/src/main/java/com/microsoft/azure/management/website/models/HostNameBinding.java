/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A host name binding object.
 */
@JsonFlatten
public class HostNameBinding extends Resource {
    /**
     * Hostname.
     */
    @JsonProperty(value = "properties.name")
    private String hostNameBindingName;

    /**
     * Web app name.
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /**
     * Fully qualified ARM domain resource URI.
     */
    @JsonProperty(value = "properties.domainId")
    private String domainId;

    /**
     * Azure resource name.
     */
    @JsonProperty(value = "properties.azureResourceName")
    private String azureResourceName;

    /**
     * Azure resource type. Possible values include: 'Website',
     * 'TrafficManager'.
     */
    @JsonProperty(value = "properties.azureResourceType")
    private AzureResourceType azureResourceType;

    /**
     * Custom DNS record type. Possible values include: 'CName', 'A'.
     */
    @JsonProperty(value = "properties.customHostNameDnsRecordType")
    private CustomHostNameDnsRecordType customHostNameDnsRecordType;

    /**
     * Host name type. Possible values include: 'Verified', 'Managed'.
     */
    @JsonProperty(value = "properties.hostNameType")
    private HostNameType hostNameType;

    /**
     * Get the hostNameBindingName value.
     *
     * @return the hostNameBindingName value
     */
    public String getHostNameBindingName() {
        return this.hostNameBindingName;
    }

    /**
     * Set the hostNameBindingName value.
     *
     * @param hostNameBindingName the hostNameBindingName value to set
     */
    public void setHostNameBindingName(String hostNameBindingName) {
        this.hostNameBindingName = hostNameBindingName;
    }

    /**
     * Get the siteName value.
     *
     * @return the siteName value
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * Set the siteName value.
     *
     * @param siteName the siteName value to set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Get the domainId value.
     *
     * @return the domainId value
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * Set the domainId value.
     *
     * @param domainId the domainId value to set
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * Get the azureResourceName value.
     *
     * @return the azureResourceName value
     */
    public String getAzureResourceName() {
        return this.azureResourceName;
    }

    /**
     * Set the azureResourceName value.
     *
     * @param azureResourceName the azureResourceName value to set
     */
    public void setAzureResourceName(String azureResourceName) {
        this.azureResourceName = azureResourceName;
    }

    /**
     * Get the azureResourceType value.
     *
     * @return the azureResourceType value
     */
    public AzureResourceType getAzureResourceType() {
        return this.azureResourceType;
    }

    /**
     * Set the azureResourceType value.
     *
     * @param azureResourceType the azureResourceType value to set
     */
    public void setAzureResourceType(AzureResourceType azureResourceType) {
        this.azureResourceType = azureResourceType;
    }

    /**
     * Get the customHostNameDnsRecordType value.
     *
     * @return the customHostNameDnsRecordType value
     */
    public CustomHostNameDnsRecordType getCustomHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType;
    }

    /**
     * Set the customHostNameDnsRecordType value.
     *
     * @param customHostNameDnsRecordType the customHostNameDnsRecordType value to set
     */
    public void setCustomHostNameDnsRecordType(CustomHostNameDnsRecordType customHostNameDnsRecordType) {
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
    }

    /**
     * Get the hostNameType value.
     *
     * @return the hostNameType value
     */
    public HostNameType getHostNameType() {
        return this.hostNameType;
    }

    /**
     * Set the hostNameType value.
     *
     * @param hostNameType the hostNameType value to set
     */
    public void setHostNameType(HostNameType hostNameType) {
        this.hostNameType = hostNameType;
    }

}
