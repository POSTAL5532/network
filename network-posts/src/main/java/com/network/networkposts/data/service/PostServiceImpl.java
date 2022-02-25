package com.network.networkposts.data.service;

import com.network.networkposts.data.model.Post;
import com.network.networkposts.data.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author SIE
 */
@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    private final UserService userService;

    @Override
    public List<Post> getUserPosts(String userId) {
        if (!userService.userExist(userId)) {
            throw new NoSuchElementException("User doesn't exist!");
        }

        return postRepository.findByUserId(userId);
    }

    @Override
    public void createPost(Post post) {
        postRepository.save(post);
    }
}
