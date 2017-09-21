package com.lutfucan.designpattern.factory;

public class BusinessFactoryCreator {
    
    public static BusinessFactory createBusinessFactory(String factoryType){
        switch(factoryType){
            case "Department":
                return new DepartmentFactory();
            case "Person":
                return new PersonFactory();
            default:
                return null;
        }
    }

}
