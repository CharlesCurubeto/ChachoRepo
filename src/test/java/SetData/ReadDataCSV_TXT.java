package SetData;

import java.io.*;
import java.util.Properties;

public class ReadDataCSV_TXT {
    public static void main(String[] args) throws IOException {

        File f = new File((System.getProperty("user.dir") + "\\src\\main\\Txt\\Prueba.txt")); // aca para que sea un csv se cambia la extension y listo.

        // Step 1: create an object of the FileReader Class

        FileReader fr = new FileReader(f);

        //Step 2: create object of a buffered reader.

        BufferedReader br = new BufferedReader(fr);

        // Step 3: Read data
       br.readLine(); // Lee la primer linea pero no la muestra.
        br.readLine();// Lee la 2da linea pero no la muestra.
        System.out.println(br.readLine()); // Lee y muestra la 3er linea del text.

        //Step 4:  Close the file
        System.out.println("Written successfully");
        br.close();

    }
}
