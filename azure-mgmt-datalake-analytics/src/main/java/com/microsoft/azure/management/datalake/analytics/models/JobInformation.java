/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.UUID;
import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The common Data Lake Analytics job information properties.
 */
public class JobInformation {
    /**
     * Gets or sets the job's unique identifier (a GUID).
     */
    private UUID jobId;

    /**
     * Gets or sets the friendly name of the job.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets the job type of the current job (Hive or USql). Possible
     * values include: 'USql', 'Hive'.
     */
    @JsonProperty(required = true)
    private JobType type;

    /**
     * Gets or sets the user or account that submitted the job.
     */
    private String submitter;

    /**
     * Gets the error message details for the job, if the job failed.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<JobErrorDetails> errorMessage;

    /**
     * Gets or sets the degree of parallelism used for this job. This must be
     * greater than 0.
     */
    private Integer degreeOfParallelism;

    /**
     * Gets or sets the priority value for the current job. Lower numbers have
     * a higher priority. By default, a job has a priority of 1000. This must
     * be greater than 0.
     */
    private Integer priority;

    /**
     * Gets the time the job was submitted to the service.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private DateTime submitTime;

    /**
     * Gets the start time of the job.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * Gets the completion time of the job.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Gets the job state. When the job is in the Ended state, refer to Result
     * and ErrorMessage for details. Possible values include: 'Accepted',
     * 'Compiling', 'Ended', 'New', 'Queued', 'Running', 'Scheduling',
     * 'Starting', 'Paused', 'WaitingForCapacity'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /**
     * Gets the result of job execution or the current result of the running
     * job. Possible values include: 'None', 'Succeeded', 'Cancelled',
     * 'Failed'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private JobResult result;

    /**
     * Gets the job state audit records, indicating when various operations
     * have been performed on this job.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<JobStateAuditRecord> stateAuditRecords;

    /**
     * Gets or sets the job specific properties.
     */
    @JsonProperty(required = true)
    private JobProperties properties;

    /**
     * Get the jobId value.
     *
     * @return the jobId value
     */
    public UUID getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId value.
     *
     * @param jobId the jobId value to set
     */
    public void setJobId(UUID jobId) {
        this.jobId = jobId;
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
     * Get the type value.
     *
     * @return the type value
     */
    public JobType getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(JobType type) {
        this.type = type;
    }

    /**
     * Get the submitter value.
     *
     * @return the submitter value
     */
    public String getSubmitter() {
        return this.submitter;
    }

    /**
     * Set the submitter value.
     *
     * @param submitter the submitter value to set
     */
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    /**
     * Get the errorMessage value.
     *
     * @return the errorMessage value
     */
    public List<JobErrorDetails> getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the degreeOfParallelism value.
     *
     * @return the degreeOfParallelism value
     */
    public Integer getDegreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Set the degreeOfParallelism value.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set
     */
    public void setDegreeOfParallelism(Integer degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Get the submitTime value.
     *
     * @return the submitTime value
     */
    public DateTime getSubmitTime() {
        return this.submitTime;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public JobState getState() {
        return this.state;
    }

    /**
     * Get the result value.
     *
     * @return the result value
     */
    public JobResult getResult() {
        return this.result;
    }

    /**
     * Get the stateAuditRecords value.
     *
     * @return the stateAuditRecords value
     */
    public List<JobStateAuditRecord> getStateAuditRecords() {
        return this.stateAuditRecords;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public JobProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(JobProperties properties) {
        this.properties = properties;
    }

}
