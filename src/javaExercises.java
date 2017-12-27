public class javaExercises {


    public static void printSingleAsterisk(){
        System.out.println("*");
    }

    public static void printAsteriskPerLine(int n){
        for (int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    public static void printAsterisksOnSingleLine(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
    }

    public static void printIncrementalAsterisksPerLine(int n){
        for (int j = 1; j < n+1; j++){
            for(int i = 0; i < j; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSingleAsterisk();
        System.out.println("\n");
        printAsteriskPerLine(3);
        System.out.println("\n");
        printAsterisksOnSingleLine(3);
        System.out.println("\n");
        printIncrementalAsterisksPerLine(7);
    }
}
