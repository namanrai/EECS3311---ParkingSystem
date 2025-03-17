package Database;

import Models.User;
import java.util.*;

public class Database {
    private ArrayList<User> Users = new ArrayList<>();
    private static final Database database = new Database();

    private Database() {
    }

    public void addAccount(User user){
        Users.add(user);
    }

    public ArrayList<User> getUsers() {
        return Users;
    }

    public boolean validUser(String username, String password) {
        for(User user: Users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static Database getInstance() {
        return  database;
    }
}
