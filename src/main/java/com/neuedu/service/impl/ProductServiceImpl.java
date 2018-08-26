package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.dao.ProductMapper;
import com.neuedu.pojo.Product;
import com.neuedu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
 @Service
public class ProductServiceImpl  implements ProductService {
  @Autowired
  ProductMapper productMapper;
  @Override
  public List<Product> findall() {
        return productMapper.selectAll();
    }

     @Override
     public PageInfo <Product> findaBypage(Integer pageNum, Integer pageSize) {
         PageHelper.startPage(pageNum,pageSize);
         PageInfo<Product> pageInfo=new PageInfo <>(productMapper.selectAll());
         return pageInfo;
     }
 }
