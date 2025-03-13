package Main;

import DesignPatterns.*;
import Models.User;

public class Main {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        User ahmad = UserFactory.createUser("Student","ahmad","ahmadzkai","123");
        System.out.println(ahmad.getUsername());
    }
}
