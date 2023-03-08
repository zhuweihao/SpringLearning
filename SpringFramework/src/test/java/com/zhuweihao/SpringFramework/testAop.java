package com.zhuweihao.SpringFramework;

import com.zhuweihao.SpringFramework.config.SpringConfig;
import com.zhuweihao.SpringFramework.dao.TeacherDao;
import com.zhuweihao.SpringFramework.dao.impl.TeacherDaoImpl;
import com.zhuweihao.SpringFramework.proxy.TeacherProxy;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

/**
 * @Author zhuweihao
 * @Date 2023/3/8 11:29
 * @Description com.zhuweihao.SpringFramework
 */
public class testAop {

    @Test
    public void aop(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        TeacherDaoImpl teacherDao = applicationContext.getBean("teacherDaoImpl", TeacherDaoImpl.class);
        teacherDao.teach();
    }
}
