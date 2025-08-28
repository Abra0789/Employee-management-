package emp.lib;

import java.io.Serializable;

public abstract class Employee implements Serializable {
   private String name;
   private String employeeId;
   private String designation;
   private String phoneNo;
   private int age;

   public Employee(String name, String employeeId, int age, String designation, String phoneNo) {
      this.name = name;
      this.employeeId = employeeId;
      this.designation = designation;
      this.phoneNo = phoneNo;
      this.age = age;
   }

   public String getPhoneNo() {
      return this.phoneNo;
   }

   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   public String getName() {
      return this.name;
   }

   public String getEmployeeId() {
      return this.employeeId;
   }

   public String getDesignation() {
      return this.designation;
   }

   public int getAge() {
      return this.age;
   }

   public String toString() {
      return String.format("Name=%s\temployeeId=%s\tage=%d\tdesignation=%s\tContact No:%s", this.name, this.employeeId, this.age, this.designation, this.phoneNo);
   }

   public abstract double getSalary();

   public abstract void increaseSalary(double var1);

   public abstract String toString(boolean var1);
}
