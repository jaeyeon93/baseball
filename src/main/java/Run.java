import java.util.ArrayList;

public class Run {
    public static void main(String [] args){
        int inputNumber = Input.input();
        System.out.println("Input number is : " + inputNumber);
        ArrayList<Integer> numbers = GenerateRandom.random();
        GenerateRandom.printNumbers(numbers);
    }
}
