package mvc;

import javax.validation.constraints.Size;

/**
 * Created by sovarugby on 01.12.16.
 */
public class User {
//    @Size(min = 5, message = "пароль должен быть больше 5 символов")
    private String login;
//    @Size(min = 5, message = "пароль должен быть больше 5 символов")
    private String password;

    public String getLogin() {return login;}

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
