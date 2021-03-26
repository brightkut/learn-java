package com.learn.springbootmockito.mockito;

import com.learn.springbootmockito.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class MockitoIntegrationTest {
    @MockBean
    private UserService userService;

    @Autowired
    private ApplicationContext context;

    @Test
    public void testGetUsernameIntegration() {
        when(userService.getUserName(anyString())).thenReturn("Hello");

        UserService contextUserService = context.getBean(UserService.class);

        String actual = contextUserService.getUserName("a");

        assertEquals(actual, "Hello");
    }
}
