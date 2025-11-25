package com.ejbank;

import javax.ejb.Local;

@Local
public interface UserBeanLocal {
    UserResponse findUserById(Integer userId);
}
