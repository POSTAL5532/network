package com.network.networkusers.data.service;

import com.network.networkusers.data.model.Subscription;
import com.network.networkusers.data.model.User;
import com.network.networkusers.data.repository.SubscriptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * @author SIE
 */
@AllArgsConstructor
@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    private final UserService userService;

    private final SubscriptionRepository subscriptionRepository;

    @Override
    @Transactional
    public void createSubscription(Subscription newSubscription) {
        if (!userService.exist(newSubscription.getUserId()) || !userService.exist(newSubscription.getTargetUserId())) {
            throw new NoSuchElementException("User or target user doesn't exist.");
        }

        subscriptionRepository.save(newSubscription);
    }

    @Override
    public List<User> getUserSubscribers(String userId) {
        List<Subscription> subscriptions = subscriptionRepository.findAllByTargetUserId(userId);
        List<String> ids = subscriptions.stream()
                .map(Subscription::getUserId)
                .collect(Collectors.toList());

        return userService.getAllByIds(ids);
    }

    @Override
    public List<User> getUserSubscriptions(String userId) {
        List<Subscription> subscriptions = subscriptionRepository.findAllByUserId(userId);
        List<String> ids = subscriptions.stream()
                .map(Subscription::getTargetUserId)
                .collect(Collectors.toList());

        return userService.getAllByIds(ids);
    }
}
