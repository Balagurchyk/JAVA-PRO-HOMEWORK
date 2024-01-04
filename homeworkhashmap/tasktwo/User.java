package com.proftelran.org.homeworkhashmap.tasktwo;

import java.util.Objects;

public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return username.equalsIgnoreCase(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username.toLowerCase());
    }
}
