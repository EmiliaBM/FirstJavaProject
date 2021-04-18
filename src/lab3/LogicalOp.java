package lab3;

public class LogicalOp {

    // In clasa LogicalOp, creati o metoda de tip int,
    // care sa se numeasca checkBiggerNumber(), si sa
    // primeasca doua int-uri ca si parametrii.
    // Folosind if - else, verificati in interiorul
    // metode care numar este mai mare,
    // dintre cele doua valori care va vin ca si parametrii,
    // si returnati numarul mai mare.


    public int checkBiggerNumber(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;

        }

    }
    // Creati o metoda de tip String, care sa primeasca
    // un parametru de tip String. Verificati daca textul
    // ce vine ca si parametru este egal cu “FastTrackIT”.
    // Daca da, atunci metoda sa returneze “Learning text comparison”.
    // Daca nu, atunci metoda sa returneze “Got to try some more”.

    public String EgualsFastTrackIt(String text ){


        if (text.equals("FastTrackIt")) {
            return ("Learning text comparison");
        }
        else
            return ("Got to try some more");

    }

    //Creati o metoda de tip String, care sa primeasca un parametru de tip String,
    // si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”,
    // si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul,
    // in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
    // returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica
    // daca functioneaza.

    public String Fast(String texts, int number){

        if(texts.equals("FastTrackIt") && number <=3){
        return (texts + number);
    }
        else if (texts.equals("FastTrackIt") && number >=4){
        return (number + texts);
    }
        else{
        return ("neither");
    }
    }

    //  Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    //  Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
    //  “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze
    //  “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a
    //  verifica daca functioneaza.

    public String Snow (int numbers){

        if( numbers > 8 || numbers == 6){
            return ("The amount of snow this winter was(cm):"+numbers);
        }
        else {
            return ("The forecast snow is(cm):"+numbers);
        }

    }

    // Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is
    // greater than 3 and not equal to 4”. Daca numarul este egal cu 4, returnati
    // “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati
    // “The number is lower than 3”. Apelati metoda in main() pentru a verifica
    // daca functioneaza.

    public String BiggerOrLower (int numb){

        if(numb >3 && numb !=4){
            return ("The number is greater than 3 and not equal to 4");
        }
        else if( numb == 4){
            return ("The number is equal to 4");
        }
        else if( numb<3){
            return ("The number is lower than 3");
        }
        else
            return("");

            }


    // Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un
    // numar, si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar
    // sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean TrueOrFalse(int first){

        if(first % 2 == 0){
            return true;
        }
        else
            return false;
    }

    //Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
    // care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta
    // e peste 18, sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a
    // verifica daca functioneaza.

    public boolean isEligibleToVote(int varsta){

        if(varsta>18){
            return true;
        }
        else
            return false;

    }

    //Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int WhichOneIsBigger (int one, int two, int three){

        if(one>two && one>three){
            return one;
        }
        else if(two>one && two>three){
            return two;
        }
        else if(three>one && three>two){
            return three;
        }
        else
            return 0;
    }

}
