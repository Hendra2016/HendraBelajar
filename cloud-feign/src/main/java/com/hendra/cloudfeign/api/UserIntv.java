package com.hendra.cloudfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "USER-SERVICE")
public interface UserIntv {

    @GetMapping("/users/")
    String testUser();

}
