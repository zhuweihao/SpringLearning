package com.zhuweihao.SpringFramework.dao.impl;

import com.zhuweihao.SpringFramework.dao.TeacherDao;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 21:30
 * @Description com.zhuweihao.SpringFramework.dao.impl
 */
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void teach(){
        System.out.println("老师授课中");
    }
}
