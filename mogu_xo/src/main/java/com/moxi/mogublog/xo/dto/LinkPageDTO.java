package com.moxi.mogublog.xo.dto;

import com.moxi.mogublog.xo.global.SQLConf;
import com.moxi.mougblog.base.mybatis.page.dto.PageDTO;
import com.moxi.mougblog.base.mybatis.plugin.annotation.Query;
import com.moxi.mougblog.base.mybatis.plugin.enums.QueryWay;
import lombok.Data;

/**
 * 友情链接分页
 *
 * @author geshanzsq
 * @date 2024/6/12
 */
@Data
public class LinkPageDTO extends PageDTO {

    /**
     * 友链标题
     */
    @Query(value = QueryWay.LIKE, fieldName = SQLConf.TITLE)
    private String keyword;

    /**
     * 友链状态： 0 申请中， 1：已上线，  2：已拒绝
     */
    private Integer linkStatus;

}
