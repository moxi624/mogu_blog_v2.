package com.moxi.mogublog.xo.dto;

import com.moxi.mougblog.base.mybatis.page.dto.PageDTO;
import com.moxi.mougblog.base.mybatis.plugin.annotation.Query;
import com.moxi.mougblog.base.mybatis.plugin.enums.QueryWay;
import lombok.Data;

/**
 * @author geshanzsq
 * @date 2024/6/3
 */
@Data
public class SysParamsPageDTO extends PageDTO {

    /**
     * 参数名称
     */
    @Query(QueryWay.LIKE)
    private String paramsName;

    /**
     * 参数键名
     */
    @Query(QueryWay.LIKE)
    private String paramsKey;
}
