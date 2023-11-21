package com.web.user.Repository;

import com.web.user.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT e FROM User e WHERE e.name LIKE CONCAT('%', :value, '%')")

    List<User> findByName(@Param("value") String name);
}
