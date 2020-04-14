package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Greg", 'M', LocalDate.of(1999, 7, 8),15));
        userList.add(new ForumUser(2,"John", 'M', LocalDate.of(1990, 8, 5),0));
        userList.add(new ForumUser(3,"Julia", 'F', LocalDate.of(1985, 12, 15),45));
        userList.add(new ForumUser(4,"Jack", 'M', LocalDate.of(2001, 7, 18),150));
        userList.add(new ForumUser(5,"Susane", 'F', LocalDate.of(1995, 5, 31),115));
        userList.add(new ForumUser(6,"George", 'M', LocalDate.of(1991, 1, 12 ),55));
        userList.add(new ForumUser(7,"Jennifer", 'F', LocalDate.of(1992, 3, 4),47));
        userList.add(new ForumUser(8,"Michael", 'M', LocalDate.of(1988, 2, 2),35));
        userList.add(new ForumUser(9,"Karen", 'F', LocalDate.of(1970, 5, 28),12));
        userList.add(new ForumUser(10,"Gerry", 'M', LocalDate.of(1982, 4, 11),22));
        }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
