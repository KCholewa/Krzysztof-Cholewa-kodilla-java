package com.kodilla.patterns.strategy.social;

public class User {

    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialMedia(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
