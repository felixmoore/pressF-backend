package com.kainos.ea.objects;

/**
 * Kainos Job Band property (e.g. Consultant)
 */
public class JobBand {

  private int jobBandId;
  private JobBand jobBand;

  public JobBand() {
  }

  public JobBand(int jobBandId, JobBand jobBand) {
    super();
    this.jobBandId = jobBandId;
    this.jobBand = jobBand;
  }

  public int getJobBandId() {
    return jobBandId;
  }

  public void setJobBandId(int jobBandId) {
    this.jobBandId = jobBandId;
  }

  public JobBand getJobBand() {
    return jobBand;
  }

  public void setJobBand(JobBand jobBand) {
    this.jobBand = jobBand;
  }
}