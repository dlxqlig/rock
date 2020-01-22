package org.flybird.rock.service.impl;

import org.flybird.rock.mapper.CmsPrefrenceAreaMapper;
import org.flybird.rock.model.CmsPrefrenceArea;
import org.flybird.rock.model.CmsPrefrenceAreaExample;
import org.flybird.rock.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by flybird on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
