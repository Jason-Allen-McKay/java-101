package com.mckay.charsheet.attribute;

public class Constitution extends AttribBaseClass{
    private int baseVal;

    public Constitution(){}

    public Constitution(int baseVal){
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
