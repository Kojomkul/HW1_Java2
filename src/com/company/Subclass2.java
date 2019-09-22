package com.company;

public final class Subclass2 extends Subclass1 {

    private int variable3;

    public Subclass2 (Feature feature, int variable1, String variable2, int variable3){
        super(feature, variable1, variable2);
        this.variable3=variable3;
    }


    public int getVariable3() {
        return variable3;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + getVariable3();
    }

}
