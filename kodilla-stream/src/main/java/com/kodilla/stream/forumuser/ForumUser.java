package com.kodilla.stream.forumuser;;
import java.time.LocalDate;
import java.time.Period;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postQty;

    public ForumUser(final int userId, final String username, final char sex, final LocalDate dateOfBirth, final int postQty) {
        this.userId = userId;
        this.username = username;
        this.sex = sex == 'M'?'M':'F';//enum
        this.dateOfBirth = dateOfBirth;
        this.postQty = postQty;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
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
                ", userName='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQty=" + postQty +
                '}';
    }

    public boolean isProperAge(int properAge) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = getDateOfBirth();
        Period p = Period.between(birthday, today);
        int age = p.getYears();
        if (age >= properAge) {
            return true;
        } else {
            return false;
        }
    }
}
