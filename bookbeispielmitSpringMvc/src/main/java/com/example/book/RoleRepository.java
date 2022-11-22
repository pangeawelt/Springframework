package com.example.book;

import org.springframework.data.repository.CrudRepository;

import com.example.book.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
