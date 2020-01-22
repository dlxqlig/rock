package org.flybird.rock.security.service;

import org.flybird.rock.common.api.CommonResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AuthService {

    public CommonResult create(HttpServletRequest request, HttpServletResponse response);
}