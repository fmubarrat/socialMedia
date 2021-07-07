package com.project.fayek.socialMedia.repository;


import com.project.fayek.socialMedia.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
