package com.mckay.charsheet;

public class Name extends SheetBaseClass{
    
    public String getName(){
        return getLabel();
    }

    public void setName(String name){
        this.setLabel(name);
    }
}
