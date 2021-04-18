package lab5;

public class Calculator {

    //1. In proiectul de Calculator, in clasa Calculator,
    // supraincarcati toate metodele conform principiului
    // polimorfismului. Creati cel putin cate doua metode
    // polimorfe pentru fiecare metoda pe care o aveti in clasa.
    //
    //Spre exemplu, pentru metoda de adunare, faceti ca
    // aceasta sa lucreze o data cu 2 int-uri, o data cu 2
    // float-uri, cu 3 float-uri, cu 4 int-uri, etc.
    // Atentie ce returnati la final!
    //
    //Apelati metodele in Main pentru a testa daca functioneaza.

    public float calcul(float first, float second){
        float sum = 0f;
        sum+= first + second;
        return sum;
    }
    public float calcul(float first, float second, float third){
        float sum = 0f;
        sum+= first + second+ third;
        return sum;
    }
    public float calcul(float first, float second, float third, float forth){
        float sum = 0f;
        sum+= first + second+ third + forth;
        return sum;
    }
    public int calcul(int first, int second){
        int sum = 0;
        sum+= first + second;
        return sum;
    }
}
