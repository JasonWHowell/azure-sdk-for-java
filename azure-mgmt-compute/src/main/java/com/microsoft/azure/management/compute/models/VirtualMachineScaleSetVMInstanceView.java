/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * The instance view of a virtual machine scale set VM.
 */
public class VirtualMachineScaleSetVMInstanceView {
    /**
     * Gets or sets the Update Domain count.
     */
    private Integer platformUpdateDomain;

    /**
     * Gets or sets the Fault Domain count.
     */
    private Integer platformFaultDomain;

    /**
     * Gets or sets the Remote desktop certificate thumbprint.
     */
    private String rdpThumbPrint;

    /**
     * Gets or sets the VM Agent running on the virtual machine.
     */
    private VirtualMachineAgentInstanceView vmAgent;

    /**
     * Gets or sets the disks information.
     */
    private List<DiskInstanceView> disks;

    /**
     * Gets or sets the extensions information.
     */
    private List<VirtualMachineExtensionInstanceView> extensions;

    /**
     * Gets or sets the boot diagnostics.
     */
    private BootDiagnosticsInstanceView bootDiagnostics;

    /**
     * Gets or sets the resource status information.
     */
    private List<InstanceViewStatus> statuses;

    /**
     * Get the platformUpdateDomain value.
     *
     * @return the platformUpdateDomain value
     */
    public Integer getPlatformUpdateDomain() {
        return this.platformUpdateDomain;
    }

    /**
     * Set the platformUpdateDomain value.
     *
     * @param platformUpdateDomain the platformUpdateDomain value to set
     */
    public void setPlatformUpdateDomain(Integer platformUpdateDomain) {
        this.platformUpdateDomain = platformUpdateDomain;
    }

    /**
     * Get the platformFaultDomain value.
     *
     * @return the platformFaultDomain value
     */
    public Integer getPlatformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain value.
     *
     * @param platformFaultDomain the platformFaultDomain value to set
     */
    public void setPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
    }

    /**
     * Get the rdpThumbPrint value.
     *
     * @return the rdpThumbPrint value
     */
    public String getRdpThumbPrint() {
        return this.rdpThumbPrint;
    }

    /**
     * Set the rdpThumbPrint value.
     *
     * @param rdpThumbPrint the rdpThumbPrint value to set
     */
    public void setRdpThumbPrint(String rdpThumbPrint) {
        this.rdpThumbPrint = rdpThumbPrint;
    }

    /**
     * Get the vmAgent value.
     *
     * @return the vmAgent value
     */
    public VirtualMachineAgentInstanceView getVmAgent() {
        return this.vmAgent;
    }

    /**
     * Set the vmAgent value.
     *
     * @param vmAgent the vmAgent value to set
     */
    public void setVmAgent(VirtualMachineAgentInstanceView vmAgent) {
        this.vmAgent = vmAgent;
    }

    /**
     * Get the disks value.
     *
     * @return the disks value
     */
    public List<DiskInstanceView> getDisks() {
        return this.disks;
    }

    /**
     * Set the disks value.
     *
     * @param disks the disks value to set
     */
    public void setDisks(List<DiskInstanceView> disks) {
        this.disks = disks;
    }

    /**
     * Get the extensions value.
     *
     * @return the extensions value
     */
    public List<VirtualMachineExtensionInstanceView> getExtensions() {
        return this.extensions;
    }

    /**
     * Set the extensions value.
     *
     * @param extensions the extensions value to set
     */
    public void setExtensions(List<VirtualMachineExtensionInstanceView> extensions) {
        this.extensions = extensions;
    }

    /**
     * Get the bootDiagnostics value.
     *
     * @return the bootDiagnostics value
     */
    public BootDiagnosticsInstanceView getBootDiagnostics() {
        return this.bootDiagnostics;
    }

    /**
     * Set the bootDiagnostics value.
     *
     * @param bootDiagnostics the bootDiagnostics value to set
     */
    public void setBootDiagnostics(BootDiagnosticsInstanceView bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> getStatuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     */
    public void setStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
    }

}
