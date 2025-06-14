package com.mckay.charsheet.attribute;



public class Attributes extends com.mckay.charsheet.SheetBaseClass{
    //add all the attribs dex ect...
    private Strength str = new Strength();

    
    
    
    public Attributes(){

    }
    
    //make Attributes a constructor where you can pass in all the BASE values for the attribs
    public Attributes(int strVal){
        str = new Strength(strVal);


    }
    
    private void updateLabel(){
        String bufferString = new String();
        bufferString += "These are my Attributes :\n";
        bufferString += "Strength :"+ str.dmp();
        
        bufferString += "Cha :"+ str.dmp();


        //todo
        //.... add lines for all the other attribs here


        //last update your label
        this.setLabel(bufferString);
    }
    
    
    
    
    
    @Override
    public void init() {
    
        updateLabel();
    }
    
}
