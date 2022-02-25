package com.network.networkposts.controller;

import com.network.networkposts.data.model.Post;
import com.network.networkposts.data.service.PostService;
import com.network.networkposts.data.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.HeaderParam;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author SIE
 */
@AllArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Post>> getUserPosts(@PathVariable String userId, @HeaderParam("current_user") String currentUser) {
        return ResponseEntity.ok(postService.getUserPosts(userId));
    }

    @PostMapping
    public ResponseEntity<Void> createPost(@RequestBody Post newPost, @RequestHeader("current_user") String currentUser) {
        newPost.setUserId(currentUser);
        postService.createPost(newPost);
        return ResponseEntity.ok().build();
    }
}
