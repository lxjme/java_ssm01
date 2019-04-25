package com.lxj.test01;

import java.util.List;

import com.lxj.pojo.Category;
import com.lxj.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TestCategory
 */
@Component
public class TestCategory {

    @Autowired
    private CategoryService categoryService;

    
    public static void main(String[] args) {
        TestCategory tc = new TestCategory();
        tc.listCategory();
    }

    /**
     * 
     */
    private void listCategory() {
        System.out.println(categoryService);
        List<Category> cs = categoryService.list();
        for (Category c : cs) {
            System.out.println(c.getC_name());
        }
    }
}