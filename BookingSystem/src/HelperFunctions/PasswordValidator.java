package HelperFunctions;

public class PasswordValidator {

    public static boolean isStrongPassword(String password) {
        // Minimum length requirement
        if (password == null || password.length() < 8) {
            return true;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Define special characters
        String specialChars = "!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialChars.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            }
        }

        // Check if all conditions are met
        return !hasUppercase || !hasLowercase || !hasDigit || !hasSpecialChar;
    }
}