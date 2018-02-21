import java.util.ArrayList;

public class Run {
    static int inputNumber;

    public static void main(String [] args){
        // make instance
        Input input = new Input();
        Operator operator = new Operator();

        // generate random number
        ArrayList<Integer> shuffle =  GenerateRandom.shuffle(GenerateRandom.numbers);
        ArrayList<Integer> resultNumbers = GenerateRandom.resultNumber(shuffle);
        int result = GenerateRandom.result(resultNumbers);
        System.out.println();

        while (inputNumber != result){
            System.out.println("숫자를 입력하세요");
            int inputNumber = input.input();
            System.out.println("입력한 수 : " + inputNumber);

            // operating area
            ArrayList<Integer> inputSplit = operator.splitInt(inputNumber);
            operator.printSplitInt(inputSplit);

            System.out.println();

            // result area
            int countNumber =operator.findStrike(inputSplit , shuffle);
            operator.resultStrike(countNumber);

            int countBall = operator.findBall(inputSplit, shuffle);
            operator.resultBall(countBall);

            int countStrike = operator.findStrike(inputSplit, resultNumbers);

            // finish
            if(inputNumber == result)
                break;
        }

    }
}
