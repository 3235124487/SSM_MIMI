package com.sh.service.impl;

import com.sh.mapper.ProductTypeMapper;
import com.sh.pojo.ProductType;
import com.sh.pojo.ProductTypeExample;
import com.sh.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GGBond
 * @version 1.0
 */
@Service("ProductTypeServiceImpl")
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> getAll() {
        return productTypeMapper.selectByExample(new ProductTypeExample());
    }
}
