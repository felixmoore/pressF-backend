package com.kainos.ea.objects;

/**
 * Java representation of JobDiscipline database table.
 */
public class JobDiscipline {

  private int jobDisciplineId;
  private String jobDiscipline;

  public JobDiscipline() {
  }

  public JobDiscipline(String jobDiscipline) {
    super();
    this.jobDiscipline = jobDiscipline;
    this.jobDisciplineId = jobDisciplineId;
  }

  public String getJobDiscipline() {
    return jobDiscipline;
  }

  public void setJobDiscipline(String jobDiscipline) {
    this.jobDiscipline = jobDiscipline;
  }

  public int getJobDisciplineId() {
    return jobDisciplineId;
  }

  public void setJobDisciplineId(int jobDisciplineId) {
    this.jobDisciplineId = jobDisciplineId;
  }
}
