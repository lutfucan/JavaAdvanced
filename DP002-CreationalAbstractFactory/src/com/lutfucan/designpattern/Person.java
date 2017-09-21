package com.lutfucan.designpattern;

public abstract class Person {
    
    private String personName;

    public Person() {
    }

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    

}
