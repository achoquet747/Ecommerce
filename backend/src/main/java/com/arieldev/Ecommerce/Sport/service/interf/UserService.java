package com.arieldev.Ecommerce.Sport.service.interf;

import com.arieldev.Ecommerce.Sport.dto.LoginRequest;
import com.arieldev.Ecommerce.Sport.dto.Response;
import com.arieldev.Ecommerce.Sport.dto.UserDto;
import com.arieldev.Ecommerce.Sport.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
