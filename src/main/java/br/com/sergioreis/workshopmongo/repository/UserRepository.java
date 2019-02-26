package br.com.sergioreis.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.sergioreis.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
