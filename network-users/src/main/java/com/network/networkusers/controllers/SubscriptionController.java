package com.network.networkusers.controllers;

import com.network.networkusers.data.model.Subscription;
import com.network.networkusers.data.model.User;
import com.network.networkusers.data.service.SubscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SIE
 */
@AllArgsConstructor
@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @GetMapping("/subscribers/{targetUserId}")
    public ResponseEntity<List<User>> getUserSubscribers(@PathVariable String targetUserId) {
        return ResponseEntity.ok(subscriptionService.getUserSubscribers(targetUserId));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<User>> getUserSubscriptions(@PathVariable String userId) {
        return ResponseEntity.ok(subscriptionService.getUserSubscriptions(userId));
    }

    @PostMapping
    public ResponseEntity<Void> addUserSubscription(@RequestBody Subscription subscription) {
        subscriptionService.createSubscription(subscription);

        return ResponseEntity.ok().build();
    }
}
