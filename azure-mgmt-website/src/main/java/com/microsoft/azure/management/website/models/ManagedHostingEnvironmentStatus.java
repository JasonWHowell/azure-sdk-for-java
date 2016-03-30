/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ManagedHostingEnvironmentStatus.
 */
public enum ManagedHostingEnvironmentStatus {
    /** Enum value Preparing. */
    PREPARING("Preparing"),

    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Deleting. */
    DELETING("Deleting");

    /** The actual serialized value for a ManagedHostingEnvironmentStatus instance. */
    private String value;

    ManagedHostingEnvironmentStatus(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a ManagedHostingEnvironmentStatus instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a ManagedHostingEnvironmentStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ManagedHostingEnvironmentStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static ManagedHostingEnvironmentStatus fromValue(String value) {
        ManagedHostingEnvironmentStatus[] items = ManagedHostingEnvironmentStatus.values();
        for (ManagedHostingEnvironmentStatus item : items) {
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
