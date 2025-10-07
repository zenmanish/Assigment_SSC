import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Encoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to encode: ");
        String input = scanner.nextLine();
        String encodedString = encode(input);
        System.out.println("Encoded string: " + encodedString);
        scanner.close();

        }

        private static String encode(String str ) {
        if(str == null || str.isEmpty())
            return "";

            StringBuilder encoded = new StringBuilder();
            int count = 1;
            char preChar = str.charAt(0);

            for (int i = 1; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (currentChar == preChar) {
                    count++;
                } else {
                    encoded.append(preChar).append(count);
                    preChar = currentChar;
                    count = 1;
            }

            }
            encoded.append(preChar).append(count);

            return encoded.toString();
        }

}