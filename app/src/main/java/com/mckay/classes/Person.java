package com.mckay.classes;

public class Person {
    private int itsAge =-1;
    private int weight = -1 ;
    private String name = "notset";


    public Person(){} // no arg constuctor
    
    public Person(int aAge, int weight){
        itsAge = aAge;
        this.weight = weight;
    }
    
    public Person(int aAge, int weight,String name){
        itsAge = aAge;
        this.weight = weight;
        this.name = name;
    }

    

    public void setAge(int age){
        itsAge = age;
    }




    public void setWeight(int weight){
        this.weight = weight;

    }

    public int getAge(){
        return itsAge;
    }

    public int getWeight(){
        return weight;
    }


    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return this.name;
    }



/**
 * 
 * @return if return is false you suck
 */
    public boolean getHealthValue(){
        int val = this.weight + this.itsAge;
        if (val >78 ){
            return false;
        }
        else{
            return true;
        }
    }


    public String toString(){
        return "Hello my name is <"+this.name+"> and my age is <"+this.itsAge+"> and my weight is <"+this.weight+">";
    }


}
