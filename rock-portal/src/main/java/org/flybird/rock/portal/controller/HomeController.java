package org.flybird.rock.portal.controller;

import org.flybird.rock.common.api.CommonResult;
import org.flybird.rock.model.CmsSubject;
import org.flybird.rock.model.PmsProduct;
import org.flybird.rock.model.PmsProductCategory;
import org.flybird.rock.portal.domain.CartProduct;
import org.flybird.rock.portal.domain.HomeContentResult;
import org.flybird.rock.portal.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.flybird.rock.portal.service.OmsCartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页内容管理Controller
 * Created by flybird on 2019/1/28.
 */
@Controller
@Api(tags = "HomeController", description = "公共内容管理")
@RequestMapping("/home")

public class HomeController {
    @Autowired
    private HomeService homeService;
    @Autowired
    private OmsCartItemService cartItemService;

    @ApiOperation("首页内容页信息展示")
    @RequestMapping(value = "/content", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<HomeContentResult> content() {
        HomeContentResult contentResult = homeService.content();
        return CommonResult.success(contentResult);
    }

    @ApiOperation("分页获取推荐商品")
    @RequestMapping(value = "/recommendProductList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProduct>> recommendProductList(@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> productList = homeService.recommendProductList(pageSize, pageNum);
        return CommonResult.success(productList);
    }
    @ApiOperation("获取某个商品所有信息")
    @RequestMapping(value = "/getProduct", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CartProduct> getProductDetailAll(
            @RequestParam(value="productId", defaultValue="-1") Long productId) {
        if(productId != -1 ) {
            CartProduct cartProduct = homeService.getProductDetailAll(productId);
            return CommonResult.success(cartProduct);
        } else {
            return CommonResult.failed("不能取得商品详情信息。");
        }

    }

    @ApiOperation("条件获取商品")
    @RequestMapping(value = "/getProductList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProduct>> getProductList(
             @RequestParam(value="sortKey", defaultValue="") String sortKey,
             @RequestParam(value = "asc", defaultValue = "-1") Integer asc,
             @RequestParam(value = "catId", defaultValue = "-1") Long catId,
             @RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> productList = homeService.getProductList(
                sortKey, asc, catId, pageSize, pageNum);
        return CommonResult.success(productList);
    }
    @ApiOperation("获取商品详情")
    @RequestMapping(value = "/getProductDetail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProduct>> getProductDetail(
            @RequestParam(value="productId", defaultValue="-1") Long productId) {
        if(productId != -1 ) {
            List<PmsProduct> productList = homeService.getProductDetail(productId);
            return CommonResult.success(productList);
        } else {
            return CommonResult.success(new ArrayList<PmsProduct>());
        }
    }

    @ApiOperation("获取所有商品分类")
    @RequestMapping(value = "/productCateList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductCategory>> getProductCateListAll() {
        List<PmsProductCategory> productCategoryList = homeService.getProductCateList(-1L);
        return CommonResult.success(productCategoryList);
    }

    @ApiOperation("获取商品分类")
    @RequestMapping(value = "/productCateList/{parentId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductCategory>> getProductCateList(@PathVariable Long parentId) {
        List<PmsProductCategory> productCategoryList = homeService.getProductCateList(parentId);
        return CommonResult.success(productCategoryList);
    }

    @ApiOperation("根据分类获取专题")
    @RequestMapping(value = "/subjectList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CmsSubject>> getSubjectList(@RequestParam(required = false) Long cateId,
                                                         @RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<CmsSubject> subjectList = homeService.getSubjectList(cateId,pageSize,pageNum);
        return CommonResult.success(subjectList);
    }
}
