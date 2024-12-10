package com.onlineexam.system.online_exam_system.Repository;

import com.onlineexam.system.online_exam_system.Dto.UserDto;
import com.onlineexam.system.online_exam_system.Model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User createUser(UserDto userDto);
    User updateUser(int id, UserDto userDto);
    void deleteUser(int id);
}
