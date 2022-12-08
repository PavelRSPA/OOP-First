import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("путь до директории:");
        String path = in.nextLine();
        System.out.print("строка, искомая в файле или имя файла:");
        String searchline = in.nextLine();
        System.out.print("тип операции (1/2):");
        int typeOfSolution  = in.nextInt();
        Servise.choseSolution(path,searchline,typeOfSolution);

        while (true){
                if (in.hasNextLine()) {
                    if (Objects.equals(in.nextLine(), "ok")) {
                        break;
                    }
                }
            }
        }

        //String path = "C:\\Users\\IdeaProjects\\OOP_First-master\\OOP_First-master\\files";
        //String searchline = "1";
        //int typeOfSolution=1;

        //комп
        //C:\\Users\\theco\\IdeaProjects\\OOP-First\\files
        //первый.txt
    }
