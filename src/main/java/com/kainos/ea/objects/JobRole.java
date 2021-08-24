package com.kainos.ea.objects;

public class JobRole {

    private int jobRoleID;
    private String jobTitle;
    private String jobSpec;
    private JobBand jobBand;
    private JobCapability jobCapability;
    private String jobCompetencies;

    public JobRole() { }

    public JobRole(int jobRoleID, String jobTitle, String jobSpec, JobBand jobBand, JobCapability jobCapability, String jobCompetencies) {
        super();
        this.jobRoleID = jobRoleID;
        this.jobTitle = jobTitle;
        this.jobSpec = jobSpec;
        this.jobBand = jobBand;
        this.jobCapability = jobCapability;
        this.jobCompetencies = jobCompetencies;
    }

    public int getJobRoleID() {
        return jobRoleID;
    }

    public void setJobRoleID(int jobRoleID) {
        this.jobRoleID = jobRoleID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobSpec() {
        return jobSpec;
    }

    public void setJobSpec(String jobSpec) {
        this.jobSpec = jobSpec;
    }

    public JobBand getJobBand() {
        return jobBand;
    }

    public void setJobBand(JobBand jobBand) {
        this.jobBand = jobBand;
    }

    public JobCapability getJobCapability() {
        return jobCapability;
    }

    public void setJobCapability(JobCapability jobCapability) {
        this.jobCapability = jobCapability;
    }

    public String getJobCompetencies() {
        return jobCompetencies;
    }

    public void setJobCompetencies(String jobCompetencies) {
        this.jobCompetencies = jobCompetencies;
    }
}
