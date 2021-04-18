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


        int first = 17;
        System.out.println(op.TrueOrFalse(first));

        System.out.println();

        int varsta = 21;
        System.out.println(op.isEligibleToVote(varsta));

        System.out.println();


        int one = 12;
        int two = 13;
        int three = 14;

        System.out.println(op.WhichOneIsBigger(one, two, three));

    }
}





