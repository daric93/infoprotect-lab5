package infoprotect.lab5;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by darya on 11.10.15.
 */
public class Sys {
    Map<String, User> userMap = new HashMap<>();
    List<String> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void fillQuestions(User user) {
        list.forEach(System.out::println);
        user.questions = new HashMap<>();
        list.forEach(elem -> {
            System.out.println(elem);
            user.addQuestions(elem, sc.nextLine());
        });
    }

    public Boolean checkQuestion(User user) {
        int index = (int) (Math.random() * (list.size()));
        System.out.println(list.get(index));
        if(Objects.equals(user.questions.get(list.get(index)), sc.nextLine()))
            return true;
        else{
            System.out.println("Wrong answer for a question");
            return false;
        }
    }
    public Boolean isBlocked(User user){
        return user.blocked;
    }

    public void createUser() throws IOException {

        System.out.println("Enter name: ");
        User user;
        try {
            user = userMap.get(sc.nextLine());

            if(isBlocked(user)){
                System.out.println("User is blocked");
                createUser();
            }
            if (Objects.equals(user.password, "empty")) {
                System.out.println("Enter new password: ");
                Scanner sc = new Scanner(System.in);
                String password = sc.nextLine();
                System.out.println("Repeat password: ");
                if (Objects.equals(password, sc.nextLine())) {
                    user.changePassword(password);
                    fillQuestions(user);
                    if (Objects.equals(user.name, "admin"))
                        menuAdmin(user);
                    else menuUser(user);
                } else System.out.println("Wrong password");
            } else {
                System.out.println("Enter password: ");
                if (Objects.equals(user.password, sc.nextLine())) {
                    checkQuestion(user);
                    if (Objects.equals(user.name, "admin"))
                        menuAdmin(user);
                    else menuUser(user);
                } else {
                    System.out.println("Wrong password");
                    createUser();
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "No user with such name");
        }
    }

    public void menuUser(User user) throws IOException {
        String choice;

        do {
            System.out.println("Change password - 0, exit - 1");
            choice = sc.nextLine();
            switch (choice) {
                case "0":
                    System.out.println("Enter password: ");
                    Scanner sc = new Scanner(System.in);
                    String password = sc.nextLine();
                    System.out.println("Repeat password: ");
                    if (Objects.equals(password, sc.nextLine()))
                        user.changePassword(password);
                    else System.out.println("Wrong password");
                    break;
                case "1":
                    user.exit();
                    break;
                default:
                    System.out.println("No such option");
                    break;
            }
        } while (!Objects.equals(choice, "1"));
    }

    public void menuAdmin(User user) throws IOException {
        String choice;
        do {
            System.out.println("Change password - 0, show list of users - 1, block user - 2, unblock user - 3, exit - 4");
            choice = sc.nextLine();
            switch (choice) {
                case "0":
                    System.out.println("Enter password: ");
                    String password = sc.nextLine();
                    System.out.println("Repeat password: ");
                    if (Objects.equals(password, sc.nextLine()))
                        user.changePassword(password);
                    else System.out.println("Wrong password");
                    break;
                case "1":
                    user.showListOfUsers(userMap);
                    break;
                case "2":
                    System.out.println("Enter name of user: ");
                    String key = sc.nextLine();
                    try {
                        user.addBlock(userMap.get(key));
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage() + "No user with such name");
                    }
                    break;
                case "3":
                    System.out.println("Enter name of user: ");
                    String key2 = sc.nextLine();
                    try {
                        user.addBlock(userMap.get(key2));
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage() + "No user with such name");
                    }
                    break;
                case "4":
                    user.exit();
                    break;
                default:
                    System.out.println("Change password - 0, show list of users - 1, block user - 2, exit - 3");
                    break;
            }
        } while (!Objects.equals(choice, "4"));
    }

    public static void main(String[] args) throws IOException {
        Sys sys = new Sys();

        Scanner scanner = new Scanner(new File("users"));
        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split("\t");
            sys.userMap.put(split[0], new User(split[0], split[1]));
        }
        //sys.userMap.forEach((k, v) -> System.out.println(k + " " + v.name + " " + v.password + " " + v.blocked));

        scanner = new Scanner(new File("questions"));
        while (scanner.hasNextLine()) {
            sys.list.add(scanner.nextLine());
        }


        do {
            sys.createUser();
            sc.nextLine();
        } while (!Objects.equals(sc.nextLine(), "q"));
    }
}
