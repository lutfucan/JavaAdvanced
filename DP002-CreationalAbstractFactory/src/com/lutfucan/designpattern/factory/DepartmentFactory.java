package com.lutfucan.designpattern.factory;

import com.lutfucan.designpattern.Department;
import com.lutfucan.designpattern.Management;
import com.lutfucan.designpattern.Person;
import com.lutfucan.designpattern.Service;

public class DepartmentFactory extends BusinessFactory{

    @Override
    public Person createPerson(String personType) {
        return null;
    }

    @Override
    public Department createDepartment(String deptType) {
        switch (deptType) {
            case "Management":
                return new Management();
            case "Service":
                return new Service();
            default:
                return null;
           
        }
    }

}
