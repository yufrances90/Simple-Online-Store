package com.simpleonlinestore.userservice.repositories;

import com.simpleonlinestore.userservice.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
