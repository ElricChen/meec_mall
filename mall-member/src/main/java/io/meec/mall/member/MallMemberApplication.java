package io.meec.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients(basePackages = "io.meec.mall.member.feign")
//@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemberApplication {
  
    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
