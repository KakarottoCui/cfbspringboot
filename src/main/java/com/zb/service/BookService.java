package com.zb.service;

import com.github.pagehelper.PageInfo;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public interface BookService {
    PageInfo selectAll(int pageNum, int pageSize);
}
