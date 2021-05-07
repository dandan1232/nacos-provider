package online.danbao.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 蛋宝
 * @date: 2021/5/7 22:53
 * @description: ProviderController
 */
@RestController
@RefreshScope
public class ProviderController {

    @Value("${myName}")
    private String name;

    @GetMapping("hello")
    public String hello(){
//        int a =3 / 0;
        return "hello " +name;
    }
}