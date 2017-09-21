package com.lutfucan.designpattern.test;

import com.lutfucan.designpattern.Person;
import com.lutfucan.designpattern.factory.PersonFactory;

//Yapılacak bir değişiklik varsa sadece burada yapılabiliyor. 
//Eklenecek sınıflar varsa Factory'den yaratılıyor.
public class Main {
    
    public static void main(String[] args) {
        Person emp = PersonFactory.getEmployee();
        Person man = PersonFactory.getManager();
        
        emp.setPersonName("Yavuz");
        man.setPersonName("Fatih");
        
        System.out.println("Employee adı : " + emp.getPersonName());
        System.out.println("Manager adı : " + man.getPersonName());
    }

}
