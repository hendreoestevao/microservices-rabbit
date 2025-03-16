package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducers;
import com.ms.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserProducers userProducers;

    @Transactional
    public UserModel save(UserModel userModel) {
        userModel = userRepository.save(userModel);
        userProducers.publishMessageEmail(userModel);
        return userModel;
    }
}
