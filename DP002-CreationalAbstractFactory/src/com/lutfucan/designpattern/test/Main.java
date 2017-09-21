package com.lutfucan.designpattern.test;

import com.lutfucan.designpattern.Department;
import com.lutfucan.designpattern.Person;
import com.lutfucan.designpattern.factory.BusinessFactory;
import com.lutfucan.designpattern.factory.BusinessFactoryCreator;
import com.lutfucan.designpattern.factory.DepartmentFactory;
import com.lutfucan.designpattern.factory.PersonFactory;

public class Main {
    
    //Abstactfactory metodunda, factory'nin de factory'si yaratılabilir.
    //Alınan parametnrelere göre hangi departman,person yaratılacaksa belirlenebilir
    public static void main(String[] args) {
        
        
        BusinessFactory deptFactory = BusinessFactoryCreator.createBusinessFactory("Department");
        BusinessFactory personFactory = BusinessFactoryCreator.createBusinessFactory("Person");        
                
        Department managementDept = deptFactory.createDepartment("Management");
        managementDept.setDeptName("YÖNETİM");
        Department serviceDept = deptFactory.createDepartment("Service");
        serviceDept.setDeptName("SERVİS");
        
        Person emp1 = personFactory.createPerson("Employee");
        emp1.setPersonName("FATİH");
        Person manager = personFactory.createPerson("Manager");
        manager.setPersonName("YUSUF");
        
        System.out.println("Yönetim Departmanı " + managementDept.getDeptName());
        System.out.println("Servis Departmanı " + serviceDept.getDeptName());
        System.out.println("Çalışan " + emp1.getPersonName());
        System.out.println("Yönetici " + manager.getPersonName());
       
    }

}
