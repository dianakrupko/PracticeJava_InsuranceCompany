import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException {
        DataExcel dataExcel=new DataExcel();
        String[][] arr=dataExcel.nameEx("example.xls");
        System.out.println("============");
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]!=null) {
                System.out.println(Arrays.deepToString(arr[i]));
            }
        }
    }
}
