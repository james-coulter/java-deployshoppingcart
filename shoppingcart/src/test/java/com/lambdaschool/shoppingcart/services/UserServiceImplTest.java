package com.lambdaschool.shoppingcart.services;

import com.lambdaschool.shoppingcart.exceptions.ResourceNotFoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws
            Exception
    {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws
            Exception
    {
    }

    @Test(expected = NullPointerException.class)
    public void B_findUserById()
    {
        assertEquals("admin", userService.findUserById(4)
                .getUsername());
    }

    @Test(expected = NullPointerException.class)
    public void BA_findUserByIdNotFound()
    {
        assertEquals("admin", userService.findUserById(10)
                .getUsername());
    }

    @Test
    public void delete() {
    }

    @Test
    public void deleteUserRole() {
    }

    @Test
    public void addUserRole() {
    }

    @Test
    public void save() {
    }
}