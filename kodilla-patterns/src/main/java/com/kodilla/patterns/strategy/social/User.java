package com.kodilla.patterns.strategy.social;

public class User {
    String name;
    protected SocialPublisher socialPublisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public String predict(){
        return socialPublisher.share();
    }

    public void sharePOst(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
