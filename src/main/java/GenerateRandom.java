import java.util.ArrayList;
import java.util.Random;

public class GenerateRandom {
    static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> random(){
        for(int i = 0; i < 10; i++){
            int random = (int)Math.floor(Math.random() * 9 + 1);
            numbers.add(random);
        }
        return numbers;
    }

    public static void printNumbers(ArrayList<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
