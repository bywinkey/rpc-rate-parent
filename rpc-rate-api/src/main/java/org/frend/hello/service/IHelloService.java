package org.frend.hello.service;

import org.frend.hello.pojo.YUserEntity;

/**
 * @auther frend
 * @createDate 2018/1/22
 * @Note:
 */
public interface IHelloService {

    String sayHello(String name);

    YUserEntity loadUserByName(String name);
}
