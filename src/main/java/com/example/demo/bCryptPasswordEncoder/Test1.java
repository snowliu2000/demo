package com.example.demo.bCryptPasswordEncoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author lsl
 * @version [1.0.0, 2019/7/1,16:17]
 */
public class Test1 {
    public static void main(String[] args) {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        boolean result = bCryptPasswordEncoder.matches("admin", "$2a$10$rAiXjAIe.T0.tTIWxRrfuepdfwc45QqexhGP.dSa.hZQs0R/mND5m");
//        System.out.println(result);
        String password = "111111";
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        for (int i = 0; i < 10; i++) {
            //每个计算出的Hash值都不一样        
            String hashPass = passwordEncoder.encode(password);
            System.out.println(hashPass);
            //虽然每次计算的密码Hash值不一样但是校验是通过的        
            boolean f = passwordEncoder.matches(password, hashPass);
            System.out.println(f);
        }
    }
}
