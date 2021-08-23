package com.kainos.ea.resources;

public class Test {
    private int ID;
    private String testMessage;


    public Test(int ID, String testMessage) {
        this.setID(ID);
        this.setTestMessage(testMessage);
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTestMessage() {
        return testMessage;
    }

    public void setTestMessage(String testMessage) {
        this.testMessage = testMessage;
    }
}
