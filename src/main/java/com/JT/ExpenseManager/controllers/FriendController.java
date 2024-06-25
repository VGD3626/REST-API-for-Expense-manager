package com.JT.ExpenseManager.controllers;

import com.JT.ExpenseManager.entities.Friend;
import com.JT.ExpenseManager.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FriendController {

    private FriendService friendService;

    @Autowired
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @PostMapping("/friends")
    public Friend addFriend(@RequestBody Friend friend) {
        return friendService.save(friend);
    }

    @GetMapping("/friends")
    public List<Friend> getAllFriends() {
        return friendService.findAll();
    }

    @GetMapping("/friends/{id}")
    public Friend getFriendById(@PathVariable Long id) {
        return friendService.findById(id);
    }

    @PutMapping("/friends/{id}")
    public Friend updateFriend(@RequestBody Friend friend, @PathVariable Long id) {
        return friendService.update(friend, id);
    }

    @DeleteMapping("/friends/{id}")
    public Friend deleteFriendById(@PathVariable Long id) {
        return friendService.deleteById(id);
    }


}
