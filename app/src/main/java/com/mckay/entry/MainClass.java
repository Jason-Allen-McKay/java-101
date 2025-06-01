package com.mckay.entry;

import com.mckay.charsheet.MainSheet;
import com.mckay.classes.ClassOne; 
import com.mckay.charsheet.Name;

public class MainClass {
    






    public static void main(String[] args) {
        MainSheet mySheet = new MainSheet();

        Name myName = new Name("Bob the destroyer");
        mySheet.setName(myName);
        mySheet.initChar();


        
    }


    
}