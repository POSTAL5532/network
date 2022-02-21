package com.network.networkusers.data.repository;

import com.network.networkusers.data.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SIE
 */
@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

    List<Subscription> findAllByTargetUserId(String targetUserId);

    List<Subscription> findAllByUserId(String userId);
}
