package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAO {
    
    
    public static int Save(Employee e) throws SQLException 
    {
          int status=0;
          Connection con=CP.createCp();
          
          String q= "insert into emp1 (name ,salary ) values(?,?)";
          
          PreparedStatement ps= con.prepareStatement(q);
          
                  ps.setString(1, e.getName());
                  ps.setFloat(2, e.getSalary());
                  
                  status= ps.executeUpdate();
        
        
         return status;
    }
    
    public static void GetData()throws  SQLException{
    	
    	
    	Connection con = CP.createCp();
    	
    	String q="select * from emp1";
    	Statement s=con.createStatement();
       ResultSet rs=s.executeQuery(q);
       
       Employee e=new Employee();
       while (rs.next()) {
          
           e.setId(rs.getInt(1));
           e.setName(rs.getString(2));
          
           e.setSalary(rs.getFloat(3));
           
           System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
           
        
       
       
       
       
       
    /*public static List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        try (Connection con = CP.createCp();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM emp1");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setSalary(rs.getFloat("salary"));
                employees.add(employee);
            }*/
    	
    	
        }
      
       // return employees;
    }
    
    public static int UpdateData(Employee e) throws SQLException {
    	
    	int status = 0;
            Connection con = CP.createCp();
            PreparedStatement ps = con.prepareStatement("UPDATE emp1 SET name=?, salary=? WHERE id=?"); {
            ps.setString(1, e.getName());
            ps.setFloat(2, e.getSalary());
            ps.setInt(3, e.getId());
            status = ps.executeUpdate();
        }
        return status;
    }
    
    	
    
    
    public static int Delete(int id) throws SQLException{
    	int status = 0;
        try (Connection con = CP.createCp();
             PreparedStatement ps = con.prepareStatement("DELETE FROM emp1 WHERE id=?")) {
            ps.setInt(1, id);
            status = ps.executeUpdate();
        }
        return status;
    }



}


