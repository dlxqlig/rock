package org.flybird.rock.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by flybird on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"org.flybird.rock.mapper","org.flybird.rock.portal.dao"})
public class MyBatisConfig {
}
