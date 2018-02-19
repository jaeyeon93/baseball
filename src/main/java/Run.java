import java.util.ArrayList;

public class Run {
    public static void main(String [] args){
        Input input = new Input();
        System.out.println("숫자를 입력하세요");
        int inputNumber = input.input();
        System.out.println("입력한 수 : " + inputNumber);

        Operator operator = new Operator();
        // input area
        ArrayList<Integer> inputSplit = operator.splitInt(inputNumber);
        operator.printSplitInt(inputSplit);

        System.out.println();
        // random generate area
        ArrayList<Integer> shuffle =  GenerateRandom.shuffle(GenerateRandom.numbers);
        ArrayList<Integer> resultNumbers = GenerateRandom.resultNumber(shuffle);
        GenerateRandom.printResultNumbers(resultNumbers);
        System.out.println();

        // result area
        int countNumber =operator.findStrike(inputSplit , shuffle);
        operator.resultStrike(countNumber);

        int countBall = operator.findBall(inputSplit, shuffle);
        operator.resultBall(countBall);

        int countStrike = operator.findStrike(inputSplit, resultNumbers);


    }
}
