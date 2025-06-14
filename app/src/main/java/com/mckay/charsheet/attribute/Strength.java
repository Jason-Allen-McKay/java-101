package com.mckay.charsheet.attribute;

public class Strength extends AttribBaseClass{
    private int baseValue;
    



    public Strength(){}
    
    
    public Strength(int baseValue){
        this.baseValue = baseValue;
    }

    public int getBaseValue() {
        return baseValue;
    }


    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }


    @Override
    String dmp() {
        String returnValue;
        //do stuff here that would be used to update your STR value based on other stats
        returnValue = baseValue+"";
        return returnValue;
    }

}
