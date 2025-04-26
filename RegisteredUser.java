import java.util.ArrayList;

public class RegisteredUser {
    private ArrayList<User> userList;

    public RegisteredUser() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!userList.contains(user)) {
            userList.add(user);
            System.out.println("User added.");
        }
    }

    public void removeUser(User user) {
        if (userList.remove(user)) {
            System.out.println("User removed.");
        } else {
            System.out.println("User not found.");
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
}
