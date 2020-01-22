package org.flybird.rock.service;

import org.flybird.rock.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 * Created by flybird on 2018/10/18.
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
