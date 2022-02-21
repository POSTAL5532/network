package com.network.networkposts.data.repository;

import com.network.networkposts.data.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SIE
 */
@Repository
public interface PostRepository extends JpaRepository<Post, String> {

    List<Post> findByUserId(String userId);
}
