package com.lutfucan.designpattern.factory;

import com.lutfucan.designpattern.Employee;
import com.lutfucan.designpattern.Manager;

public class PersonFactory {
    
    public static Manager getManager(){
        return new Manager();
    }

    public static Employee getEmployee(){
        return new Employee();
    }
}
