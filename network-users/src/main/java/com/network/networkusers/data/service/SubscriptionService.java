package com.network.networkusers.data.service;

import com.network.networkusers.data.model.Subscription;
import com.network.networkusers.data.model.User;

import java.util.List;

/**
 * @author SIE
 */
public interface SubscriptionService {

    void createSubscription(Subscription newSubscription);

    List<User> getUserSubscribers(String userId);

    List<User> getUserSubscriptions(String userId);
}
