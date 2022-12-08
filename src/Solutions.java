import java.io.File;
import java.util.List;

public class Solutions {


    public static void solutionByContent(String path, String lineForFound){

        List<File> myFilesList = SearchByContentSolution.readFilesDirectory(path);

        int i=0;
        if((SearchByContentSolution.searchByContent(myFilesList,lineForFound)).size()!=0){
            while(i < SearchByContentSolution.searchByContent(myFilesList,lineForFound).size()){
                System.out.println(SearchByContentSolution.searchByContent(myFilesList,lineForFound).get(i));
                i++;
            }
        }

    }


    public static void solutionByPattern(String path, String filenameByPattern)  {

       File files = new File(path);

        for (File i:files.listFiles()){
            if(i.getName().equals(filenameByPattern)){
                System.out.println(i);
            }
        }

    }



}
