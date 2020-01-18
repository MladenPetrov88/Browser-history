import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();


        while (true) {
            String line = scanner.nextLine();
            String output = "";


            switch (line) {
                case "back":
                    if (stack.size() <= 1) {
                        System.out.print("no previous URLs");
                    } else {
                        stack.pop();
                        output = stack.peek();
                    }
                    break;
                case "Home":
                    return;
                default:
                    output = line;
                    stack.push(line);
            }

            System.out.println(output);

        }
    }

}
