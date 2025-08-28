package emp.lib;

public class SalariedEmployee extends Employee {
   double monthlySalary;

   public SalariedEmployee(String name, String employeeId, int age, String designation, String phoneNo, double monthlySalary) {
      super(name, employeeId, age, designation, phoneNo);
      this.monthlySalary = monthlySalary;
   }

   public double getSalary() {
      return this.monthlySalary;
   }

   public void increaseSalary(double amt) {
      this.monthlySalary += amt;
   }

   public String toString(boolean details) {
      return details ? String.format("%s\tMonthly Salary=%.1f", super.toString(), this.monthlySalary) : super.toString();
   }
}
