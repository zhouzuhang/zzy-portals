package com.zzyportals.service.impl;



import com.zzyportals.dao.UserDOMapper;
import com.zzyportals.dataobject.UserDO;
import com.zzyportals.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(rollbackFor = {Exception.class}) // 实现 AOP 数据库事务的控制，@Transactional 默认情况下所有的操作方法都开启事务。
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDOMapper userDOMapper;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true) // 覆盖类级上的事务属性
    public UserDO findByLogin(UserDO user) {
        return userDOMapper.selectForLogin(user);
    }
}
