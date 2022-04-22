package contactsmanager;

import java.util.Scanner;

public class Input {

    /* CREATE NEW INSTANCE OF SCANNER CLASS */
    private static Scanner scan = new Scanner(System.in);

    /* GET DYNAMIC USER NAME */
    public static String getUserName(String prompt) {
        System.out.println(prompt);

        String userName = scan.nextLine();
        testName(userName);
        return userName;
    }


    public static String testName(String test){
        return test;
    }


    /* GET DYNAMIC USER PHONE NUMBER */
    public static String getUserPhoneNumber(String prompt) {
        System.out.println(prompt);

        String phoneNumber = scan.nextLine().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        return phoneNumber;
    }
}
