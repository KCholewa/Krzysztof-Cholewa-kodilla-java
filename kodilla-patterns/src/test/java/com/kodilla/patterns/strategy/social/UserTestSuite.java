package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User john = new YGeneration("John");
        User jack = new Millenials("Jack");
        User joe = new ZGeneration("Joe");

        //When
        String johnsSocialMedia = john.sharePost();
        String jacksSocialMedia = jack.sharePost();
        String joesSocialMedia = joe.sharePost();

        //Then
        Assert.assertEquals("Twitter", johnsSocialMedia);
        Assert.assertEquals("Facebook", jacksSocialMedia);
        Assert.assertEquals("Snapchat", joesSocialMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new YGeneration("John");

        //When
        john.setSocialMedia(new FacebookPublisher());
        String johnsSocialMedia = john.sharePost();

        //Then
        Assert.assertEquals("Facebook", johnsSocialMedia);
    };
}
