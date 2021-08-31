package com.kainos.ea.objects;

/**
 * Kainos Job Capability property (e.g. Software Engineer)
 */
public class JobRole {

  private int jobRoleID;
  private String jobTitle;
  private String jobSpecification;
  private String jobBand;
  private String jobCapability;
  private String jobCompetencies;
  private String jobDiscipline;
  private String jobProfileLink;
  private String recordCreated;

  public JobRole() {
  }

  public JobRole(int jobRoleID, String jobTitle, String jobSpecification, String jobBand,
                 String jobCapability, String jobCompetencies, String jobDiscipline) {
    super();
    this.jobRoleID = jobRoleID;
    this.jobTitle = jobTitle;
    this.jobSpecification = jobSpecification;
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

  public String getJobSpecification() {
    return jobSpecification;
  }

  public void setJobSpecification(String jobSpecification) {
    this.jobSpecification = jobSpecification;
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

  public String getJobDiscipline() {
    return jobDiscipline;
  }

  public void setJobDiscipline(String jobDiscipline) {
    this.jobDiscipline = jobDiscipline;
  }

  public String getJobProfileLink() {
    return jobProfileLink;
  }

  public void setJobProfileLink(String jobProfileLink) {
    this.jobProfileLink = jobProfileLink;
  }

  public String getRecordCreated() {
    return recordCreated;
  }

  public void setRecordCreated(String recordCreated) {
    this.recordCreated = recordCreated;
  }

  @Override
  public String toString() {
    return String.format(
        "Title: %s, Specification: %s, Band: %s, Capability: %s, Competencies: %s, Discipline: %s, SharePoint link: %s, Record created: %s",
        getJobTitle(), getJobSpecification(), getJobBand(), getJobCapability(),
        getJobCompetencies(), getJobDiscipline(), getJobProfileLink(), getRecordCreated());
  }
}