import java.util.Scanner;

public class vowelCounter {

    public static void main(String[] args) {

        int vowelCount = 0;
        String string, vowels = "aeıioöuü";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        string = input.nextLine();
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);

    }
}