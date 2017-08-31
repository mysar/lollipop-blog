package io.github.mysar.blog.service;


import io.github.mysar.blog.modal.vo.Pager;

/**
 * @author Do
 * @package com.eumji.zblog.service
 * @name PagerService
 * @date 2017/4/11
 * @time 21:46
 */
public interface PagerService {
    /**
     * 初始化分页信息
     * @return
     * @param pager
     */
    void initPage(Pager pager);

    /**
     * 初始化某个category的分页信息
     * @param pager
     * @param categoryId
     */
    void loadCategoryPager(Pager pager, Integer categoryId);

    /**
     * 初始化某个tag的分页信息
     * @param pager
     * @param tagId
     */
    void loadTagPager(Pager pager, Integer tagId);

    /**
     * 初始化时间归档的分页信息
     * @param pager
     * @param createTime
     */
    void loadArchivePager(Pager pager, String createTime);
}
