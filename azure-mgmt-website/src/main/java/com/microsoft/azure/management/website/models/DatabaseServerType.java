/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DatabaseServerType.
 */
public enum DatabaseServerType {
    /** Enum value MySql. */
    MYSQL("MySql"),

    /** Enum value SQLServer. */
    SQLSERVER("SQLServer"),

    /** Enum value SQLAzure. */
    SQLAZURE("SQLAzure"),

    /** Enum value Custom. */
    CUSTOM("Custom");

    /** The actual serialized value for a DatabaseServerType instance. */
    private String value;

    DatabaseServerType(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a DatabaseServerType instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a DatabaseServerType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DatabaseServerType object, or null if unable to parse.
     */
    @JsonCreator
    public static DatabaseServerType fromValue(String value) {
        DatabaseServerType[] items = DatabaseServerType.values();
        for (DatabaseServerType item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}
