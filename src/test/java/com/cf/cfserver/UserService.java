package com.cf.cfserver;

import com.cf.WebAppConfig;
import com.cf.entity.User;
import com.cf.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebAppConfig.class)
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        List<User> all = userMapper.getAll();
        for (User user: all) {
            System.out.println("姓名:"+user.getName()+"性别"+ (user.getSex() == 1?"男":"女"));
        }
    }
}
