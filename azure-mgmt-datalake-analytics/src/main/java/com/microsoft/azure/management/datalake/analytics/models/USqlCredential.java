/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL credential item.
 */
public class USqlCredential extends CatalogItem {
    /**
     * Gets or sets the name of the database the credential is in.
     */
    private String databaseName;

    /**
     * Gets or sets the name of the secret associated with the credential.
     */
    private String identity;

    /**
     * Gets or sets the name of the credential.
     */
    @JsonProperty(value = "credentialName")
    private String name;

    /**
     * Gets or sets the user name associated with the credential.
     */
    private String userName;

    /**
     * Get the databaseName value.
     *
     * @return the databaseName value
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName value.
     *
     * @param databaseName the databaseName value to set
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     */
    public void setIdentity(String identity) {
        this.identity = identity;
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
     * Get the userName value.
     *
     * @return the userName value
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Set the userName value.
     *
     * @param userName the userName value to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
