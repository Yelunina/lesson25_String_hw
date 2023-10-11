package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user;
    final String email = "peter@gmx.de";
    final String password = "12345Az!";

    @BeforeEach
    void setUp() {
        user = new User(email,password);
    }
    @Test
    void testValidPassword(){
        String validPassword = "qwertB7$";
        user.setPassword(validPassword);
        assertEquals(validPassword,user.getPassword());
    }
    @Test
    void testPasswordLength(){
        String invalidPassword = "wertB7$";
        user.setPassword(invalidPassword);
        assertEquals(password,user.getPassword());
    }
    @Test
    void testPasswordUpperCase(){
        String invalidPassword = "qwertb7$";
        user.setPassword(invalidPassword);
        assertEquals(password,user.getPassword());
    }
    @Test
    void testPasswordLowerCase(){
        String invalidPassword = "QWERTY7$";
        user.setPassword(invalidPassword);
        assertEquals(password,user.getPassword());
    }
    @Test
    void testPasswordDigit(){
        String invalidPassword = "qwertBD$";
        user.setPassword(invalidPassword);
        assertEquals(password,user.getPassword());
    }
    @Test
    void testPasswordSpecialSymbol(){
        String invalidPassword = "qwertdfA3";
        user.setPassword(invalidPassword);
        assertEquals(password,user.getPassword());
    }
}