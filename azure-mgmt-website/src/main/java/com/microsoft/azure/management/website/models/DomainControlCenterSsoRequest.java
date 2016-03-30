/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;


/**
 * Single sign on request information for domain management.
 */
public class DomainControlCenterSsoRequest {
    /**
     * Url where the single sign on request is to be made.
     */
    private String url;

    /**
     * Post parameter key.
     */
    private String postParameterKey;

    /**
     * Post parameter value. Client should use
     * 'application/x-www-form-urlencoded' encoding for this value.
     */
    private String postParameterValue;

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get the postParameterKey value.
     *
     * @return the postParameterKey value
     */
    public String getPostParameterKey() {
        return this.postParameterKey;
    }

    /**
     * Set the postParameterKey value.
     *
     * @param postParameterKey the postParameterKey value to set
     */
    public void setPostParameterKey(String postParameterKey) {
        this.postParameterKey = postParameterKey;
    }

    /**
     * Get the postParameterValue value.
     *
     * @return the postParameterValue value
     */
    public String getPostParameterValue() {
        return this.postParameterValue;
    }

    /**
     * Set the postParameterValue value.
     *
     * @param postParameterValue the postParameterValue value to set
     */
    public void setPostParameterValue(String postParameterValue) {
        this.postParameterValue = postParameterValue;
    }

}
