package lab3;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        int x = op.checkBiggerNumber(2, 5);
        System.out.println(x + "este cel mai mare");

        System.out.println();

        String text = op.EgualsFastTrackIt("FastAndFurious");
        System.out.println(text);

        System.out.println();

        String texts = "FasterThanYou";
        int number = 5;
        System.out.println(op.Fast(texts,number));

        System.out.println();

        int numbers = 10;
        System.out.println(op.Snow(numbers));

        System.out.println();

        int numb = 11;
        System.out.println(op.BiggerOrLower(numb));

        System.out.println();

        // Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
        // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
        // "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. Pentru exemplul
        // de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de
        // la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
        // Apelati metoda in main() pentru a verifica daca functioneaza.


        int first = 17;
        System.out.println(op.TrueOrFalse(first));

        System.out.println();

        int varsta = 21;
        System.out.println(op.isEligibleToVote(varsta));

        System.out.println();



    }
}





