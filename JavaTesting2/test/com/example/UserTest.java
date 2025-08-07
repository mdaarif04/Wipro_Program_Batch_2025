package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserTest {

	static User user = null;
    static int i  = 0;

    @BeforeAll
    static void setup() {
        user = new User("admin", "admin123");
        System.out.println("User object created");
    }
    
    @AfterEach
	void tearDown() throws Exception {
		
		i++;
		System.out.println("Test case : " + i + " is passed");
	}

    @Test
    void testUsername() {
        assertEquals("admin", user.getUsername());
    }

    @Test
    void testPassword() {
        assertEquals("admin123", user.getPassword());
    }
}