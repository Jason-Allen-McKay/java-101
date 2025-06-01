package com.mckay.charsheet;

abstract public class SheetBaseClass {
    private String label;
    
    public SheetBaseClass(){
        this.label ="you didnt set this fool";
    }

    public SheetBaseClass(String label){
        this.label =label;
    }

    public String getLabel(){
        return label;
    }

    public void setLabel(String label){
        this.label = label;
    }
}
