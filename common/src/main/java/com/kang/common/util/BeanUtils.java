package com.kang.common.util;

import com.kang.common.exception.BeanUtilsException;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

public class BeanUtils {
    /**
     * 封装{@link org.springframework.beans.BeanUtils#copyProperties}，惯用与直接将转换结果返回
     *
     * <pre>
     *      UserBean userBean = new UserBean("username");
     *      return BeanUtil.transform(UserDTO.class, userBean);
     * </pre>
     */
    public static <T> T transfrom(Class<T> clazz, Object src) {
        if (src == null) {
            return null;
        }
        T instance = null;
        try {
            instance = clazz.newInstance();
        } catch (Exception e) {
            throw new BeanUtilsException(e);
        }
        org.springframework.beans.BeanUtils.copyProperties(src, instance, getNullPropertyNames(src));
        return instance;
    }
    private static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for (PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
