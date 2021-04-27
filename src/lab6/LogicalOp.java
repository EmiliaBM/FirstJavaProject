package lab6;

  import java.util.ArrayList;
  import java.util.List;

public class LogicalOp {

    //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, fiecare pe rand nou.

    public void getMyList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
    //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addToTheList(List<Integer> list , int numb){
        list.add(numb);
        System.out.println(list);
    }

    //3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
    // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand,
    // toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void addToMyList(List<Integer> list , int numb){
        list.add(0,numb);
        for (Integer element : list)
            System.out.println(element);
    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
    // unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void addTo (List l , int pozition , String obj){
        l.add(pozition , obj );
        System.out.println(l);
    }
    //6.Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void addToFirstPoz(List l , String Text){
        l.add(0 , Text);
        System.out.println(l);
    }

}
