package com.zhuweihao.SpringFramework.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author zhuweihao
 * @Date 2023/3/9 21:16
 * @Description com.zhuweihao.SpringFramework.pojo
 */
@Setter
@Getter
@ToString
public class bank {
    private String account;
    private String name;
    private Integer money;

    public bank(String account, String name, Integer money) {
        this.account = account;
        this.name = name;
        this.money = money;
    }
}
