package lab4;

public class LogicalOp {
    //  1. Creati o metoda in clasa LogicalOp, care
    //  sa primeasca un numar ca si parametru.
    //  Metoda sa verifice numarul primit, si sa afiseze
    //  in consola o numaratoare pana la 100, pornind de
    //  la numarul primit ca si parametru. Atentie la crearea
    //  tipului metodei, deoarece metoda afiseaza, nu returneaza.
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public void printToAhundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.


    public void printToMinusAhundred(int number) {
        for (int x = number; x >= -100; x--) {
            System.out.println(x);
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul
    // parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y
    // este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    //
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    //
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public void Counting(int from, int to) {
        for (from = 6; from <= to; from++) {
            System.out.println(from);
        }

    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
    // o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul
    // parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci
    // numaratoarea sa fie de la y la x).
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    //
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public void Big(int small, int bigger) {
        for (int i = small; small <= bigger; small++) {
            System.out.println(small);
        }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.


    public void Par(int first, int last) {
        for (int a = first; a <= last; a++) {
            if (a % 2 == 0) {
                System.out.println(a + " ");
            }
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void imPar(int first, int last) {
        for (int a = first; a <= last; a++) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        }
    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru
    // a verifica daca functioneaza.

    public void Sum(int start, int finish) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }
    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa
    // Main, metoda main() pentru a verifica daca functioneaza.

    public float Average(int start, int finish) {
        float sum = 0;
        int count = 0;
        for (int i = start; i <= finish; i++) {
            sum += 1;

            count++;
        }
        return = sum / count;
    }

}





