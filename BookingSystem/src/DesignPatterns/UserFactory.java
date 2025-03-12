package DesignPatterns;

import Models.*;

public class UserFactory {
    public static User createUser(String type, String name, String email, String password) {
        return switch (type.toLowerCase()) {
            case "student" -> new Student(name, email, password);
            case "faculty" -> new Faculty(name, email, password);
            case "staff" -> new Staff(name, email, password);
            case "visitor" -> new Visitor(name, email, password);
            default -> throw new IllegalArgumentException("Invalid user type");
        };
    }
}

