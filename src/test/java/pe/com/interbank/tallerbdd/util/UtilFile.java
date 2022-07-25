package pe.com.interbank.tallerbdd.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UtilFile {

    public static void main(String[] args){
        UtilFile.loadFile();
    }

    public static void loadFile(){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Date currentDate = new Date();
            //ED_20210714.txt
            String pathname = "C:\\Users\\Ronald Angulo\\Downloads\\ED_"
                    .concat(sdf.format(currentDate)).concat(".txt");
            System.out.println("pathname:" + pathname);
            File txtFile = new File(pathname);
            BufferedReader bfreader = new BufferedReader(new FileReader(txtFile));
            String line;
            while((line = bfreader.readLine()) != null){
                //System.out.println("ROW:" + line);
                String[] datos = line.split("\\|");
                System.out.println("  -- NUM DOC:" + datos[1]);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}