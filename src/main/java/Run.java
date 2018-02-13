import java.util.ArrayList;

public class Run {
    public static void main(String [] args){
        Input input = new Input();
        int inputNumber = input.input();
        System.out.println("Input number is : " + inputNumber);

        Operator operator = new Operator();
        ArrayList<Integer> inputSplit = operator.splitInt(inputNumber);
        operator.printSplitInt(inputSplit);

        System.out.println();

        ArrayList<Integer> rndSplit = GenerateRandom.random();
        GenerateRandom.printNumbers(rndSplit);
        System.out.println();
        int countNumber =operator.findStrike(inputSplit , rndSplit);
        operator.resultStrike(countNumber);

        int countBall = operator.findBall(inputSplit, rndSplit);
        operator.resultBall(countBall);
    }
}
