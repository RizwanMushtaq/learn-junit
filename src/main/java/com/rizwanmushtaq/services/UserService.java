package com.rizwanmushtaq.services;

import com.rizwanmushtaq.repositories.UserRepository;

public class UserService {
  private final UserRepository repository;

  public UserService(UserRepository repository) {
    this.repository = repository;
  }

  public String getUserName(int id) {
    return repository.findNameById(id);
  }
}

