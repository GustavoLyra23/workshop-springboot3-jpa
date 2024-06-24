package com.educandoweb.course.service;

import com.educandoweb.course.entities.UserT;
import com.educandoweb.course.repositories.UserTRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserTServiceTest {

    @InjectMocks
    private UserTService userTService;

    @Mock
    private UserTRepository userTRepository;

    private UserT user1;
    private UserT user2;

    @BeforeEach
    void setUp() {
        user1 = new UserT(1L, "John Doe", "john@example.com", "1234567890", "password1");
        user2 = new UserT(2L, "Jane Doe", "jane@example.com", "0987654321", "password2");
    }

    @Test
    void testGetAllUserT() {
        List<UserT> userList = Arrays.asList(user1, user2);
        when(userTRepository.findAll()).thenReturn(userList);

        List<UserT> result = userTService.getAllUserT();

        assertEquals(2, result.size());
        assertEquals(user1, result.get(0));
        assertEquals(user2, result.get(1));
    }

    @Test
    void testFindById() {
        when(userTRepository.findById(anyLong())).thenReturn(Optional.of(user1));

        UserT result = userTService.findById(1L);

        assertEquals(user1, result);
    }
}
