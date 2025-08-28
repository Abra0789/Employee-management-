package emp.lib;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DailyRecord implements Serializable {
   LocalDate date;
   double hour_Or_Sale;

   public DailyRecord(double hour_Or_Sale) {
      this.date = LocalDate.now();
      this.hour_Or_Sale = hour_Or_Sale;
   }

   public DailyRecord(String date, double hour_Or_Sale) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      this.date = LocalDate.parse(date, formatter);
      this.hour_Or_Sale = hour_Or_Sale;
   }

   public String toString() {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      String appTime = this.date.format(formatter);
      return String.format("%s\t%.1f", appTime, this.hour_Or_Sale);
   }
}
