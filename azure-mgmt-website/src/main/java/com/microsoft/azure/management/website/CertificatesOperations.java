/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.Certificate;
import com.microsoft.azure.management.website.models.CertificateCollection;
import com.microsoft.azure.management.website.models.Csr;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in CertificatesOperations.
 */
public interface CertificatesOperations {
    /**
     * Get certificates for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CertificateCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CertificateCollection> getCertificates(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get certificates for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getCertificatesAsync(String resourceGroupName, final ServiceCallback<CertificateCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get a certificate by certificate name for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Certificate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Certificate> getCertificate(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a certificate by certificate name for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getCertificateAsync(String resourceGroupName, String name, final ServiceCallback<Certificate> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate if it exists already.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Certificate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Certificate> createOrUpdateCertificate(String resourceGroupName, String name, Certificate certificateEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate if it exists already.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateCertificateAsync(String resourceGroupName, String name, Certificate certificateEnvelope, final ServiceCallback<Certificate> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete a certificate by name in a specificed subscription and resourcegroup.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate to be deleted.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteCertificate(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a certificate by name in a specificed subscription and resourcegroup.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteCertificateAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate if it exists already.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Certificate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Certificate> updateCertificate(String resourceGroupName, String name, Certificate certificateEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param certificateEnvelope Details of certificate if it exists already.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateCertificateAsync(String resourceGroupName, String name, Certificate certificateEnvelope, final ServiceCallback<Certificate> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the certificate signing requests for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Csr&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Csr>> getCsrs(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the certificate signing requests for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getCsrsAsync(String resourceGroupName, final ServiceCallback<List<Csr>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a certificate signing request by certificate name for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Csr object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Csr> getCsr(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a certificate signing request by certificate name for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getCsrAsync(String resourceGroupName, String name, final ServiceCallback<Csr> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate signing request.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param csrEnvelope Details of certificate signing request if it exists already.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Csr object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Csr> createOrUpdateCsr(String resourceGroupName, String name, Csr csrEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate signing request.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param csrEnvelope Details of certificate signing request if it exists already.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateCsrAsync(String resourceGroupName, String name, Csr csrEnvelope, final ServiceCallback<Csr> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete the certificate signing request.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate signing request.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteCsr(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete the certificate signing request.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate signing request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteCsrAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate signing request.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param csrEnvelope Details of certificate signing request if it exists already.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Csr object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Csr> updateCsr(String resourceGroupName, String name, Csr csrEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates or modifies an existing certificate signing request.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the certificate.
     * @param csrEnvelope Details of certificate signing request if it exists already.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateCsrAsync(String resourceGroupName, String name, Csr csrEnvelope, final ServiceCallback<Csr> serviceCallback) throws IllegalArgumentException;

}
