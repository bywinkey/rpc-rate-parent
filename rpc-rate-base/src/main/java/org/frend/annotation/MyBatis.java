package org.frend.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @auther frend
 * @createDate 2018/1/5
 * @Note: 自定义Mybatis的注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Component
public @interface MyBatis {
}
