package com.zhuweihao.SpringFramework.service.impl;

import com.zhuweihao.SpringFramework.dao.BankDao;
import com.zhuweihao.SpringFramework.service.BankService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/10 11:06
 * @Description com.zhuweihao.SpringFramework.service.impl
 */
@Service
public class BankServiceImpl implements BankService {
    @Resource
    private BankDao bankDao;

    @Override
    @Transactional  //这个注解可以添加到类上面，也可以添加到方法上面
    public void transferAccounts(String transferOutAccount, String transferInAccount, Integer transferAmount) {
        //手动实现事务管理
//        Integer outAccountBalance = bankDao.getAccountBalance(transferOutAccount);
//        if(outAccountBalance<transferAmount){
//            System.out.println("账号余额不足");
//        }else{
//            Integer inAccountBalance = bankDao.getAccountBalance(transferInAccount);
//            try{
//                //开启事务
//                //进行业务操作
//                bankDao.updateMoneyByAccount(transferOutAccount,outAccountBalance-transferAmount);
//                //模拟异常
//                int i=10/0;
//                bankDao.updateMoneyByAccount(transferInAccount,inAccountBalance+transferAmount);
//                //没有发生异常，提交事务
//            }catch (Exception e){
//                //出现异常，事务回滚
//            }
//        }

        //基于注解@Transcational
        Integer outAccountBalance = bankDao.getAccountBalance(transferOutAccount);
        if (outAccountBalance < transferAmount) {
            System.out.println("账号余额不足");
        } else {
            Integer inAccountBalance = bankDao.getAccountBalance(transferInAccount);
            bankDao.updateMoneyByAccount(transferOutAccount, outAccountBalance - transferAmount);
            //模拟异常
            int i = 10 / 0;
            bankDao.updateMoneyByAccount(transferInAccount, inAccountBalance + transferAmount);
        }
    }
}
