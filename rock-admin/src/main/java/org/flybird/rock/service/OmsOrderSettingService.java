package org.flybird.rock.service;

import org.flybird.rock.model.OmsOrderSetting;

/**
 * 订单设置Service
 * Created by flybird on 2018/10/16.
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
