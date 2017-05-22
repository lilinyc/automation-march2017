package cellphones;

import base.CommonAPI;
import utility.reader.DataReader;
import utility.reporting.TestLogger;

import java.io.IOException;

/**
 * Created by Lili on 5/21/2017.
 */
public class ItemsToBeSearched extends CommonAPI{

    DataReader dr = new DataReader();
    public String [][] getSearchDataFromExcelFile()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir")+"/data/tmobileSearch.xls";
        String [][] st = dr.multiColumnFileReader(path);
        return st;
    }
}
