
public class Servise {

    public static void choseSolution(String path, String searchLine, int typeOfSolution) {
      switch (typeOfSolution){
          case 1:
                 Solutions.solutionByContent(path,searchLine);
                case 2:
                    Solutions.solutionByPattern(path,searchLine);
          default:
              System.out.println("ВВЕДИТЕ ok");
        }
    }
}
