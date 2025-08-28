package emp.lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Company implements Serializable {
   private String name;
   private ArrayList<Employee> employees = new ArrayList();

   public Company(String name) {
      this.name = name;
   }

   public void addEmployee(Employee employee) {
      try {
         this.findEmployee(employee.getEmployeeId());
      } catch (InvalidEmployeeException var3) {
         this.employees.add(employee);
      }

   }

   public void addSalariedEmployee(String name, String employeeId, int age, String designation, String phoneNo, double monthlySalary) {
      this.addEmployee(new SalariedEmployee(name, employeeId, age, designation, phoneNo, monthlySalary));
   }

   public void addHourlyEmployee(String name, String employeeId, int age, String designation, String phoneNo, double hourlyRate) {
      this.addEmployee(new HourlyEmployee(name, employeeId, age, designation, phoneNo, hourlyRate));
   }

   public void addCommissionEmployee(String name, String employeeId, int age, String designation, String phoneNo, double commission) {
      this.addEmployee(new CommissionEmployee(name, employeeId, age, designation, phoneNo, commission));
   }

   public Employee findEmployee(String id) throws InvalidEmployeeException {
      Iterator var3 = this.employees.iterator();

      while(var3.hasNext()) {
         Employee emp = (Employee)var3.next();
         if (emp.getEmployeeId().equals(id)) {
            return emp;
         }
      }

      throw new InvalidEmployeeException(id);
   }

   public String getName() {
      return this.name;
   }

   public ArrayList<Employee> getEmployees() {
      return this.employees;
   }

   public ArrayList<Employee> getEmployees(String name) {
      ArrayList<Employee> result = new ArrayList();
      Iterator var4 = this.employees.iterator();

      while(var4.hasNext()) {
         Employee e = (Employee)var4.next();
         if (e.getName().toLowerCase().contains(name.toLowerCase())) {
            result.add(e);
         }
      }

      return result;
   }

   public double getSalary(String id) throws InvalidEmployeeException {
      Employee emp = this.findEmployee(id);
      return emp.getSalary();
   }

   public void increaseSalary(String id, double amt) throws InvalidEmployeeException {
      Employee emp = this.findEmployee(id);
      emp.increaseSalary(amt);
   }

   public void saveData() {
      DataHandler.saveData(this);
   }
}
