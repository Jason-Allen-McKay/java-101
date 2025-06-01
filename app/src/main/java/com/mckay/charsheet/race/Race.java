package com.mckay.charsheet.race;

import com.mckay.charsheet.SheetBaseClass;

public class Race extends SheetBaseClass{
    public String getRaceName(){
        return getLabel();
    }

    public void setRaceName(String name){
        this.setLabel(name);
    }

    
}
