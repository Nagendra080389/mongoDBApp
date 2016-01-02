package net.meraComputer.spring.repositories;

import net.meraComputer.spring.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
}
