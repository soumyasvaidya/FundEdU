package com.is.dlos.app.service;

import static com.is.dlos.app.constant.ApplicationConstant.CLAIM_TASK;
import static com.is.dlos.app.constant.ApplicationConstant.ERROR_UNAUTHORIZED;
import static com.is.dlos.app.constant.ApplicationConstant.ERROR_GENERIC;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.is.dlos.app.dto.LoanApplicationDTO;
import com.is.dlos.app.dto.RoleDTO;
import com.is.dlos.app.dto.UserDTO;
import com.is.dlos.app.entity.LoanStage;
import com.is.dlos.app.entity.Role;
import com.is.dlos.app.entity.User;
import com.is.dlos.app.exception.ApplicationException;
import com.is.dlos.app.mapper.RoleMapper;
import com.is.dlos.app.mapper.UserMapper;
import com.is.dlos.app.repository.LoanStageRepository;
import com.is.dlos.app.repository.RoleRepository;
import com.is.dlos.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;

    @Override
    public Long login(UserDTO userDTO) {
        User user = userRepository.findByUserNameAndPassword(userDTO.getUserName(), userDTO.getPassword());
        if (ObjectUtils.isEmpty(user)) {
            throw new ApplicationException(ERROR_UNAUTHORIZED, HttpStatus.UNAUTHORIZED.value());
        }
        return user.getUserId();
    }

    @Override
    public Long register(UserDTO userDTO) {
        User user = userRepository.save (userDTO);
        return user.getUserId();
    }


    @Override
    public UserDTO fetchUserDetails(Long userId) {
        User user = userRepository.findById(userId).get();
        return userMapper.buildUserDTO(user);
    }

}
