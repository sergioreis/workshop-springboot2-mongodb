package br.com.sergioreis.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sergioreis.workshopmongo.domain.User;
import br.com.sergioreis.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired	
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
}
