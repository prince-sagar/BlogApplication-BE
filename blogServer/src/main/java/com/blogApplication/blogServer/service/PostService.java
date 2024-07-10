package com.blogApplication.blogServer.service;

import com.blogApplication.blogServer.Entity.Post;

import java.util.List;

public interface PostService {
    Post savePost(Post post);
    List<Post> getAllPost();
   Post getPostById(Long postId);

    void likePost(Long postId);
    List<Post> searchByName(String name);
}
