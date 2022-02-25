package com.network.networkposts.data.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author SIE
 */
@FeignClient(name = "network-users/users")
public interface UserService {

    @GetMapping("/exist/{id}")
    Boolean userExist(@PathVariable String id);
}
