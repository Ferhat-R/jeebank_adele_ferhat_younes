package com.ejbank.api;

import com.ejbank.UserBeanLocal;
import com.ejbank.UserResponse;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class UserAPI {

    @EJB
    private UserBeanLocal userBean;

    
    @GET
    @Path("/{id}")
    public UserResponse testEJB(@PathParam("id") Integer id) {
        var user =userBean.findUserById(id) ;
        return  new UserResponse(user.getFirstname(), user.getLastname());
    }

}
