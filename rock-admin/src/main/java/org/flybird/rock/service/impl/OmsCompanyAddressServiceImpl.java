package org.flybird.rock.service.impl;

import org.flybird.rock.mapper.OmsCompanyAddressMapper;
import org.flybird.rock.model.OmsCompanyAddress;
import org.flybird.rock.model.OmsCompanyAddressExample;
import org.flybird.rock.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by flybird on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
