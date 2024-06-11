package com.moxi.mougblog.base.mybatis.reflect;

import org.springframework.core.GenericTypeResolver;

/**
 * 来源于 MyBatis Plus 更高版本
 *
 * @author geshanzsq
 * @date 2024/6/4
 */
public class SpringReflectionHelper {

    public SpringReflectionHelper() {
    }

    public static Class<?>[] resolveTypeArguments(Class<?> clazz, Class<?> genericIfc) {
        return GenericTypeResolver.resolveTypeArguments(clazz, genericIfc);
    }

}
