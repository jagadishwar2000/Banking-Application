package jagadish.codes.banking.repository;

import jagadish.codes.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   AccountRepository extends JpaRepository<Account, Long> {
}
