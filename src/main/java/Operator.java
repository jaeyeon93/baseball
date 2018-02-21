import java.util.ArrayList;
import java.util.Collections;

public class Operator {
    ArrayList<Integer> splitInt = new ArrayList<>();
    public ArrayList<Integer> splitInt(int inputNumber){
        while(inputNumber != 0){
            splitInt.add(inputNumber % 10);
            inputNumber /= 10;
        }
        Collections.reverse(splitInt);
        return splitInt;
    }

    public Integer findStrike(ArrayList<Integer> arrInt, ArrayList<Integer> arrRnd){
        int countStrike = 0;
        for(int i = 0; i < arrInt.size(); i++){
            if (arrInt.get(i) == arrRnd.get(i)){
                countStrike++;
            }
        }
        return countStrike;
    }

    public void resultStrike(int countStrike){
        if (countStrike == 3){
            System.out.println("3진 아웃");
        }

        if (countStrike == 2){
            System.out.println("2스트라이크");
        }

        if (countStrike == 1){
            System.out.println("1스트라이크");
        }
    }

    public Integer findBall(ArrayList<Integer> arrInt, ArrayList<Integer> arrRnd) {
        int countBall = 0;
        for(int i = 0; i < arrInt.size(); i++){
            if(arrInt.contains(arrRnd.get(i))){
                if(arrInt.get(i) != arrRnd.get(i))
                    countBall++;
            }
        }
        return countBall;
    }

    public void resultBall(int countBall){
        if (countBall == 3){
            System.out.println("3Ball");
        }

        if (countBall == 2){
            System.out.println("2Ball");
        }

        if (countBall == 1){
            System.out.println("1Ball");
        }
    }

    public void printNothing(int countBall, int countStrike){
        if (countBall == 0 && countStrike == 0)
            System.out.println("Nothing");
    }

}
