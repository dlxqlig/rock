package org.flybird.rock.portal.service;

import org.flybird.rock.model.CmsSubject;
import org.flybird.rock.model.PmsProduct;
import org.flybird.rock.model.PmsProductCategory;
import org.flybird.rock.portal.domain.CartProduct;
import org.flybird.rock.portal.domain.HomeContentResult;

import java.util.List;

/**
 * 首页内容管理Service
 * Created by flybird on 2019/1/28.
 */
public interface HomeService {

    /**
     * 获取首页内容
     */
    HomeContentResult content();

    /**
     * 首页商品推荐
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    List<PmsProduct> getProductDetail(Long productId);
    List<PmsProduct> getProductList(String sortKey, Integer asc, Long catId, Integer pageSize, Integer pageNum);
    /**
     * 获取商品分类
     * @param parentId 0:获取一级分类；其他：获取指定二级分类
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * 根据专题分类分页获取专题
     * @param cateId 专题分类id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);

    CartProduct getProductDetailAll(Long productId);
}
