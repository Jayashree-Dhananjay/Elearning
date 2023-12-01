package com.cg.userservice.controller;



import com.cg.userservice.dto.UserDto;
import com.cg.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
    private UserService userService;

    //build create user REST API
    @PostMapping
    public ResponseEntity<UserDto> saveUser(@Valid @RequestBody UserDto user){
        UserDto savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    //build getUserById RESTAPI
    @GetMapping("{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long userId){
        UserDto user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }
    //build getAllUsers Rest API
    @GetMapping
    public  ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    //build updatedUser RESTAPI
    @PutMapping("{userId}")
    public ResponseEntity<UserDto> updatedUser(@PathVariable Long userId,@RequestBody @Valid UserDto user){
        user.setUserId(userId);
        UserDto updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("Succesfully deleted!", HttpStatus.OK);
    }

}
