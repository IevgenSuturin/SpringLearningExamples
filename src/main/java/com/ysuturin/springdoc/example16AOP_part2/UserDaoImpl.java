package com.ysuturin.springdoc.example16AOP_part2;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private static Map<Integer, UserDTO> userIdToUserDTO = new HashMap<>();

    @Log
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
