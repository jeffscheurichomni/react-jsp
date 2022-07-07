package com.luwojtaszek.springbootjsp.web.controller;

import com.luwojtaszek.springbootjsp.web.constant.View;

import java.util.ArrayList;

import javax.management.AttributeValueExp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lukasz on 27.08.2017.
 * With IntelliJ IDEA 15
 */
@Controller
public class PageController {

    @GetMapping("/page")
    public String getHomePage(Model model) {
        class Post {
            public int id;
            public String title;
            public String desc;
            
            Post(int id, String title, String desc)
            {
                this.id = id;
                this.title = title;
                this.desc = desc;
            }
        }
        Post[] arr = new Post[3];
        arr[0] = new Post(1, "post title 1", "post desc 1");
        arr[1] = new Post(2, "post title 2", "post desc 2");
        arr[2] = new Post(3, "post title 3", "post desc 3");

        // List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");

        
        model.addAttribute("data", "you");
        return "views/page";
    }
}
