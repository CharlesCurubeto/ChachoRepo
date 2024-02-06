package Read_Write_Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataXLS {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook= new XSSFWorkbook();

        XSSFSheet sheet1= workbook.createSheet("Sheet1");

        Row r0= sheet1.createRow(0);
        Cell c0= r0.createCell(0);
        c0.setCellValue("Prueba");

        File f = new File(System.getProperty("user.dir") +"\\src\\test\\java\\Excel_Data\\TestData.xlsx");
        FileOutputStream fos= new FileOutputStream(f);
        workbook.write(fos);
        fos.close();
        workbook.close();

        System.out.println("File is written successfully");
    }
}
