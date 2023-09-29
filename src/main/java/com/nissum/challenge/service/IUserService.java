package com.nissum.challenge.service;

import com.nissum.challenge.business.model.UserDto;
import com.nissum.challenge.business.model.UserResponseDto;

public interface IUserService {

    UserResponseDto createUser(UserDto user);

}
