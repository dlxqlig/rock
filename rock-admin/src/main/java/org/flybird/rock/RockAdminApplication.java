package org.flybird.rock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 应用启动入口
 * Created by flybird on 2018/4/26.
 */
@SpringBootApplication
public class RockAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(RockAdminApplication.class, args);
    }
}
