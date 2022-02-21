package com.network.networkposts.data.service;

import com.network.networkposts.data.model.Post;

import java.util.List;

/**
 * @author SIE
 */
public interface PostService {

    List<Post> getUserPosts(String userId);

    void createPost(Post post);
}
