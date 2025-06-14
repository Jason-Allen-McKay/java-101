package com.mckay.entry;




import com.mckay.charsheet.attribute.Attributes;

public class MainClass {
    






    public static void main(String[] args) {
        // MainSheet mySheet = new MainSheet();

        // Name myName = new Name("Bob the destroyer");
        // mySheet.setName(myName);
        // mySheet.initChar();


        Attributes attrib = new Attributes(18);
        attrib.init();
        System.out.println(attrib.getLabel());

        
    }


    
}