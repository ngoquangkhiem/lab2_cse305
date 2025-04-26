import java.util.ArrayList;
import java.util.List;

// Lớp User
public class User {
    String userID;
    String password;
    String email;
    String userType;

    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }
}
