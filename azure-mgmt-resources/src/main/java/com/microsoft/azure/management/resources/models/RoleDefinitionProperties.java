/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;

import java.util.List;

/**
 * Role definition properties.
 */
public class RoleDefinitionProperties {
    /**
     * Gets or sets role name.
     */
    private String roleName;

    /**
     * Gets or sets role definition description.
     */
    private String description;

    /**
     * Gets or sets role type.
     */
    private String type;

    /**
     * Gets or sets role definition permissions.
     */
    private List<Permission> permissions;

    /**
     * Gets or sets role definition assignable scopes.
     */
    private List<String> assignableScopes;

    /**
     * Get the roleName value.
     *
     * @return the roleName value
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * Set the roleName value.
     *
     * @param roleName the roleName value to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the permissions value.
     *
     * @return the permissions value
     */
    public List<Permission> getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions value.
     *
     * @param permissions the permissions value to set
     */
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    /**
     * Get the assignableScopes value.
     *
     * @return the assignableScopes value
     */
    public List<String> getAssignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set the assignableScopes value.
     *
     * @param assignableScopes the assignableScopes value to set
     */
    public void setAssignableScopes(List<String> assignableScopes) {
        this.assignableScopes = assignableScopes;
    }

}
