package org.flybird.rock.portal.service;

import org.flybird.rock.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * Created by flybird on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
