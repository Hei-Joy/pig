package com.mall.service;

import com.mall.model.entity.Shareholder;

/**
 * Created by 46275 on 2018/12/24.
 */
public interface ShareholderService {

    /**
     * 添加股东信息
     * @param shareholder   股东信息
     * @return
     */
    public boolean insertShareholder(Shareholder shareholder);

    /**
     * 更新股东信息
     * @param shareholder   股东信息
     * @return
     */
    public boolean updateShareholder(Shareholder shareholder);

    /**
     * 删除股东信息
     * @param id   股东信息id
     * @return
     */
    public boolean deleteShareholder(String id);

    /**
     * 根据ID查询股东信息
     * @param id    股东信息id
     * @return
     */
    public Shareholder findShareholderById(String id);



}
