package com.oocl.web.sampleWebApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oocl.web.sampleWebApp.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
 
 @GetMapping()
 public ResponseEntity<User> addUser(){
  return null;
  
 }
}