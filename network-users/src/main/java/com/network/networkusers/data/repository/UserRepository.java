package com.network.networkusers.data.repository;

import com.network.networkusers.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SIE
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query("select u from User u where u.id in :ids")
    List<User> findAllByListOfIds(@Param("ids") List<String> ids);
}
