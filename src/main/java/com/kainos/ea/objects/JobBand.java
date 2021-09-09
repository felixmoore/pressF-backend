package com.kainos.ea.objects;

/**
 * Kainos Job Band property (e.g. Consultant)
 */
public class JobBand {

  private int jobBandId;
  private String jobBand;
  private String jobBandTraining;

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

  public int getJobBandId() {
    return jobBandId;
  }

  public void setJobBandId(int jobBandId) {
    this.jobBandId = jobBandId;
  }

  public String getJobBandTraining() {
    return jobBandTraining;
  }

  public void setJobBandTraining(String jobBandTraining) {
    this.jobBandTraining = jobBandTraining;
  }

}