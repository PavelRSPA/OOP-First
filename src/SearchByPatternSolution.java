import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class SearchByPatternSolution {

    public static Collection<String> filenamesInDir(String path){

        File dir = new File(path);

        ArrayList<String> filenamesList  = new ArrayList<>();

        //для каждого файла в
        for (File file : dir.listFiles()) {
            //возвращает true, если по указанному пути находится файл
            if (file.isFile()) {
                filenamesList.add(file.getName());
            }
        }

        return filenamesList;
    }

}
