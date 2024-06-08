package com.demo;

public class Employee {
    
    
       int id;
       String name;
       float salary;
       
       
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Employee( String name, float salary) {
        
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
       
       

}
