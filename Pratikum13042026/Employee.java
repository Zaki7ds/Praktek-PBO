/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum13042026;

/**
 *
 * @author zakiv
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee (int id, String firstName, String lastName, int salary){
        
    }
    public int getId(){
        return (id);
    }
    public String getFirstName(){
        return(firstName);
    }
    public String getLastName(){
        return(lastName);
    }
    public String getName(){
        return (firstName + lastName);
    }
    public int getSalary(){
        return(salary);
    }
    public int setSalary(int a){
        return(salary = a);
    }
    public int getAnnualSalary(){
        return(salary * 12);
    } 
}

