package com.example.opencs.mapper;


import com.example.opencs.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author wuliang
 * @date 2021/8/19
 */

public interface UserMapper {

    @Insert("Insert Into user(user_id,user_name,user_password,user_email,user_phone,gmt_create,gmt_modified)"
          +"Values(#{user_id},#{user_name},#{user_password},#{user_email},#{user_phone},#{gmt_create},#{gmt_modified})")
            void  insert(User user);

}
