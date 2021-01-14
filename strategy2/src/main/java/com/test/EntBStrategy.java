package com.test;

import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author hulinjun
 * @since 2021/1/13
 */
@Component
public class EntBStrategy implements EntStrategy {
    @Override
    public String getStuff() {
        return "企业B";
    }

    @Override
    public void send() {
        System.out.println("发送B标准的报文给对应企业");
    }

    @Override
    public String toString() {
        return getStuff();
    }
}