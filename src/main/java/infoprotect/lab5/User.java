package infoprotect.lab5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by darya on 11.10.15.
 */
public class User {
    private String name;
    private String password;
    private Map<String, String> questions = new HashMap<>();
    private boolean blocked = false;

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
        userMap.forEach((s, user) -> System.out.println(s + " " + user.blocked));
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public Boolean isBlocked() {
        return blocked;
    }

    public void addQuestions(String question, String answer) {
        questions.put(question, answer);
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    boolean checkQuestion(String question, String answer) {
        return Objects.equals(questions.get(question), answer);
    }

    public boolean getBlock() {
        return blocked;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
