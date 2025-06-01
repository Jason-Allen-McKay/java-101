package com.mckay.charsheet;

public class Name extends SheetBaseClass{
    
    
    public Name(String name){
        super(name);
    }
    
    
    public String getName(){
        return getLabel();
    }

    public void setName(String name){
        this.setLabel(name);
    }


    @Override
    public void init() {
        System.out.println("doing some init stuff inside the name class, this is my name <"+getName());
        
    }

    
}
