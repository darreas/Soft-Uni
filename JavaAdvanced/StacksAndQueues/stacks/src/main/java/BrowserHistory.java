import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();

        String currentURL = "";

        while (!input.equals("Home")){
            if (input.equals("back")){
                if (stack.size() > 1){
                    stack.pop();
                    currentURL = stack.peek();
                    System.out.println(currentURL);
                }else{
                    System.out.println("no previous URLs");
                }
            }else {
                stack.push(input);
                currentURL = stack.peek();
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }
    }
}
