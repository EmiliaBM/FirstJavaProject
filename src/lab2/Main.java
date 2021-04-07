package lab2;

public class Main {
    public static void main(String[] args) {
        int i = multiplication (3,5);
        int ii = divided (10,5);
        float iii = divides (27,5f);
        int iiii = average(2,5,5)/3;
        int iiiii = sum(5,7);
        int iiiiii = substract(12,5);
        int vi = multiplication(2,3,4);
        float vii = divide(12,5f);
        double viii = rest (15,6);
        double ix = Celsius( 35);
        double x = Distance (20);
        System.out.println(i);
        System.out.println();
        System.out.println(ii);
        System.out.println();
        System.out.println(iii);
        System.out.println();
        System.out.println(iiii);
        System.out.println();
        System.out.println(iiiii);
        System.out.println();
        System.out.println(iiiiii);
        System.out.println();
        System.out.println(vi);
        System.out.println();
        System.out.println(vii);
        System.out.println();
        PrintJavaEx3();
        System.out.println();
        PrintJavaRobo();
        System.out.println();
        System.out.println(viii);
        System.out.println();
        System.out.println(ix);
        System.out.println();
        System.out.println(x);


    }

    public static int multiplication (int first,int second){
        int multiplication = first * second;
        return multiplication;

    }

    public static int divided ( int first, int second) {
        int result = first / second;
        return result;

    }
    public static float divides ( float first, float second) {
        float result = first / second;
        return result;

    }

    public static int sum (int first, int second) {
        int result = first + second;
         return result;
    }

    public static int substract (int first, int second) {
        int result = first - second;
        return result;
    }

    public static int multiplication (int first, int second, int third) {
        int result = first * second * third;
        return result;
    }

    public static float divide (float first, float second) {
        float result = first / second;
        return result;
    }
    public static void PrintJavaEx3() {
        System.out.println(    "     j    a    v     v    a");
        System.out.println(    "     j   a a    v   v    a a");
        System.out.println(    "j    j  aaaaa    v v    aaaaa");
        System.out.println(    "  jj   a     a    v    a     a");
    }
    public static int average (int first, int second, int third) {
        int result = (first + second + third)/3;
        return result;

        }
    public static void PrintJavaRobo() {
        System.out.println(" + ''' + ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +_____+ ");
        
    }
    public static double rest (double first, double second){
        double rest = first % second;
        return rest;
    }
    public static double Celsius (double f){
        double c;
        c = (5/9f * (f-32f));
        return c;
    }
    public static double Distance (double inch){
        double m;
        m = inch * 0.0254;
        return m;
    }

}