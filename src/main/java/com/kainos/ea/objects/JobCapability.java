package com.kainos.ea.objects;

/**
 * Kainos Job Capability property (e.g. Engineering)
 */
public class JobCapability {
  private int jobCapabilityId;
  private String jobCapability;

  public JobCapability() {
  }

  public JobCapability(int jobCapabilityId, String jobCapability) {
    super();
    this.jobCapabilityId = jobCapabilityId;
    this.jobCapability = jobCapability;
  }

  public String getJobCapability() {
    return jobCapability;
  }

  public void setJobCapability(String jobCapability) {
    this.jobCapability = jobCapability;
  }

  public int getJobCapabilityId() {
    return jobCapabilityId;
  }

  public void setJobCapabilityId(int jobCapabilityId) {
    this.jobCapabilityId = jobCapabilityId;
  }

}