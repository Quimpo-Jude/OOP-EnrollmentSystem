package org.example.model;

abstract class Person {
    private String personName;
    private String personID;

    public abstract void mainTask();
    public Person (){
    }
    public Person (String personName,String personID){
        this.personName = personName;
        this.personID = personID;
    }
    public String getPersonID(){
        return personID;
    }
    public String getPersonName(){
        return personName;
    }
    public void setPersonID(String personID){
        this.personID = personID;
    }
    public void setPersonName(String personName){
        this.personName = personName;
    }

}

