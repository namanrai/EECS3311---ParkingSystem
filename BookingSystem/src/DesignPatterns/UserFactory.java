package DesignPatterns;

import Models.*;

public class UserFactory {
    public static User createUser(String type, String name, String email, String password, String licensePlate) {
        return switch (type.toLowerCase()) {
            case "student" -> new Student(name, email, password, licensePlate);
            case "faculty" -> new Faculty(name, email, password, licensePlate);
            case "staff" -> new Staff(name, email, password, licensePlate);
            case "visitor" -> new Visitor(name, email, password, licensePlate);
            default -> throw new IllegalArgumentException("Invalid user type");
        };
    }
}

