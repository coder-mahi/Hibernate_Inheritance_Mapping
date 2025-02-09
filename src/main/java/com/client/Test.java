package com.client;
import java.util.Date;
import com.pojo.Employee;
import com.utility.HibernateUtilty;
import org.hibernate.*;
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		Employee emp = new Employee();
		emp.setFirstName("Mahesh");
		emp.setLastName("Shinde");
		emp.setSalary(2700000.01);
		emp.setDeptName("Product_Engineer");
		emp.setDeptNo(100);
		emp.setJoiningDate(new Date("21/12/2026"));
		System.out.println("Testing of createEmployee()");
		test.createEmployee(emp);
		System.out.println("Testing of getEmployee()");
		
	}
	public void createEmployee(Employee emp){
		Session session = HibernateUtilty.getSession();
		Transaction tx = session.beginTransaction();  // Start transaction
		Integer id = (Integer) session.save(emp);
		tx.commit();  // Commit after saving
		session.close();
	}
	public void getEmployee(int empId){
		Session session = HibernateUtilty.getSession();
		Employee emp = new Employee();
		emp = session.get(Employee.class,empId);
		System.out.println("Employee details :>");
		System.out.println("\n"+emp.getFirstName());
		System.out.println("\n"+emp.getLastName());
		System.out.println("\n"+emp.getSalary());
		System.out.println("\n"+emp.getDeptName());
		System.out.println("\n"+emp.getDeptNo());
		System.out.println("\n"+emp.getJoiningDate());
		session.close();
	}
}
