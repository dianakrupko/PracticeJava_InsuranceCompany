import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DataExcel {

    public String[][] nameEx(String title) throws IOException {
        FileInputStream fis=new FileInputStream(title);
        Workbook wb = new HSSFWorkbook(fis);
        fis.close();
        Sheet sheet1 = wb.getSheetAt(0);
        int i =0;
        String[] arrLastName=new String[10];
        String[][] allar=new String[10][];
        String[][] all=new String[][]{};
        String id="";
        String lastName="";
        String type="";
        String dateStart="";
        String price="";
        for (Row row : sheet1){
//            Row row0=sheet1.getRow(i);
            id=getCellText(row.getCell(0));
            lastName=getCellText(row.getCell(1));
            type=getCellText(row.getCell(2));
            dateStart=getCellText(row.getCell(3));
            price=getCellText(row.getCell(4));
            arrLastName[i]= lastName;
            allar[i]=new String[]{lastName, type, dateStart, price};
//            System.out.println(Arrays.toString(allar[i]));
            i++;
        }
        System.out.println(Arrays.toString(arrLastName));
        return allar;
    }

    public String getCellText(Cell cell) throws IOException {
        String result="";
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                result=cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    result=cell.getDateCellValue().toString();
                } else {
                    result=Double.toString(cell.getNumericCellValue());
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                result=Boolean.toString(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_FORMULA:
                result=cell.getCellFormula().toString();
                break;
            default:
                break;
        }
        return result;
    }

}

