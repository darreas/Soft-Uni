import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> symbols = new ArrayDeque<>();
        Collections.addAll(symbols, input);

        while(symbols.size() > 1){

            int firstNum = Integer.parseInt(symbols.pop());
            String operator = symbols.pop();
            int secondNum = Integer.parseInt(symbols.pop());
            int result = 0;
            if (operator.equals("+")){
                result = firstNum + secondNum;
            }else{
                result = firstNum - secondNum;
            }
            symbols.push(String.valueOf(result));
        }
        System.out.println(symbols.peek());

    }
}
