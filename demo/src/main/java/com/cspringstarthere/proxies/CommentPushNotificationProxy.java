package com.cspringstarthere.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.cspringstarthere.model.Comment;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        // TODO Auto-generated method stub
        System.out.println("Sending push notification for comment: " + comment.getText());   
    }
    
}
