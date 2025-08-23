package com.rizwanmushtaq.services;

import com.rizwanmushtaq.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UserServiceTest {
  @Test
  void shouldReturnUserNameFromRepository() {
    // Mock (Fake) Repository bauen
    UserRepository repository = Mockito.mock(UserRepository.class);
    when(repository.findNameById(1)).thenReturn("Alice");
    // Service mit Fake-Repository testen
    UserService service = new UserService(repository);
    String name = service.getUserName(1);
    assertEquals("Alice", name);
  }
}

