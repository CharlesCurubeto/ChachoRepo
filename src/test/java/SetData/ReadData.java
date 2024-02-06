package SetData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
    public static void main(String[] args) throws IOException {

        // Step 1: create an object of the FileReader Class
        FileReader fr = new FileReader((System.getProperty("user.dir")+ "\\src\\test\\java\\ReadAndWrite\\TestData.properties")); // le pongo la ruta de las propiedades (testData.propierties)
        FileInputStream fi= new FileInputStream((System.getProperty("user.dir")+ "\\src\\test\\java\\ReadAndWrite\\TestData.properties"));

        // Step 2: create an object of properties Class.

        Properties p= new Properties();

        //Step 3: Load the properties file
        p.load(fr);
        p.load(fi);

        //Step 4: use the method get properties

        System.out.println(p.getProperty("website"));
        System.out.println(p.getProperty("name"));

        System.out.println(System.getProperty("user.dir")); // asi se puede obtener la dirección del repositorio. Entonces esto lo uso arriba para acotar la direccion. Se hace esto para poder compartir, y que cada maquina busque la dire de su repositorio.

    }
}
/*
Cuando usar cada unas de las clases:
Tanto FileInputStream como FileReader son clases en Java que se utilizan para leer datos de archivos, pero hay una diferencia clave en cómo manejan esos datos:

FileInputStream: Esta clase se utiliza para leer bytes brutos de un archivo. Funciona bien para archivos binarios, como imágenes o archivos de audio, donde los datos no tienen una representación de texto clara. Puedes pensar en FileInputStream como una corriente de bytes crudos.
FileReader: En cambio, FileReader se utiliza para leer caracteres de un archivo de texto. Es especialmente útil cuando estás trabajando con archivos que contienen texto, como archivos de configuración o archivos de código fuente. FileReader automáticamente decodifica los bytes en caracteres, utilizando el juego de caracteres predeterminado del sistema.

En resumen, si estás leyendo un archivo que contiene texto y quieres manejar los datos como caracteres, usa FileReader. Si estás trabajando con un archivo binario y necesitas leer bytes sin preocuparte por la codificación de caracteres, entonces FileInputStream sería más adecuado.

Es importante destacar que, en la práctica, se recomienda utilizar BufferedReader o BufferedInputStream junto con estas clases para mejorar la eficiencia de lectura al realizar lecturas en búfer.

 */