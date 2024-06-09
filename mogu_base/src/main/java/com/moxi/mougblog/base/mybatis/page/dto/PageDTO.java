package com.moxi.mougblog.base.mybatis.page.dto;
import com.moxi.mougblog.base.mybatis.plugin.annotation.Query;
import lombok.Data;

import java.io.Serializable;

/**
 * 分页对象
 *
 * @author geshanzsq
 * @date 2022/3/27
 */
@Data
public class PageDTO implements Serializable {

    private static final Long serialVersionUID = 1L;

    /**
     * 每页显示记录数
     */
    @Query(ignore = true)
    private Long pageSize;

    /**
     * 起始页
     */
    @Query(ignore = true)
    private Long currentPage;

    /**
     * 排序列，多个用逗号分开
     */
    @Query(ignore = true)
    private String orderColumn;

    /**
     * 排序类型(asc 或 desc)，多个用逗号分开
     */
    @Query(ignore = true)
    private String orderType;

}
