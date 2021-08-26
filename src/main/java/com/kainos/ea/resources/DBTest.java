package com.kainos.ea.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DBTest {
    @JsonProperty("ID")
    private int ID;

    @JsonProperty("testMessage")
    private String testMessage;

    private DBTest(){
        //automatic Jackson deserialisation
    }

    public DBTest(int ID, String testMessage) {
        this.setID(ID);
        this.setTestMessage(testMessage);
    }

    @JsonProperty
    public int getID() {
        return ID;
    }

    @JsonProperty
    public void setID(int ID) {
        this.ID = ID;
    }

    @JsonProperty
    public String getTestMessage() {
        return testMessage;
    }
    @JsonProperty
    public void setTestMessage(String testMessage) {
        this.testMessage = testMessage;
    }

    public String toString(){
       return "Test: " + getID() + ", " + getTestMessage();
    }
}
