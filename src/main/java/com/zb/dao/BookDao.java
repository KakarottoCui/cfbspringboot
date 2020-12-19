package com.zb.dao;

import com.zb.model.Book;

import java.util.List;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public interface BookDao {
    List<Book> selectAll();
}
