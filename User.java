import java.util.ArrayList;
import java.time.LocalDate;
public class User
{
    private int id;
    private String login;
    private String password;
    User(int id, String login, String password)
    {
        this.id=id;
        this.login=login;
        this.password=password;
    }
    int getId()
    {
        return id;
    }
    String getLogin()
    {
        return login;
    }
    String getPassword()
    {
        return password;
    }
    void resetPassword(String newPassword)
    {
        this.password=newPassword;
    }
    void resetLogin(String newLogin)
    {
        this.login=newLogin;
    }

}
