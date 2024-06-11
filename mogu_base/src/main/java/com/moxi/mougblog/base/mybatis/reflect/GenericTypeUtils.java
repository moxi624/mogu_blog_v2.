package com.moxi.mougblog.base.mybatis.reflect;

/**
 * 来源于 MyBatis Plus 更高版本
 *
 * @author geshanzsq
 * @date 2024/6/4
 */
public class GenericTypeUtils {

    private static IGenericTypeResolver GENERIC_TYPE_RESOLVER;

    public GenericTypeUtils() {
    }

    public static Class<?>[] resolveTypeArguments(final Class<?> clazz, final Class<?> genericIfc) {
        return null == GENERIC_TYPE_RESOLVER ? SpringReflectionHelper.resolveTypeArguments(clazz, genericIfc) : GENERIC_TYPE_RESOLVER.resolveTypeArguments(clazz, genericIfc);
    }

    public static void setGenericTypeResolver(IGenericTypeResolver genericTypeResolver) {
        GENERIC_TYPE_RESOLVER = genericTypeResolver;
    }

}
