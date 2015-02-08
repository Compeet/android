package org.mgn.compeet.model;

/**
 * Created by peta on 8.2.15.
 */
public class Message {

    private User user;
    private String message;
    private int time;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
