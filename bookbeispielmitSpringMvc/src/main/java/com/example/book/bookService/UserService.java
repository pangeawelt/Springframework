package com.example.book.bookService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.book.UserRepository;
import com.example.book.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> listAll() {
		return repo.findAll(Sort.by("email").ascending());
	}

}