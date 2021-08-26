package com.kainos.ea.objects;

public class JobRole {

    private int jobRoleID;
    private String jobTitle;
    private String jobSpec;
    private String jobBand;
    private String jobCapability;
    private String jobCompetencies;
    private String jobDiscipline;

    public JobRole() { }

    public JobRole(int jobRoleID, String jobTitle, String jobSpec, String jobBand, String jobCapability, String jobCompetencies, String jobDiscipline) {
        super();
        this.jobRoleID = jobRoleID;
        this.jobTitle = jobTitle;
        this.jobSpec = jobSpec;
        this.jobBand = jobBand;
        this.jobCapability = jobCapability;
        this.jobCompetencies = jobCompetencies;
        this.jobDiscipline = jobDiscipline;
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

    public String getJobBand() {
        return jobBand;
    }

    public void setJobBand(String jobBand) {
        this.jobBand = jobBand;
    }

    public String getJobCapability() {
        return jobCapability;
    }

    public void setJobCapability(String jobCapability) {
        this.jobCapability = jobCapability;
    }

    public String getJobCompetencies() {
        return jobCompetencies;
    }

    public void setJobCompetencies(String jobCompetencies) {
        this.jobCompetencies = jobCompetencies;
    }

    public void setJobDiscipline(String jobDiscipline) { this.jobDiscipline = jobDiscipline; }

    public String getJobDiscipline() { return jobDiscipline; }
}
