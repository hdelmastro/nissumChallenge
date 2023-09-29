package com.nissum.challenge.service;

import com.nissum.challenge.business.model.PhoneDto;
import com.nissum.challenge.business.model.UserDto;
import com.nissum.challenge.business.model.UserResponseDto;
import com.nissum.challenge.persistence.entity.Phone;
import com.nissum.challenge.persistence.entity.User;
import com.nissum.challenge.persistence.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Component
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDto createUser(UserDto userDto) {

        User user = mapUserDtoToUser(userDto);

        User userResponse = userRepository.save(user);

        return mapUserToUserResponseDto(userResponse);
    }

    private User mapUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setCreated(LocalDateTime.now());
        user.setModified(LocalDateTime.now());
        user.setLastLogin(LocalDateTime.now());
        user.setToken(UUID.randomUUID().toString());
        user.setIsActive(true);

        List<Phone> phones = userDto.getPhones().stream()
                .map(this::mapPhoneDtoToPhone)
                .collect(Collectors.toList());

        user.setPhones(phones);

        return user;
    }

    private Phone mapPhoneDtoToPhone(PhoneDto phoneDto) {
        Phone phone = new Phone();
        phone.setNumber(phoneDto.getNumber());
        phone.setCityCode(phoneDto.getCityCode());
        phone.setCountryCode(phoneDto.getCountryCode());
        return phone;
    }

    private UserResponseDto mapUserToUserResponseDto(User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .created(user.getCreated())
                .token(user.getToken())
                .modified(user.getModified())
                .lastLogin(user.getLastLogin())
                .isActive(user.getIsActive())
                .build();
    }
}
