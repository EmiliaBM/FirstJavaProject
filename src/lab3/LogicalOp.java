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
}
