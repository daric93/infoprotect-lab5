package infoprotect.lab5;

import java.util.Map;

/**
 * Created by darya on 11.10.15.
 */
public class User {
    String name;
    String password;
    Map<String, String> questions;
    Boolean blocked;

    public User(String name, String password, Map<String, String> questions, Boolean blocked) {
    }

    public void changePassword(String password) {
        this.password = password;
    }

}
