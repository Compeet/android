package org.mgn.compeet.model;

/**
 * Created by peta on 8.2.15.
 */
public class User {

    private String fullName;
    private String nick;
    private String mail;
    private String password;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String email, String password){
        System.out.println(email + " " + password);
        if(email.equals("p@gmail.com") && password.equals("pass")){
            return true;
        }
        return false;
    }
}
