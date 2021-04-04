package lab2;

public class Main {
    public static void main(String[] args) {
        int i = multiplication (3,5);
        int ii = divide (10,5);
        float iii = divide (27,5f);
        System.out.println(i);
        System.out.println(ii);
        System.out.println(iii);
    }

    public static int multiplication (int first,int second){
        int result = first * second;
        return result;

        }

    private static int divide ( int first, int second) {
        int result = first / second;
        return result;

    }
    private static float divide ( float first, float second) {
        float result = first / second;
        return result;

    }
}