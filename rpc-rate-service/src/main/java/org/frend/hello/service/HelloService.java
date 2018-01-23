package org.frend.hello.service;

import org.frend.hello.pojo.YUserEntity;
import org.frend.hello.repository.database.YUserEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auther frend
 * @createDate 2018/1/22
 * @Note:
 */
@Service
@Transactional(readOnly = true)
public class HelloService implements IHelloService {

    @Autowired
    private YUserEntityDao userDao;

    public String sayHello(String name) {
        return "hi " + name;
    }

    public YUserEntity loadUserByName(String name) {
        return userDao.loadUserByName(name);
    }
}
