package org.flybird.rock.security.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.flybird.rock.common.api.CommonResult;
import org.flybird.rock.security.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Api(tags = "SecurityAuthController", description = "获取验证码")
@RequestMapping("/auth")
public class SecurityAuthController {

    @Autowired
    private AuthService authService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/captcha", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(HttpServletRequest request, HttpServletResponse response) {
        return authService.create(request, response);
    }
}
