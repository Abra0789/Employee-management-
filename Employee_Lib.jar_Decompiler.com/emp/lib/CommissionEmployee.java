package emp.lib;

public class CommissionEmployee extends PartTimeEmployee {
   private double commission;
   private double sale;

   public CommissionEmployee(String name, String employeeId, int age, String designation, String phoneNo, double commission) {
      super(name, employeeId, age, designation, phoneNo);
      this.commission = commission;
   }

   public double getSalary() {
      return this.sale > 0.0D ? this.commission * this.sale : -1.0D;
   }

   public void increaseSalary(double amt) {
      this.commission += amt;
   }

   public String toString(boolean details) {
      return details ? String.format("%s\tCommission=%.1f", super.toString(), this.commission) : super.toString();
   }

   public void addRecord(DailyRecord record) {
      super.addRecord(record);
      this.sale += record.hour_Or_Sale;
   }

   public void addRecord(double hour_Or_Sale) {
      super.addRecord(hour_Or_Sale);
      this.sale += hour_Or_Sale;
   }
}
