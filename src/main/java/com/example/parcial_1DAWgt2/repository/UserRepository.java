
package com.example.parcial_1DAWgt2.repository;

import com.example.parcial_1DAWgt2.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
