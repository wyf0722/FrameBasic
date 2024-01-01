package com.fan;

import com.fan.service.BookService;
import com.fan.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        // 删除new创建对象后 NullPointerException
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
