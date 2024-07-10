package com.blogApplication.blogServer.repository;

import com.blogApplication.blogServer.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends JpaRepository<Post, Long> {

}
