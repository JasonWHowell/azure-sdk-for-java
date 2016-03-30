/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Classic Administrator properties.
 */
public class ClassicAdministratorProperties {
    /**
     * Gets or sets the email address.
     */
    private String emailAddress;

    /**
     * Gets or sets the role.
     */
    private String role;

    /**
     * Get the emailAddress value.
     *
     * @return the emailAddress value
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress value.
     *
     * @param emailAddress the emailAddress value to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Get the role value.
     *
     * @return the role value
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Set the role value.
     *
     * @param role the role value to set
     */
    public void setRole(String role) {
        this.role = role;
    }

}
