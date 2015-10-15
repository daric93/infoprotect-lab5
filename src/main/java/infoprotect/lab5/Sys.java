package infoprotect.lab5;

import javax.json.*;
import javax.json.stream.JsonGenerator;
import java.io.*;
import java.util.*;

/**
 * Created by darya on 11.10.15.
 */
public class Sys {
    public final Map<String, User> userMap = new HashMap<>();
    private final List<String> questions = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public JsonObject createUserObject(User user) {
        JsonArrayBuilder questionsArray = Json.createArrayBuilder();
        user.getQuestions().forEach((k, v) -> questionsArray.add(Json.createObjectBuilder()
                .add("Question", k)
                .add("Answer", v)));
        JsonObject userObject = Json.createObjectBuilder()
                .add("Name", user.getName())
                .add("Password", user.getPassword())
                .add("Block", user.getBlock())
                .add("Questions", questionsArray).build();
        return userObject;
    }

    public JsonArray createUserObjectArray(Map<String, User> userMap) {
        JsonArrayBuilder userObjectArray = Json.createArrayBuilder();
        userMap.forEach((k, v) -> userObjectArray.add(createUserObject(v)));
        return userObjectArray.build();
    }

    public void writeData() throws FileNotFoundException {
        JsonArray jsonArray = createUserObjectArray(userMap);

        Map<String, Object> properties = new HashMap<>(1);
        properties.put(JsonGenerator.PRETTY_PRINTING, true);
        JsonWriterFactory writerFactory = Json.createWriterFactory(properties);
        JsonWriter writer = writerFactory.createWriter(new FileOutputStream("usersData"));

        //JsonWriter writer = Json.createWriter(new FileOutputStream("usersData"));
        writer.writeArray(jsonArray);
        writer.close();
    }

    public void readData() throws FileNotFoundException {
        try (JsonReader reader = Json.createReader(new FileReader("usersData"))) {
            JsonArray jsonArray = reader.readArray();
            for (JsonValue jsonValue : jsonArray) {
                User user = new User();
                JsonObject jsonObject = (JsonObject) jsonValue;
                user.setName(jsonObject.getString("Name"));
                user.setPassword(jsonObject.getString("Password"));
                user.setBlocked(jsonObject.getBoolean("Block"));
                for (JsonValue jsonQuestion : jsonObject.getJsonArray("Questions")) {
                    JsonObject jsonQuestionObject = (JsonObject) jsonQuestion;
                    user.addQuestions(jsonQuestionObject.getString("Question"), jsonQuestionObject.getString("Answer"));
                }
                userMap.put(jsonObject.getString("Name"), user);
            }
        }
    }

    public void readUsers() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("users"))) {
            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split("\t");
                userMap.put(split[0], new User(split[0], split[1]));
            }
        }
    }

    public void readQuestions() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("questions"))) {
            while (scanner.hasNextLine()) {
                questions.add(scanner.nextLine());
            }
        }
    }

    public void fillQuestions(User user) {
        questions.forEach(elem -> {
            System.out.println(elem);
            user.addQuestions(elem, sc.nextLine());
        });
    }


    public void createUser() throws IOException {

        System.out.println("Enter name: ");
        User user;
        try {
            user = userMap.get(sc.nextLine());

            if (user.isBlocked()) {
                System.out.println("User is blocked");
                createUser();
            }
            if (Objects.equals(user.getPassword(), "empty")) {
                System.out.println("Enter new password: ");
                Scanner sc = new Scanner(System.in);
                String password = sc.nextLine();
                System.out.println("Repeat password: ");
                if (Objects.equals(password, sc.nextLine())) {
                    user.changePassword(password);
                    fillQuestions(user);
                    if (Objects.equals(user.getName(), "admin"))
                        menuAdmin(user);
                    else menuUser(user);
                } else System.out.println("Wrong password");
            } else {
                System.out.println("Enter password: ");
                if (Objects.equals(user.getPassword(), sc.nextLine())) {
                    int index = (int) (Math.random() * (questions.size()));
                    System.out.println(questions.get(index));
                    if (!user.checkQuestion(questions.get(index), sc.nextLine()))
                        System.out.println("Wrong answer for a question");
                    else {
                        if (Objects.equals(user.getName(), "admin"))
                            menuAdmin(user);
                        else menuUser(user);
                    }
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
            System.out.println("Change password - 0, show list of users - 1, block user - 2, exit - 3");
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
                    System.out.println("Set block (enter true/false): ");
                    boolean val = sc.nextBoolean();
                    try {
                        userMap.get(key).setBlocked(val);
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage() + "No user with such name");
                    }
                    break;
                case "3":
                    user.exit();
                    break;
                default:
                    System.out.println("Change password - 0, show list of users - 1, block user - 2, exit - 3");
                    break;
            }
        } while (!Objects.equals(choice, "3"));
    }

    public static void main(String[] args) throws IOException {
        Sys sys = new Sys();
        sys.readUsers();
        sys.readQuestions();

        do {
            sys.createUser();
        } while (!Objects.equals(sc.nextLine(), "q"));
    }

    public User getUserByName(String userName) {
        return userMap.get(userName);
    }

    public List<String> getQuestions() {
        return questions;
    }
}
