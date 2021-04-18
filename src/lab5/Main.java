package lab5;

public class Main {

    public static void main(String[] args){

   //1.
    Calculator calc = new Calculator();
    System.out.println (calc.calcul(2,5));
    System.out.println(calc.calcul(4,5,7));
    System.out.println(calc.calcul(3,4,5,6));
    System.out.println(calc.calcul(7,6));

    System.out.println();

    //2.
    int myArray [] = new int[100];
    LogicalOp logicalOp = new LogicalOp();
    logicalOp.printArray(myArray);

    System.out.println();

    //3.
    int[] evenArray  = new int[100];
    logicalOp.evenArray(evenArray);

    System.out.println();

    //4.
    int[] getAverageOf = {5,6,7,8,9};
    logicalOp.getAverageOf(getAverageOf);
    System.out.println(logicalOp.getAverageOf(getAverageOf));

    System.out.println();

   //5.
    String[] findTheText = {"Motto","ATV","Texting","IT"};
    String search = "IT";
    System.out.println(logicalOp.findTheText(findTheText, search));

    System.out.println();

    //6.
    int[] findIndex = {1,6,29,87,66,99};
    int number = 29;
    System.out.println(logicalOp.findIndex(findIndex,number));

    System.out.println();

    //7.
    String [][] pattern = new String[10][10];
    logicalOp.pattern(pattern);

    System.out.println();

    //.8
    int[] findNumb = {1,3,5,6,8,9,25};
    int searchNum = 7;
    System.out.println(logicalOp.findNumb(findNumb, searchNum));


    }


}
