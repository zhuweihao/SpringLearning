package com.zhuweihao.SpringFramework.controller;

import com.zhuweihao.SpringFramework.service.BankService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/10 11:05
 * @Description com.zhuweihao.SpringFramework.controller
 */
@Controller
public class BankController {
    @Resource
    private BankService bankService;
    public void testBank(){
        bankService.transferAccounts("1","2",200);
    }
}
