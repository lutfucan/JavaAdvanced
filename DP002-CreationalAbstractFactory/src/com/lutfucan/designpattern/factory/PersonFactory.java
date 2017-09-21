package com.lutfucan.designpattern.factory;

import com.lutfucan.designpattern.Department;
import com.lutfucan.designpattern.Employee;
import com.lutfucan.designpattern.Management;
import com.lutfucan.designpattern.Manager;
import com.lutfucan.designpattern.Person;
import com.lutfucan.designpattern.Service;

public class PersonFactory extends BusinessFactory {

    @Override
    public Person createPerson(String personType) {
        switch (personType) {
            case "Manager":
                return new Manager();
            case "Employee":
                return new Employee();
            default:
                return null;
        }
    }

    @Override
    public Department createDepartment(String deptType) {
        return null;
    }

}
