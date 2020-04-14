package com.kodilla.stream.forumuser;;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postQty;

    public ForumUser(final int userId, final String userName, final char sex, final LocalDate dateOfBirth, final int postQty) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postQty = postQty;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQty() {
        return postQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQty=" + postQty +
                '}';
    }
}
