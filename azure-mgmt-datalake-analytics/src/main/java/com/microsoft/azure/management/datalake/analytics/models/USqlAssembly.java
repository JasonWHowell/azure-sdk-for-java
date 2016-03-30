/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL Assembly.
 */
public class USqlAssembly extends CatalogItem {
    /**
     * Gets or sets the name of the database.
     */
    private String databaseName;

    /**
     * Gets or sets the name of the assembly.
     */
    @JsonProperty(value = "assemblyName")
    private String name;

    /**
     * Gets or sets the name of the CLR.
     */
    private String clrName;

    /**
     * Gets or sets the switch indicating if this assembly is visible or not.
     */
    private Boolean isVisible;

    /**
     * Gets or sets the switch indicating if this assembly is user defined or
     * not.
     */
    private Boolean isUserDefined;

    /**
     * Gets or sets the list of files associated with the assembly.
     */
    private List<USqlAssemblyFileInfo> files;

    /**
     * Gets or sets the list of dependencies associated with the assembly.
     */
    private List<USqlAssemblyDependencyInfo> dependencies;

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
     * Get the clrName value.
     *
     * @return the clrName value
     */
    public String getClrName() {
        return this.clrName;
    }

    /**
     * Set the clrName value.
     *
     * @param clrName the clrName value to set
     */
    public void setClrName(String clrName) {
        this.clrName = clrName;
    }

    /**
     * Get the isVisible value.
     *
     * @return the isVisible value
     */
    public Boolean getIsVisible() {
        return this.isVisible;
    }

    /**
     * Set the isVisible value.
     *
     * @param isVisible the isVisible value to set
     */
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * Get the isUserDefined value.
     *
     * @return the isUserDefined value
     */
    public Boolean getIsUserDefined() {
        return this.isUserDefined;
    }

    /**
     * Set the isUserDefined value.
     *
     * @param isUserDefined the isUserDefined value to set
     */
    public void setIsUserDefined(Boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
    }

    /**
     * Get the files value.
     *
     * @return the files value
     */
    public List<USqlAssemblyFileInfo> getFiles() {
        return this.files;
    }

    /**
     * Set the files value.
     *
     * @param files the files value to set
     */
    public void setFiles(List<USqlAssemblyFileInfo> files) {
        this.files = files;
    }

    /**
     * Get the dependencies value.
     *
     * @return the dependencies value
     */
    public List<USqlAssemblyDependencyInfo> getDependencies() {
        return this.dependencies;
    }

    /**
     * Set the dependencies value.
     *
     * @param dependencies the dependencies value to set
     */
    public void setDependencies(List<USqlAssemblyDependencyInfo> dependencies) {
        this.dependencies = dependencies;
    }

}
