package com.bank1.controller;


import com.bank1.ceshi.Address;
import com.bank1.ceshi.Customer;
import com.bank1.ceshi.Foot;
import com.bank1.service.AccountInfoService;
import com.bank1.springbeanprocessos.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bank1")
@RestController
public class Bank1Controller {

    @Autowired
    private AccountInfoService accountInfoService;

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private Foot foot;

    @GetMapping("/transfer")
    public Boolean transfer(@RequestParam("cardNumber") String cardNumber, @RequestParam("money") Integer money) {
        accountInfoService.updateAccountBalance(cardNumber, money);
        return true;
    }


    /**
     * 测试BeanPostProcessor
     */
    @GetMapping("/BeanPostProcessor")
    public void BeanPostProcessor(){
      //Test1 test1 =  applicationContext.getBean(Test1.class);
     // test1.show();
        Customer customer = applicationContext.getBean(Customer.class);
        Address address = customer.getAddress();
        System.out.println(address.toString());
    }

    /**
     * 测试
     *容器启动的时候，就会自动将当前ApplicationContext容器本身注入到FooBar中，因为ApplicationContext类型容器可以自动识别Aware接口
     */
    @GetMapping("ce1")
    public void ce1(){
        foot.ce();
    }

}
