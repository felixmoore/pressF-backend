package com.kainos.ea.objects;

public class JobCapability {
//    **JobCapability** - JobCapabilityID (INT), JobCapability (VARCHAR)
    private int jobCapabilityId;
    private String jobCapability;

    public JobCapability() {}

    public JobCapability(int jobCapabilityId, String jobCapability) {
        super();
        this.jobCapabilityId = jobCapabilityId;
        this.jobCapability = jobCapability;
    }

    public int getJobCapabilityId() {
        return jobCapabilityId;
    }

    public void setJobCapabilityId(int jobCapabilityId) {
        this.jobCapabilityId = jobCapabilityId;
    }

    public String getJobCapability() {
        return jobCapability;
    }

    public void setJobCapability(String jobCapability) {
        this.jobCapability = jobCapability;
    }
}
