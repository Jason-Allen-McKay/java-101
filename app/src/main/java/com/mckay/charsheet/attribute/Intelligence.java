package com.mckay.charsheet.attribute;

public class Intelligence extends AttribBaseClass{
//the name of this feels bad 
//fixed it 
    private int baseVal;

    public Intelligence(){}

    public Intelligence(int baseVal){
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
