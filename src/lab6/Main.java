package lab6;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        List<String> myStrList = new ArrayList<>();

        myStrList.add("caine");
        myStrList.add("magie");
        myStrList.add("animal");
        myStrList.add("pisica");
        myStrList.add("dulap");
        myStrList.add("soricel");


        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(7);
        myIntList.add(5);
        myIntList.add(6);
        myIntList.add(8);
        myIntList.add(11);



        //1.
        op.getMyList(myStrList);
        //2
        op.addToTheList(myIntList,17);
        //3
        op.addToMyList(myIntList, 17);
        //5
        op.addTo(myStrList, 6, "dog");
        //6
        op.addToFirstPoz(myStrList, "dog");


    }

}

