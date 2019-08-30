package com.itheima.mapper;

import com.itheima.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UserMapper {
    User findByUser(User user);
}
