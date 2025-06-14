package com.mckay.charsheet.attribute;

public class Dexterity extends AttribBaseClass{
    private int baseVal;

    public Dexterity(){}

    public Dexterity(int baseVal){
        this.baseVal=baseVal;
    }


    public int getBaseVal() {
        return baseVal;
    }


    public void setBaseValue(int baseVal) {
        this.baseVal = baseVal;
    }

    @Override
    String dmp() {
        String returnVal;
        returnVal = baseVal+"";
        return returnVal;
    }
}
