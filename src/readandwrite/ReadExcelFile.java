package readandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {

    public static final String fileName= System.getProperty("user.dir")+ "/DataTest/Book1.xlsx";

    public static void main(String[] args) throws FileNotFoundException {
        readExcelFile(fileName,0);

    }

    public static void readExcelFile(String fileName, int sheetNumber) throws FileNotFoundException {
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            Workbook workbook= new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet= workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator= dataTypeSheet.iterator();
            while (rowIterator.hasNext()){
                Row currentRow= rowIterator.next();
                Iterator<Cell> cellIterator= currentRow.iterator();
                while (cellIterator.hasNext()){
                    Cell currentCell=cellIterator.next();

                    if (currentCell.getCellType()== CellType.STRING){
                        System.out.print(currentCell.getStringCellValue()+" ");

                    }
                    else if (currentCell.getCellType()== CellType.NUMERIC){
                        System.out.print(currentCell.getNumericCellValue()+ " ");

                    }
                }
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e1){
            System.out.println("reading done");


        }
    }
}
