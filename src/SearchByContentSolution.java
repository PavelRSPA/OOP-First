import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SearchByContentSolution {


    //считывает все файлы в директории
    public static List<File> readFilesDirectory(String path) {
        //создали директорию
        File[] dir = new File(path).listFiles();

        List<File> lst = new ArrayList<>();
        if (dir == null) {
            return lst;
        }
        //для каждого файла в
        for (File file : dir) {
            //возвращает true, если по указанному пути находится файл
            if (file.isFile())
                lst.add(file);
        }


        return lst;
    }


    public static void printLines(List<File> filesList, String sl) throws FileNotFoundException {
        File dataFile = filesList.get(0);
        Scanner scanner = new Scanner(dataFile);

        ArrayList<String> linesArraylist = new ArrayList<>();
        while (scanner.hasNextLine()) {
            linesArraylist.add(scanner.nextLine());
        }

        int i = 0;
        while (i < linesArraylist.size()) {
            System.out.println(linesArraylist.get(i));
            i++;
        }

        if (Objects.equals(linesArraylist.get(0), sl)) {
            System.out.println("одна и та же линия");
        }

    }


    //возвращает список с файлами, в которых найдено вхождение
    public static ArrayList<File> searchByContent(List<File> filesList, String searchLine) {

        int i = 0;
        ArrayList<File> result = new ArrayList<>();
        while (i < filesList.size()) {
            File dataFile = filesList.get(i);
            if (checkFileContent(dataFile, searchLine)) {
                result.add(filesList.get(i));
            }
            i++;
        }
        return result;
    }


    //создает список строк из строк переданного файла
    public static boolean checkFileContent(File dataFile, String searchLine) {
        try (Scanner scanner = new Scanner(dataFile)) {
            ArrayList<String> linesArraylist = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (nextLine.equals(searchLine) || nextLine.contains(searchLine)) {
                    return true;
                }
            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("fileNotFoundException");
        }
        return false;
    }


    public static boolean searchEntryInLineResult(ArrayList<String> arraylist, String searchLine) {
        return false;
    }

    public static void printer(List<File> lf) {
        System.out.println(lf);
    }


}

