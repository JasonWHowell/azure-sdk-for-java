/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * AutoHealTriggers - describes the triggers for auto-heal.
 */
public class AutoHealTriggers {
    /**
     * Requests - Defines a rule based on total requests.
     */
    private RequestsBasedTrigger requests;

    /**
     * PrivateBytesInKB - Defines a rule based on private bytes.
     */
    private Integer privateBytesInKB;

    /**
     * StatusCodes - Defines a rule based on status codes.
     */
    private List<StatusCodesBasedTrigger> statusCodes;

    /**
     * SlowRequests - Defines a rule based on request execution time.
     */
    private SlowRequestsBasedTrigger slowRequests;

    /**
     * Get the requests value.
     *
     * @return the requests value
     */
    public RequestsBasedTrigger getRequests() {
        return this.requests;
    }

    /**
     * Set the requests value.
     *
     * @param requests the requests value to set
     */
    public void setRequests(RequestsBasedTrigger requests) {
        this.requests = requests;
    }

    /**
     * Get the privateBytesInKB value.
     *
     * @return the privateBytesInKB value
     */
    public Integer getPrivateBytesInKB() {
        return this.privateBytesInKB;
    }

    /**
     * Set the privateBytesInKB value.
     *
     * @param privateBytesInKB the privateBytesInKB value to set
     */
    public void setPrivateBytesInKB(Integer privateBytesInKB) {
        this.privateBytesInKB = privateBytesInKB;
    }

    /**
     * Get the statusCodes value.
     *
     * @return the statusCodes value
     */
    public List<StatusCodesBasedTrigger> getStatusCodes() {
        return this.statusCodes;
    }

    /**
     * Set the statusCodes value.
     *
     * @param statusCodes the statusCodes value to set
     */
    public void setStatusCodes(List<StatusCodesBasedTrigger> statusCodes) {
        this.statusCodes = statusCodes;
    }

    /**
     * Get the slowRequests value.
     *
     * @return the slowRequests value
     */
    public SlowRequestsBasedTrigger getSlowRequests() {
        return this.slowRequests;
    }

    /**
     * Set the slowRequests value.
     *
     * @param slowRequests the slowRequests value to set
     */
    public void setSlowRequests(SlowRequestsBasedTrigger slowRequests) {
        this.slowRequests = slowRequests;
    }

}
