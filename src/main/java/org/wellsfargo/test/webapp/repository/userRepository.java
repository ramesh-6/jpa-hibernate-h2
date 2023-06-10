package org.wellsfargo.test.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wellsfargo.test.webapp.enitty.user;

public interface userRepository extends JpaRepository<user, Long> {

}
