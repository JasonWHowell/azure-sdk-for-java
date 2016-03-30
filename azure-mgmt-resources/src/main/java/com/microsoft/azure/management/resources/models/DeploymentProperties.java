/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Deployment properties.
 */
public class DeploymentProperties {
    /**
     * Gets or sets the template content. Use only one of Template or
     * TemplateLink.
     */
    private Object template;

    /**
     * Gets or sets the URI referencing the template. Use only one of Template
     * or TemplateLink.
     */
    private TemplateLink templateLink;

    /**
     * Deployment parameters. Use only one of Parameters or ParametersLink.
     */
    private Object parameters;

    /**
     * Gets or sets the URI referencing the parameters. Use only one of
     * Parameters or ParametersLink.
     */
    private ParametersLink parametersLink;

    /**
     * Gets or sets the deployment mode. Possible values include:
     * 'Incremental', 'Complete'.
     */
    private DeploymentMode mode;

    /**
     * Get the template value.
     *
     * @return the template value
     */
    public Object getTemplate() {
        return this.template;
    }

    /**
     * Set the template value.
     *
     * @param template the template value to set
     */
    public void setTemplate(Object template) {
        this.template = template;
    }

    /**
     * Get the templateLink value.
     *
     * @return the templateLink value
     */
    public TemplateLink getTemplateLink() {
        return this.templateLink;
    }

    /**
     * Set the templateLink value.
     *
     * @param templateLink the templateLink value to set
     */
    public void setTemplateLink(TemplateLink templateLink) {
        this.templateLink = templateLink;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public Object getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters value.
     *
     * @param parameters the parameters value to set
     */
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    /**
     * Get the parametersLink value.
     *
     * @return the parametersLink value
     */
    public ParametersLink getParametersLink() {
        return this.parametersLink;
    }

    /**
     * Set the parametersLink value.
     *
     * @param parametersLink the parametersLink value to set
     */
    public void setParametersLink(ParametersLink parametersLink) {
        this.parametersLink = parametersLink;
    }

    /**
     * Get the mode value.
     *
     * @return the mode value
     */
    public DeploymentMode getMode() {
        return this.mode;
    }

    /**
     * Set the mode value.
     *
     * @param mode the mode value to set
     */
    public void setMode(DeploymentMode mode) {
        this.mode = mode;
    }

}
