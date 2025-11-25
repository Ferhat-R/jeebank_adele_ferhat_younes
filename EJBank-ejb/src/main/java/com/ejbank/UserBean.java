package com.ejbank;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class UserBean implements UserBeanLocal {

    @PersistenceContext(unitName = "EJBankPU")
    private EntityManager em;

    @Override
    public UserResponse findUserById(Integer userId) {
         var user = em.find(User.class, userId);

        return new UserResponse( user.getFirstname(), user.getLastname()) ;
    }

}
