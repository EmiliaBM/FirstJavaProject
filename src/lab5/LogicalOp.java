package lab5;

public class LogicalOp {

   // 2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
    // valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void printArray(int[] myArray){
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;

        } for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }
    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda
    // in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza un array,
    // deci acesta va trebui surprins si afisat folosind o bucla.

    public int[] evenArray(int[] evenArray){
        for (int i = 0; i < 100; i++) {
            evenArray[i] = i++;

        }for (int i = 0; i < evenArray.length; i++){

            System.out.println(evenArray[i]);
        }

        return evenArray;
    }

    // 4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie
    // populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public double getAverageOf (int[] getAverage){
        double sum = 0;
        for (int i = 0; i< getAverage.length; i++){
            sum+= getAverage[i];
        }
        return sum/getAverage.length;
    }

    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri,
    // populat cu valori, si un parametru de tip String.
    // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
    // iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean findTheText(String[] findNumber, String search){
        for (int i = 0; i < findNumber.length; i++){
            if(findNumber[i] == search)
                return true;

        }
        return false;
    }
    //6. Creati o metoda care sa primeasca un parametru de tip array de numere,
    // populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul primit se afla in array-ul primit,
    // si daca da, atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int findIndex(int[]findIndex, int number){

        int index=0;
        for(int i=0;i<findIndex.length;i++){
            if(findIndex[i]==number){
                index=i;
            }
        }
        return index;
    }

    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    //
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -

    public String[][] pattern(String[][] pattern){
        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++)
            {
                System.out.printf(" - ", pattern[i][j]);
            }
            System.out.println();
        }
        return pattern;
    }

    //8. Creati o metoda care sa primeasca un parametru de tip array de numere,
    // populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit,
    // fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean findNumb(int[] findNumb, int searchNum){
        for (int i = 0; i < findNumb.length; i++){
            if(findNumb[i] == searchNum)
                return true;

        }
        return false;
    }


}
