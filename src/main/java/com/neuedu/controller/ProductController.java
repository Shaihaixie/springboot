package com.neuedu.controller;
import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Product;
import com.neuedu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ProductController {
@Autowired
    ProductService productService;
    @RequestMapping(value = "/findall")
     public List<Product> findAll(){
     return  productService.findall();
    }
   @RequestMapping(value = "/findbypage/{pageno}/{pagesize}")
    public PageInfo<Product> findbypage(@PathVariable("pageno") Integer pageno, @PathVariable("pagesize") Integer pagesize){
         return   productService.findaBypage(pageno,pagesize);
    }
}
