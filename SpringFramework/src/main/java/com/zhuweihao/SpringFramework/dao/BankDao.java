package com.zhuweihao.SpringFramework.dao;

/**
 * @Author zhuweihao
 * @Date 2023/3/9 21:18
 * @Description com.zhuweihao.SpringFramework.dao.impl
 */
public interface BankDao {
    void addMoney();
    void reduceMoney();

    void updateMoneyByAccount(String account,Integer money);
    Integer getAccountBalance(String account);
}
