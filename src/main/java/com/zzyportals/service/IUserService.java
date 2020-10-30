package com.zzyportals.service;


import com.zzyportals.dataobject.UserDO;

public interface IUserService {
    UserDO findByLogin(UserDO user);
}
