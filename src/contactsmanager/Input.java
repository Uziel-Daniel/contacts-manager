package contactsmanager;

import java.util.Scanner;

public class Input {

    private static Scanner scan = new Scanner(System.in);

    public static String getUserName(String prompt) {
        System.out.println(prompt);

        return scan.nextLine();
    }

    public static String getUserPhoneNumber(String prompt) {
        System.out.println(prompt);

        String phoneNumber = scan.nextLine().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        return phoneNumber;
    }
}
