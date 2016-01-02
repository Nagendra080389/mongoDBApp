package net.meraComputer.spring.repositories;


import net.meraComputer.spring.model.UserAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserAccountRepository extends MongoRepository<UserAccount, String> {
	
	UserAccount findByUsername(final String username);
	List<UserAccount> findByUsernameAndPassword(final String username, final String password);
	List<UserAccount> findByPasswordAndUsername(final String password, final String username);
	List<UserAccount> findByUsernameLike(final String username);
	@Query("{ 'username' : ?0, 'password' : ?1 }")
	List<UserAccount> findByUsernameAndPasswordQuery(final String username, final String password);
}
