package infoprotect.lab5;

import java.io.IOException;
import java.util.*;

/**
 * Created by darya on 11.10.15.
 */
public class Sys {
    Map<String, User> userMap = new HashMap<>();
    List<String> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void menuUser() throws IOException {
        int choice;

        do {
            System.out.println("Change password - 0, exit - 1");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    System.out.println("No such option");
                    break;
            }
        } while (choice != 1);
    }

    public static void menuAdmin() throws IOException {
        int choice;
        do {
            System.out.println("Change password - 0, show list of users - 1, block user - 2, exit - 3");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Change password - 0, show list of users - 1, block user - 2, exit - 3");
                    break;
            }
        } while (choice != 3);
    }

    public static void main(String[] args) throws IOException {

    }
}
