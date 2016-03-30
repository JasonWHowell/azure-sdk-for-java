/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The common Data Lake Analytics job properties.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("JobProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "USql", value = USqlJobProperties.class),
    @JsonSubTypes.Type(name = "Hive", value = HiveJobProperties.class)
})
public class JobProperties {
    /**
     * Gets or sets the runtime version of the U-SQL engine to use.
     */
    private String runtimeVersion;

    /**
     * Gets or sets the U-SQL script to run.
     */
    @JsonProperty(required = true)
    private String script;

    /**
     * Get the runtimeVersion value.
     *
     * @return the runtimeVersion value
     */
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion value.
     *
     * @param runtimeVersion the runtimeVersion value to set
     */
    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * Get the script value.
     *
     * @return the script value
     */
    public String getScript() {
        return this.script;
    }

    /**
     * Set the script value.
     *
     * @param script the script value to set
     */
    public void setScript(String script) {
        this.script = script;
    }

}
