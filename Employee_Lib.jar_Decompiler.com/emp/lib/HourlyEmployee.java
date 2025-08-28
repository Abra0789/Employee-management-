package emp.lib;

public class HourlyEmployee extends PartTimeEmployee {
   private double hourlyRate;
   private double hourWorkedForAMonth;

   public HourlyEmployee(String name, String employeeId, int age, String designation, String phoneNo, double hourlyRate) {
      super(name, employeeId, age, designation, phoneNo);
      this.hourlyRate = hourlyRate;
   }

   public double getSalary() {
      return this.hourWorkedForAMonth > 0.0D ? this.hourlyRate * this.hourWorkedForAMonth : -1.0D;
   }

   public void increaseSalary(double amt) {
      this.hourlyRate += amt;
   }

   public String toString(boolean details) {
      return details ? String.format("%s\tHourly Rate=%.1f", super.toString(), this.hourlyRate) : super.toString();
   }

   public void addRecord(DailyRecord record) {
      super.addRecord(record);
      this.hourWorkedForAMonth += record.hour_Or_Sale;
   }

   public void addRecord(double hour_Or_Sale) {
      super.addRecord(hour_Or_Sale);
      this.hourWorkedForAMonth += hour_Or_Sale;
   }
}
