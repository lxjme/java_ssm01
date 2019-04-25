package com.lxj.controller;

import java.util.List;

import com.lxj.pojo.Category;
import com.lxj.service.CategoryService;
import com.lxj.util.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * CategoryController
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page) {
        List<Category> cs = categoryService.list(page);

        for (Category c : cs) {
            System.out.println(c.getC_name());
        }

        int total = categoryService.total();
        page.calcLast(total);
        ModelAndView mav = new ModelAndView("list_category");
        mav.addObject("cs", cs);
        return mav;
    }

    @RequestMapping("addCategory")
    public ModelAndView addCategory() {
        return null;
        // for (int i = 100; i < 150; i++) {
        // Category c = new Category();
        // c.setC_name("分类" + i);
        // categoryService.add(c);
        // }

        // ModelAndView mav = new ModelAndView("add_category");
        // return mav;
    }

}