package org.flybird.rock.portal.domain;

import org.flybird.rock.model.PmsProduct;
import org.flybird.rock.model.PmsProductAttribute;
import org.flybird.rock.model.PmsSkuStock;

import java.util.List;

/**
 * 购物车中选择规格的商品信息
 * Created by flybird on 2018/8/2.
 */
public class CartProduct extends PmsProduct {
    private String  feightTemplateName;
    private List<PmsProductAttribute> productAttributeList;
    private List<PmsSkuStock> skuStockList;

    public String getFeightTemplateName() {
        return feightTemplateName;
    }

    public void setFeightTemplateName(String feightTemplateName) {
        this.feightTemplateName = feightTemplateName;
    }

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }
}
