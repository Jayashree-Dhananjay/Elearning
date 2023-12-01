package com.cg.mentorservice.service;

import com.cg.mentorservice.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE")
public interface APIClient {
    @GetMapping("api/users/{mentor-name}")
    UserDto getUser(@PathVariable("mentor-name") String mentorName);
}