package com.company;

public class Subclass1 extends SuperClass {

    private String variable2;

    public Subclass1(Feature feature, int variable1, String variable2) {
        super(feature, variable1);
        this.variable2 = variable2;
    }

    public String getVariable2() {
        return variable2;
    }

    @Override
    public String getInfo(){
        return  super.getInfo() + " " + getVariable2();
    }

    public final void printVariable2() {
        System.out.println(variable2);
    }
}
