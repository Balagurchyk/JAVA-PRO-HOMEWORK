package com.proftelran.org.homeworkhashmap.tasktwo;

public class UserRequest {

    private User user;
    private String address;
    private Answer answer;

    public UserRequest(User user, String address, Answer answer) {
        this.user = user;
        this.address = address;
        this.answer = answer;
    }

    public User getUser() {
        return user;
    }

    public String getAddress() {
        return address;
    }

    public Answer getAnswer() {
        return answer;
    }
}
