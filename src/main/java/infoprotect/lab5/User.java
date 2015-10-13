package infoprotect.lab5;

import java.util.List;
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
    Boolean blocked = false;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void changePassword(String password) {

            this.password = password;
    }

    public void exit() {

    }

    public void showListOfUsers(Map<String, User> userMap) {
        userMap.forEach((s, user) -> System.out.println(s+" "+user.blocked));
    }

    public void addBlock(User user) {
        user.blocked = true;
    }

    public void removeBlock(User user) {
        user.blocked = false;
    }

    public void addQuestions(String question, String answer){
        questions.put(question,answer);
    }

}
