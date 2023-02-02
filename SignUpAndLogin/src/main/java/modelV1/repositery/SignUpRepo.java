package modelV1.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelV1.Entity.RegisterUser;

@Repository
public interface SignUpRepo extends JpaRepository<RegisterUser,Long> {

}
