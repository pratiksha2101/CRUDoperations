package com.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import com.demo.DAO;
import com.demo.Employee;

public class Test {

    public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
    
        System.out.println("Employee System");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            System.out.println("1. Save");
            System.out.println("2. Get Data");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            
            System.out.println("Select your choice");
            int ch = Integer.parseInt(br.readLine());
            
            switch(ch) {
            
                case 1:
                    // Save
                    System.out.println("Enter the name");
                    String name = br.readLine();
                    System.out.println("Enter the salary");
                    float salary = Float.parseFloat(br.readLine());
                    Employee e1 = new Employee(name, salary);
                    int ans = DAO.Save(e1);
                    if(ans > 0)
                        System.out.println("Data saved successfully");
                    else
                        System.out.println("Something went wrong");
                    break;
                    
               case 2:
                    // Get Data
                   /* List<Employee> employees = DAO.getAllEmployees();
                    System.out.println("Employee List:");
                    for(Employee e : employees) {
                    System.out.println(e);
                    }*/
            	   DAO.GetData();
                    break;
                    
                case 3:
                    // Update
                    System.out.println("Enter the id of the employee to update");
                    int updateId = Integer.parseInt(br.readLine());
                    
                    System.out.println("Enter the new name");
                    String newName = br.readLine();
                    
                    System.out.println("Enter the new salary");
                    float newSalary = Float.parseFloat(br.readLine());
                    
                    Employee updatedEmployee = new Employee();
                    updatedEmployee.setId(updateId);
                    updatedEmployee.setName(newName);
                    updatedEmployee.setSalary(newSalary);
                    int ans1 = DAO.UpdateData(updatedEmployee);
                    
                    if(ans1 > 0)
                        System.out.println("Data updated successfully");
                    else
                        System.out.println("Something went wrong");
                	
                    break;
                    
                    
                case 4:
                	
                    // Delete
                    System.out.println("Enter the id of the employee to delete");
                    int deleteId = Integer.parseInt(br.readLine());
                    ans = DAO.Delete(deleteId);
                    if(ans > 0)
                        System.out.println("Data deleted successfully");
                    else
                        System.out.println("Something went wrong");
                    break;
                    
                case 5:
                    // Exit
   
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
