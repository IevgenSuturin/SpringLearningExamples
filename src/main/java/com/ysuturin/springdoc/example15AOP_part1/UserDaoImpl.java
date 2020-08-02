package com.ysuturin.springdoc.example15AOP_part1;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao{
    private static Map<Integer, UserDTO> userIdToUserDTO = new HashMap<>();

    @Override
    public UserDTO getUser(int id) {

        if(userIdToUserDTO.get(id) != null){
            return userIdToUserDTO.get(id);
        }

        UserDTO user = new UserDTO(id);
        userIdToUserDTO.put(id, user);

        return user;
    }
}
