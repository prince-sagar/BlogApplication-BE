package com.blogApplication.blogServer.service;

import com.blogApplication.blogServer.Entity.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long postId, String postedBy, String content);

    List<Comment> getCommentByPostId(Long postId);
}
