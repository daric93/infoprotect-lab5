package infoprotect.lab5;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by darya on 11.10.15.
 */
public class User {
    String name;
    String password;
    Map<String, String> questions;
    Boolean blocked;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void changePassword() {
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println("Repeat password: ");
        if (Objects.equals(password, sc.nextLine()))
            this.password = password;
    }

    public void exit() {

    }

    public void showListOfUsers(Map<String, User> userMap) {
        userMap.forEach((s, user) -> System.out.println(s));
    }

    public void addBlock(User user) {
        user.blocked = true;
    }

    public void removeBlock(User user) {
        user.blocked = false;
    }

}
