package com.man.cafe.controllersImpl;

import com.man.cafe.constants.CafeConstants;
import com.man.cafe.controllers.UserController;
import com.man.cafe.generics.CafeGenerics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.man.cafe.services.UserService;

import java.util.Map;

@RestController
public class UserControllerImpl implements UserController {
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            return userService.signUp(requestMap);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return CafeGenerics.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
