package com.zb.dao.impl;

import com.zb.dao.BookDao;
import com.zb.mapper.BookMapper;
import com.zb.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cuifengbo on 2020/12/9.
 */
@Component
public class BookDaoImpl implements BookDao {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }
}
