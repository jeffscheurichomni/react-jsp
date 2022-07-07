package com.luwojtaszek.springbootjsp.web.controller;

import com.luwojtaszek.springbootjsp.web.constant.View;

import javafx.geometry.Pos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/**
 * Created by lukasz on 27.08.2017.
 * With IntelliJ IDEA 15
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getdata() {
        
		List<Post> list = getList();

		//return back to index.jsp
		ModelAndView model = new ModelAndView("views/index");
		model.addObject("lists", list);

		return model;
	}
    public class Post{
        public int id;
        public int type;
        public String title;
        public String desc;
        public int likes;

        public Post(Integer id, Integer type, String title, String desc, Integer likes){
            this.id=id;
            this.type=type;
            this.title=title;
            this.desc=desc;
            this.likes=likes;
        }
        public int getId(){
            return id;
        }
        public int getType(){
            return type;
        }
        public String getTitle(){
            return title;
        }
        public String getDesc(){
            return desc;
        }
        public int getLikes(){
            return likes;
        }
        @Override
        public String toString(){
            return this.id + this.type + this.title + this.desc + this.likes;
        }
    }

	public List<Post> getList() {

		List<Post> list = new ArrayList<Post>();

        // HashMap<String, String> map = new HashMap<String, String>();
        // map.put("title", "title1");
        // list.add(map);
        // map = new HashMap<String, String>();
        // map.put("title", "title2");
        // list.add(map);
        String desc1 = "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries";
        String desc2 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old.";
        String desc3 = "Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur,";
        String desc4 = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form";
        
        // HashMap<Integer, Post> map = new HashMap<Integer, Post>();
        Post post1 = new Post(1, 1, "Post Title 1", desc1, 3);
        Post post2 = new Post(2, 1, "Post Title 2", desc2, 12);
        Post post3 = new Post(3, 2, "Post Title 3", desc3, 0);
        Post post4 = new Post(4, 3, "Post Title 4", desc4, 1000);

        list.add(post1);
        list.add(post2);
        list.add(post3);
        list.add(post4);

        // map.put(0, post1);
		// list.add(map);

        // map = new HashMap<Integer, Post>();
        // map.put(1, post2);
		// list.add(map);

        // map = new HashMap<Integer, Post>();
        // map.put(2, post3);
		// list.add(map);

        // map = new HashMap<Integer, Post>();
        // map.put(3, post4);
        // list.add(map);

		return list;

	}

}
