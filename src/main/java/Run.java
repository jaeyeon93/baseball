import java.util.ArrayList;

public class Run {
    static int inputNumber;

    public static void main(String [] args){
        // make instance
        Input input = new Input();

        // generate random number
        ArrayList<Integer> shuffle =  GenerateRandom.shuffle(GenerateRandom.numbers);
        ArrayList<Integer> resultNumbers = GenerateRandom.resultNumber(shuffle);
        int result = GenerateRandom.result(resultNumbers);
        int count = 0;
        while (inputNumber != result){
            System.out.println("숫자를 입력하세요");
            int inputNumber = input.input();

            // operating area
            Operator operator = new Operator();
            ArrayList<Integer> inputSplit = operator.splitInt(inputNumber);

            // result area
            int countNumber =operator.findStrike(inputSplit , shuffle);
            operator.resultStrike(countNumber);
            int countBall = operator.findBall(inputSplit, shuffle);
            operator.resultBall(countBall);
            operator.printNothing(countBall, countNumber);

            count++;
            // finish
            if(inputNumber == result){
                System.out.println("숫자야구 게임 끝");
                System.out.println(count + "번만에 맞췄습니다.");
                break;
            }
        }

    }
}
