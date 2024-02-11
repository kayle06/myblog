package com.blog.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ZhangXuan
 * 2024/2/11 11:37
 */
public class BeanCopyUtil {

    private BeanCopyUtil(){}

    public static <T> T copy(Object source, Class<T> targetClass) {
        try {
            T target = targetClass.newInstance();
            BeanUtils.copyProperties(source, target);
            return target;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <O, T> List<T> copyList(List<O> sourceList, Class<T> targetClass) {
        return sourceList.stream()
                .map(o -> copy(o, targetClass))
                .collect(Collectors.toList());
    }

}
