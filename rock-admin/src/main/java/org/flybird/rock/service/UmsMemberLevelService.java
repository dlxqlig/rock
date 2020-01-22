package org.flybird.rock.service;

import org.flybird.rock.model.UmsMemberLevel;

import java.util.List;

/**
 * 会员等级管理Service
 * Created by flybird on 2018/4/26.
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
