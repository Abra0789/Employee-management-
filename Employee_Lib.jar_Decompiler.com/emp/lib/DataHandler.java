package emp.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataHandler {
   private static String fileName = "data.txt";

   public static void saveData(Company emp) {
      ObjectOutputStream oos = null;

      try {
         oos = new ObjectOutputStream(new FileOutputStream(fileName));
         oos.writeObject(emp);
      } catch (FileNotFoundException var13) {
         var13.printStackTrace();
      } catch (IOException var14) {
         var14.printStackTrace();
      } finally {
         try {
            oos.close();
         } catch (IOException var12) {
            var12.printStackTrace();
         }

      }

   }

   public static Company loadData() throws FileNotFoundException, IOException, ClassNotFoundException {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
      Company emp = (Company)ois.readObject();
      ois.close();
      return emp;
   }
}
