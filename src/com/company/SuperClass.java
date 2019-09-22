package com.company;

public class SuperClass {

    private Feature feature;
    private int variable1;

    public SuperClass(Feature feature, int variable1) {
    }

    public Feature getFeature() {
        return feature;
    }

    public int getVariable1() {
        return variable1;
    }

    public String getInfo() {
        return variable1 + " " + feature;
    }

}
