package com.neuedu.service;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> findall();
    PageInfo<Product> findaBypage(Integer pageNum, Integer pageSize);
}
