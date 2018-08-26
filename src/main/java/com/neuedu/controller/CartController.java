package com.neuedu.controller;
import com.neuedu.pojo.Account;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
public class CartController {
    @RequestMapping(value = "/hello/{password}")
    public List<String> test(@RequestParam("username")String username, @PathVariable("password") String password){
        List<String> list=new ArrayList <String>();
        list.add("hello");
        list.add("spring");
        list.add(username);
        list.add(password);
        return  list;
    }
    @RequestMapping(value = "/bind")
    public Account bind( Account acc){
      return acc;
    }


}
