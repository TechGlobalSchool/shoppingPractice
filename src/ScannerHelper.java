import java.util.Scanner;

public class ScannerHelper {


    /**
     * Second this class
     *
     * Create Three methods which will take String question
     * it will print the question, and it will take
     * String, int, double
     *
     * getString(String question)
     * getInt(String question)
     * getDouble(String question)
     */

    /**
     *
     * @param question -> this paramater is for printing out my question
     * @return the input that I got from user as String
     */
    public static String getString(String question){
        System.out.println(question);
        return scan().nextLine();
    }


    public static int getInt(String question){
        System.out.println(question);
        return scan().nextInt();
    }

    public static double getDouble(String question){
        System.out.println(question);
        return scan().nextDouble();
    }

    public static Scanner scan(){
//      NOT THIS ==>  Scanner scanner = new Scanner(System.in);
        return new Scanner(System.in);
    }

}
