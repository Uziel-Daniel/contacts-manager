package contactsmanager;

import java.util.Scanner;

public class Input {

    /* CREATE NEW INSTANCE OF SCANNER CLASS */
    private static Scanner scan = new Scanner(System.in);

    /* GET DYNAMIC USER NAME */
    public static String getUserName(String prompt) {

        System.out.println(prompt);

        return scan.nextLine();
    }

    /* GET DYNAMIC USER PHONE NUMBER */
    public static String getUserPhoneNumber(String prompt) {

        System.out.println(prompt);

        String phoneNumber = scan.nextLine().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2 - $3");
        if (phoneNumber.length() == 16)
            return phoneNumber;
        else {
           return  getUserPhoneNumber("\033[1;31m please enter a number that is 10 digits without special characters");
        }
    }

    /* GET DYNAMIC USER NAME */
    public static String getUserChoice(String prompt) {

        System.out.println(prompt);

        return scan.nextLine();
    }
}
