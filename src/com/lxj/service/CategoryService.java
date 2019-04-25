package com.lxj.service;

import java.util.List;

import com.lxj.pojo.Category;
import com.lxj.util.Page;

/**
 * CategoryService
 */
public interface CategoryService {
    List<Category> list();

    List<Category> list(Page page);

    void add(Category category);

    int total();
}