package day10.practice;

import java.util.ArrayList;

class User {
    int id;
    String name;
    String emailId;

    public User(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
}

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String msg) {
        super(msg);
    }
}

class UserManager {
    private ArrayList<User> userList = new ArrayList<>();

    public void register(User user) throws UserAlreadyExistsException {
        for (User existingUser : userList) {
            if (existingUser.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User with email ID already exists: " + user.emailId);
            }
        }
        userList.add(user);
        System.out.println("User registered successfully: " + user.name);
    }
}

public class UserRegister {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Adding some users for demonstration purposes
        User user1 = new User(1, "John", "john@example.com");
        User user2 = new User(2, "Alice", "alice@example.com");

        try {
            userManager.register(user1);
            userManager.register(user2);
            
            // Trying to register a user with the same email ID as user1
            User duplicateUser = new User(3, "Jane", "john@example.com");
            userManager.register(duplicateUser);
        } catch (UserAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}