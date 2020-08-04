package readandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    public static final String filepath = System.getProperty("user.dir") + "/DataTest/Book1.xlsx";
    // /Users/arman430/IdeaProjects/DamoProject/DataTest

    public static void main(String[] args) throws IOException {
        // System.out.println(System.getProperties());
        writeExcel(filepath);

    }

    public static void writeExcel(String filName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Students Details");

        Object[][] stDetail = {
                {"SL", "FirstName", "LaseName", "Address", "ConNum"},
                {"123", "Arman", "Hossain", "NY", "3283479"},
                {"126", "Shakib", "RAhman", "PA", "32834279"},
                {"153", "maruf", "parvaz", "WA", "3283479"},
                {"143", "sultana", "farhat", "FA", "34798279"},
                {"443", "Umme", "jaren", "MA", "667888279"}

        };
        int rowNum = 0;
        System.out.println("Excel file is created");
        for (Object[] std : stDetail) {
            Row row = sheet.createRow(rowNum++);

            int calNum = 0;
            for (Object field : std) {
                Cell cell = row.createCell(calNum++);

                if (field instanceof String) {
                    cell.setCellValue((String) field);
                }
                else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);

                }

            }

        }
        try{
            FileOutputStream out=new FileOutputStream(filName);
            workbook.write(out);
        }
        catch(FileNotFoundException e){
            System.out.println("");
            workbook.close();
        }
        catch (IOException e) {
            System.out.println("Done");
        }


    }
}
