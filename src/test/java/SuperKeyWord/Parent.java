package SuperKeyWord;

import java.security.PublicKey;

public class Parent {

    public Parent()
    {
        System.out.println("Parent Constructor"); // el constructor tiene (para el child) un super key por defaoult, por eso se imprime por mas que no lo invoque.
    }

    public Parent(int i)
    {
        System.out.println("Parameterized Parent Constructor"); // el constructor tiene (para el child) un super key por defaoult, por eso se imprime por mas que no lo invoque.
    }
    String empName = "Tom";
    int empNo= 4566 ;

    public void getData()
    {
        System.out.println(empName);
        System.out.println(empNo);
    }
}
