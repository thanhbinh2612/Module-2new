package optionalbaitapdocfilecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVRender {
    public static void main(String[] args) {
        String csvFile = "IO-TextFile\\src\\optionalbaitapdocfilecsv\\country.csv";
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";

        try{
            br= new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String [] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[4] + ",name=" + country[5] + "]");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (br != null){
                try{
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
