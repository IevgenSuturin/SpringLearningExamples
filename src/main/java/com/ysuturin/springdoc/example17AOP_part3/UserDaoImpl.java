package com.ysuturin.springdoc.example17AOP_part3;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private static Map<Integer, UserDTO> userIdToUserDTO = new HashMap<>();

    @Override
    @Log
    public UserDTO getUser(int id) {

        if(userIdToUserDTO.get(id) != null){
            return userIdToUserDTO.get(id);
        }

        if(id < 1 ){
            throw new RuntimeException("incorrect id");
        }

        UserDTO user = new UserDTO(id);
        userIdToUserDTO.put(id, user);

        return user;
    }
}
