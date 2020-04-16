package com.kodilla.stream;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultOfMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M' && forumUser.isOlderThenOrEqualTo(20) && forumUser.getPostQty()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theResultOfMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey()+": "+entry.getValue())
                .forEach(System.out::println);

        }
    }



