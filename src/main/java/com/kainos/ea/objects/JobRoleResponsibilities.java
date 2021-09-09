package com.kainos.ea.objects;

/**
 * Java representation of JobRoleResponsibilities database table.
 */
public class JobRoleResponsibilities {
  private String jobRoleResponsibility;

  public JobRoleResponsibilities() {
  }

  public JobRoleResponsibilities(String jobRoleResponsibility) {
    super();
    this.jobRoleResponsibility = jobRoleResponsibility;
  }

  public String getJobRoleResponsibility() {
    return jobRoleResponsibility;
  }

  public void setJobRoleResponsibility(String jobRoleResponsibility) {
    this.jobRoleResponsibility = jobRoleResponsibility;
  }
}
