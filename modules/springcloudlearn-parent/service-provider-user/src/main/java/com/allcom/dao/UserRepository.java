package com.allcom.dao;

import com.allcom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ljy on 2018/5/26.
 * ok
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
