package com.mckay.classes;





import com.mckay.classes.Person;

public class ClassOne { 
    //write a constructor


    public void doSomeWork(){
        Person p = null;
        
        p = new Person(17,115,"darby");
        this.printSomePersonStuff(p);
        p = new Person(52,255,"jason");
        this.printSomePersonStuff(p);

        new PunchMeInTheFace("Motherfucker!!");


        
    }
    //write a getter

    private void printSomePersonStuff(Person pp){
        System.out.println("===========================================");        
        System.out.println("how is your health?");
        System.out.println(pp+"blah");
        System.out.println("are you healthy? "+pp.getName()+" is healthy"+pp.getHealthValue()+">");
        System.out.println("===========================================");
    }

    //write a setter

}