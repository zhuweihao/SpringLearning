package com.zhuweihao.SpringFramework.service;

/**
 * @Author zhuweihao
 * @Date 2023/3/10 11:06
 * @Description com.zhuweihao.SpringFramework.service
 */
public interface BankService {
    //转账操作
    void transferAccounts(String transferOutAccount,String transferInAccount,Integer transferAmount);
}
