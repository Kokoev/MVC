package mvc;

import javax.validation.constraints.Size;

public class Student {
    private  int id;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}


    //    @Size(min = 5, message = "пароль должен быть больше 5 символов")
    private String login;
//    @Size(min = 5, message = "пароль должен быть больше 5 символов")
    private String password;

    private Integer age;
    private String gender;
    private String school;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}