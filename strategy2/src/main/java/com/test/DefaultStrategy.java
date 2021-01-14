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
public class DefaultStrategy  implements EntStrategy {
    @Override
    public String getStuff() {
        return "其他企业";
    }

    @Override
    public void send() {
        System.out.println("发送默认标准的报文给对应企业");
    }

    @Override
    public String toString() {
        return getStuff();
    }
}