package com.kodilla.good.patterns.challenges.shopping;

public class MailService implements InformationService {
    public void orderUserNotification(User user) {
        System.out.println("Email has been send to: "+user.getName()+" "+user.getSurname());
    }
}
