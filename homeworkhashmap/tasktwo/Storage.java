package com.proftelran.org.homeworkhashmap.tasktwo;

import java.util.*;

public class Storage {
    private Map<User, List<UserRequest>> userRequestsMap;

    public Storage() {
        userRequestsMap = new HashMap<>();
    }

    public void addRequest(User user, String address, Answer answer) {
        List<UserRequest> userRequests = userRequestsMap.get(user);
        if (userRequests == null) {
            userRequests = new ArrayList<>();
            userRequestsMap.put(user, userRequests);
        }
        userRequests.add(new UserRequest(user, address, answer));
    }

    public List<UserRequest> getUserRequests(User user) {
        return userRequestsMap.getOrDefault(user, Collections.emptyList());
    }
}
