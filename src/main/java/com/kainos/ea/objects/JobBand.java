package com.kainos.ea.objects;

/**
 * Kainos Job Band property (e.g. Consultant)
 */
public class JobBand {

  private int jobBandId;
  private String jobBand;

  public JobBand() {
  }

  public JobBand(String jobBand) {
    super();
    this.jobBand = jobBand;
  }

  public String getJobBand() {
    return jobBand;
  }

  public void setJobBand(String jobBand) {
    this.jobBand = jobBand;
  }

  public void setJobBandId(int jobBandId) { this.jobBandId = jobBandId; }

  public int getJobBandId() { return jobBandId; }
}