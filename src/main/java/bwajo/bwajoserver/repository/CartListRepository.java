package bwajo.bwajoserver.repository;

import bwajo.bwajoserver.entity.CartList;
import bwajo.bwajoserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartListRepository extends JpaRepository<CartList, Long> {
    CartList findByUser(User user);
}
