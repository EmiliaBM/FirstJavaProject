package lab2;

public class Main {
    public static void main(String[] args) {
        int i = multiplication (3,5);
        int ii = divide (10,5);
        System.out.println(i);
        System.out.println(ii);
    }

    public static int multiplication (int first,int second){
        int multiplication = first * second;
        return multiplication;

        }


    private static int divide ( int first, int second) {
        int divide = first / second;
        return divide;

    }
}