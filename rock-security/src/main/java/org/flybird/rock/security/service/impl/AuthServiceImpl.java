package org.flybird.rock.security.service.impl;

import com.google.common.net.HttpHeaders;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import io.micrometer.core.instrument.util.StringUtils;
import org.flybird.rock.common.api.CommonResult;
import org.flybird.rock.security.service.AuthService;
import org.flybird.rock.security.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private RedisService redisService;

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public CommonResult create(HttpServletRequest request, HttpServletResponse response) {
        String key = request.getParameter("key");
        if (StringUtils.isBlank(key)) {
            return CommonResult.failed("验证码key不能为空");
        }
        Captcha captcha = new SpecCaptcha(100, 48, 4);;
        captcha.setCharType(2);
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + key,  captcha.text());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + key, AUTH_CODE_EXPIRE_SECONDS);
        response.setHeader(HttpHeaders.PRAGMA, "No-cache");
        response.setHeader(HttpHeaders.CACHE_CONTROL, "No-cache");
        response.setDateHeader(HttpHeaders.EXPIRES, 0L);

        try {
            captcha.out(response.getOutputStream());
        } catch (IOException e) {
            return CommonResult.failed("验证码生成失败");
        }
        return CommonResult.success(captcha.text(),"获取验证码成功");
    }
}
