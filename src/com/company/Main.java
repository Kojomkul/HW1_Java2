package com.company;

public class Main {

    public static void main(String[] args) {

        Subclass1 subclassA = new Subclass1(Feature.FEATURE_1, 2, "AAA'");
        System.out.println(subclassA.getInfo());
        subclassA.getInfo();

        Subclass2 subclassB = new Subclass2(Feature.FEATURE_2, 3, "SSS", 33);
        System.out.println(subclassB.getInfo());
        subclassB.getInfo();

        Subclass2 subclassC = new Subclass2(Feature.FEATURE_3, 4, "DDD", 44);
        System.out.println(subclassC.getInfo());
        subclassC.getInfo();

    }
}
