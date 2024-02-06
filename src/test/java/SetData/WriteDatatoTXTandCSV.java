package SetData;

import java.io.*;
import java.util.Properties;

public class WriteDatatoTXTandCSV {
    public static void main(String[] args) throws IOException {



        // Step 1: create an object of the FileWriter Class
       FileWriter fw = new FileWriter((System.getProperty("user.dir")+ "\\src\\main\\Txt\\Prueba_2.txt"), true);  // si no existe el archivo lo crea, pero la primera vez no agrega nada.


        //Step 2: create an object of BufferedWriter class

        BufferedWriter br = new BufferedWriter (fw);

        // Step 3: write data.
        br.write("Esto es algo que agrego"); // Si es un csv al string le pongo una coma. Ej: ("Esto es algo que agrego"+",")

        //Step 4: close the file
        br.close();


    }
}

/*
Nota el primer paso se podría haber hecho asi (creando un objeto de la clase File):

  File f = new File ((System.getProperty("user.dir")+ "\\src\\main\\Txt\\Prueba_2.txt");
  FileWriter fw = new FileWriter(fw, true);

 */