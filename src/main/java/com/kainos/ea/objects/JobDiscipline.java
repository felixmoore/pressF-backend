package com.kainos.ea.objects;

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

    public void setJobDisciplineId(int jobDisciplineId) {
        this.jobDisciplineId = jobDisciplineId;
    }

    public int getJobDisciplineId() { return jobDisciplineId; }
}
