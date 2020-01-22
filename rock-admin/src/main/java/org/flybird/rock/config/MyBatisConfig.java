package org.flybird.rock.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by flybird on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"org.flybird.rock.mapper","org.flybird.rock.dao"})
public class MyBatisConfig {
}
