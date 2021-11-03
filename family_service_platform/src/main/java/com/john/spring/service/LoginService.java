package com.john.spring.service;

import com.john.spring.dao.TblUserRecordMapper;
import com.john.spring.entity.TblUserRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    TblUserRecordMapper tabTblUserRecordMapper;

    public TblUserRecord login(String username, String password) {
        return tabTblUserRecordMapper.selectUser(username, password);
    }

}
