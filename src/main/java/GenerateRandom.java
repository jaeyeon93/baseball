import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenerateRandom {
    static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    static ArrayList<Integer> resultNumbers = new ArrayList<>();

    public static ArrayList<Integer> shuffle(ArrayList<Integer> numbers){
        Collections.shuffle(numbers);
        return numbers;
    }

    public static ArrayList<Integer> resultNumber(ArrayList<Integer> arr){
        for(int i = 0 ; i < 3; i++){
            resultNumbers.add(arr.get(i));
        }
        return resultNumbers;
    }

    public static Integer result(ArrayList<Integer> resultNumbers){
        String result = "";
        for(int i = 0; i < resultNumbers.size(); i++){
            result += resultNumbers.get(i);
        }
        return Integer.parseInt(result);
    }
}
