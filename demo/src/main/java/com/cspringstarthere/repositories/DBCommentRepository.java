package com.cspringstarthere.repositories;

import com.cspringstarthere.model.Comment;

public class DBCommentRepository implements CommentRepository {
    
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment " + comment.getText());
    }
}