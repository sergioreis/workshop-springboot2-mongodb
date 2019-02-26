package br.com.sergioreis.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sergioreis.workshopmongo.domain.User;
import br.com.sergioreis.workshopmongo.dto.UserDTO;
import br.com.sergioreis.workshopmongo.repository.UserRepository;
import br.com.sergioreis.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired	
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado!"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(),objDto.getName(),objDto.getEmail());
	}
	
}
