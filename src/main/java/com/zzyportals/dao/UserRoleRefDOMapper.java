package com.zzyportals.dao;

import com.zzyportals.dataobject.UserRoleRefDO;
import com.zzyportals.dataobject.UserRoleRefDOKey;

public interface UserRoleRefDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(UserRoleRefDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(UserRoleRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(UserRoleRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    UserRoleRefDO selectByPrimaryKey(UserRoleRefDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(UserRoleRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(UserRoleRefDO record);
}