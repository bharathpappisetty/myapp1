package sb.tutorial.myapp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sb.tutorial.myapp1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
