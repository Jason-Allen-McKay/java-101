package com.mckay.charsheet.attribute;



public class Attributes extends com.mckay.charsheet.SheetBaseClass{
    //add all the attribs dex ect...
    private Strength str = new Strength();
    private Dexterity dex = new Dexterity();
    private Constitution con = new Constitution();
    private Intelligence intel = new Intelligence();
    private Wisdom wis = new Wisdom();
    private Charisma cha = new Charisma();

    
    
    
    public Attributes(){

    }
    
    //make Attributes a constructor where you can pass in all the BASE values for the attribs
    public Attributes(int strVal, int dexVal, int conVal, int intelVal, int wisVal, int chaVal){
        str = new Strength(strVal);
        dex = new Dexterity(dexVal);
        con = new Constitution(conVal);
        intel = new Intelligence(intelVal);
        wis = new Wisdom(wisVal);
        cha = new Charisma(chaVal);

    }
    
    private void updateLabel(){
        String bufferString = new String();
        bufferString += "These are my Attributes :\n";
        bufferString += "Strength :"+ str.dmp();
        bufferString += "Dexterity :"+ dex.dmp();
        bufferString += "Constitution :"+ con.dmp();
        bufferString += "Intelligence :"+ intel.dmp();
        bufferString += "Wisdom :"+ wis.dmp();
        bufferString += "Charisma :"+ cha.dmp();


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
