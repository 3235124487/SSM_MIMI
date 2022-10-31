package com.sh.service;

import com.github.pagehelper.PageInfo;
import com.sh.pojo.ProductInfo;
import com.sh.pojo.vo.ProductInfoVo;

import java.util.List;

/**
 * @author GGBond
 * @version 1.0
 */
public interface ProductInfoService {
    List<ProductInfo> getAll();

    PageInfo splitPage(Integer pageNum, Integer pageSize);

    int save(ProductInfo info);

    ProductInfo getbyid(Integer pid);

    int update(ProductInfo info);

    int delete(Integer pid);

    int deleteBatch(String[] ids);

    List<ProductInfo> selectCondition(ProductInfoVo vo);

    public PageInfo splitPageVo(ProductInfoVo vo,int pageSize);
}
