package com.example.demo.common.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.crypto.hash.SimpleHash;


/**
 * @author wuhengzhen
 * @date 2019/7/31 17:11
 */
@Slf4j
public class CommonsUtils {


    /**
     * 获取六位数验证码
     *
     * @return 验证码
     */
    public static int getCode() {
        return (int) ((Math.random() * 9 + 1) * 100000);
    }

    /**
     * 使用md5加密
     *
     * @param password    需要加密的密码
     * @param phoneNumber 手机号
     * @return 返回加密后的密码
     */
    public static String encryptPassword(String password, String phoneNumber) {
        return String.valueOf(new SimpleHash("MD5", password, phoneNumber, 1024));
    }

}
