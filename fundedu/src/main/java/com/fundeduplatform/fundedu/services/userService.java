package com.fundeduplatform.fundedu.Service;

import java.util.List;

import com.is.dlos.app.dto.LoanApplicationDTO;
import com.is.dlos.app.dto.RoleDTO;
import com.is.dlos.app.dto.UserDTO;

public interface UserService {

    Long login(UserDTO userDTO);
    Long register(UserDTO userDTO);

    UserDTO fetchUserDetails(Long userId);


}
