package com.moxi.mougblog.base.mybatis.page.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页对象
 *
 * @author geshanzsq
 * @date 2022/3/27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVO<T> implements Serializable {

    private static final Long serialVersionUID = 1L;

    /**
     * 数据列表
     */
    private List<T> records;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 每页显示记录数
     */
    private long size;

}
