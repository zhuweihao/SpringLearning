package com.zhuweihao.SpringFramework.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author zhuweihao
 * @Date 2023/3/8 15:11
 * @Description com.zhuweihao.SpringFramework.pojo
 */
@Setter
@Getter
@ToString
public class Fruit {
    private Integer fid;
    private String fname;
    private Integer price;
    private Integer fcount;
    private String remark;

    public Fruit() {
    }

    public Fruit(Integer fid, String fname, Integer price, Integer fcount, String remark) {
        this.fid = fid;
        this.fname = fname;
        this.price = price;
        this.fcount = fcount;
        this.remark = remark;
    }
}
