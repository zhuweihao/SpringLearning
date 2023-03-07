package com.zhuweihao.SpringFramework.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 10:12
 * @Description com.zhuweihao.SpringFramework.pojo
 */
public class Stu {
    private List<String> course;
    private Integer[] score;
    private Map<String, Integer> performance;
    private Set<User> classmate;

    public Set<User> getClassmate() {
        return classmate;
    }

    public void setClassmate(Set<User> classmate) {
        this.classmate = classmate;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public Integer[] getScore() {
        return score;
    }

    public void setScore(Integer[] score) {
        this.score = score;
    }

    public Map<String, Integer> getPerformance() {
        return performance;
    }

    public void setPerformance(Map<String, Integer> performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Stu={" + course.toString() +
                " , " + Arrays.toString(score) +
                " , " + performance.toString() +
                " , " + classmate.toString();
    }
}
