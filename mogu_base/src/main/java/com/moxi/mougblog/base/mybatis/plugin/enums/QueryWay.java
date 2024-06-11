package com.moxi.mougblog.base.mybatis.plugin.enums;

/**
 * 查询方式枚举
 *
 * @author geshanzsq
 * @date 2022/11/4
 */
public enum QueryWay {

    /**
     * 等于
     */
    EQ,

    /**
     * 不等于
     */
    NE,

    /**
     * 大于
     */
    GT,

    /**
     * 大于等于
     */
    GE,

    /**
     * 小于
     */
    LT,

    /**
     * 小于等于
     */
    LE,

    /**
     * 模糊
     */
    LIKE,

    /**
     * 不模糊
     */
    NOT_LIKE,

    /**
     * 左模糊
     */
    LIKE_LEFT,

    /**
     * 右模糊
     */
    LIKE_RIGHT,

    /**
     * 包含
     */
    IN,

    /**
     * 不包含
     */
    NOT_IN

}
