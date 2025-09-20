package com.devops.projeto_devops.controller;


import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    @Test
    void testGetUsersReturnsListOfUsers() {
        UserController controller = new UserController();
        ResponseEntity<String> response = controller.getUsers();

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("List of users", response.getBody());
    }
}