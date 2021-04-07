package lab3;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        int x = op.checkBiggerNumber(2, 5);
        System.out.println(x + "este cel mai mare");

        String text = op.EgualsFastTrackIt("FastAndFurious");
        System.out.println(text);


    }
}


