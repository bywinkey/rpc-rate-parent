package org.frend.hello;

import org.frend.hello.pojo.YUserEntity;
import org.frend.hello.service.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @auther frend
 * @createDate 2018/1/22
 * @Note:
 */
@ContextConfiguration("classpath:config/spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloTest {

    @Autowired
    private IHelloService helloService;

    @Test
    public void testLoad(){
        YUserEntity yUserEntity = helloService.loadUserByName("admin");
        if(yUserEntity != null) System.out.println(yUserEntity);
    }
}
