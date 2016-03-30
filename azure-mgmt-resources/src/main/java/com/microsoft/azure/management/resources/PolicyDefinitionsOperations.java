/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.resources.models.PolicyDefinition;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in PolicyDefinitionsOperations.
 */
public interface PolicyDefinitionsOperations {
    /**
     * Create or update policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param parameters The policy definition properties
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyDefinition object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyDefinition> createOrUpdate(String policyDefinitionName, PolicyDefinition parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param parameters The policy definition properties
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String policyDefinitionName, PolicyDefinition parameters, final ServiceCallback<PolicyDefinition> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyDefinition object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyDefinition> get(String policyDefinitionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String policyDefinitionName, final ServiceCallback<PolicyDefinition> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String policyDefinitionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String policyDefinitionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
