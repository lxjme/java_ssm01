package com.lxj.mapper;

import java.util.List;

import com.lxj.pojo.Category;
import com.lxj.util.Page;

/**
 * CategoryMapper
 */
public interface CategoryMapper {
        public int add(Category category);

        public void delete(int id);

        public Category get(int id);

        public int update(Category category);

        public List<Category> list();

        public List<Category> list(Page page);

        public int total();
}