package SetData;

import java.io.*;
import java.util.Properties;

public class WriteData {
    public static void main(String[] args) throws IOException {

        // Step 1: create an object of the FileWriter Class
       // FileWriter fw = new FileWriter((System.getProperty("user.dir")+ "\\src\\test\\java\\ReadAndWrite\\TestData_v2.properties"),true); // el true sirve para el append de la data en vez de reemplazar. Por otro lado, si le cambias el nombre al archivo te crea un nuevo file (ej TestData_v2.properties).
        FileOutputStream fo= new FileOutputStream((System.getProperty("user.dir")+ "\\src\\test\\java\\ReadAndWrite\\TestData.properties"),true);

        // Step 2: create an object of properties Class.

        Properties p= new Properties();

        //Step 3: use set properties/ store method to set property

        p.setProperty("url","rcvacademy.com");
        p.store(fo, "Sample comments fo");

    }
}
