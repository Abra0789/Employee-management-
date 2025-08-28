package emp.lib;

import java.util.ArrayList;

public abstract class PartTimeEmployee extends Employee {
   ArrayList<DailyRecord> dailyRecords = new ArrayList();

   public PartTimeEmployee(String name, String employeeId, int age, String designation, String phoneNo) {
      super(name, employeeId, age, designation, phoneNo);
   }

   public void addRecord(DailyRecord record) {
      this.dailyRecords.add(record);
   }

   public void addRecord(double hour_Or_Sale) {
      DailyRecord record = new DailyRecord(hour_Or_Sale);
      this.dailyRecords.add(record);
   }

   public ArrayList<DailyRecord> getDailyRecords() {
      return this.dailyRecords;
   }
}
