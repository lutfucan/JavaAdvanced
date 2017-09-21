package com.lutfucan.designpattern.factory;

import com.lutfucan.designpattern.Department;
import com.lutfucan.designpattern.Person;

public abstract class BusinessFactory {
    
    public abstract Person createPerson(String personType);
    public abstract Department createDepartment(String deptType);

}
