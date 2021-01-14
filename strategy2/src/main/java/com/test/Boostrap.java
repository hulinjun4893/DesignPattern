package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author hulinjun
 * @since 2021/1/13
 */
@Configuration

@ComponentScan("com.test")
public class Boostrap {

    public static void main(String[] args) {
        String entNum = "entBStrategy";
        send(entNum);
        entNum = "defaultStrategy";
        send(entNum);
    }

    // 用这个方法模拟 企业代理服务 提供的Api
    public static void send(String entNum) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Boostrap.class);
        context.getBean(EntStrategyHolder.class).getBy(entNum).send();
    }
}
