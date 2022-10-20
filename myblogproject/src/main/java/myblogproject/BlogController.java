package myblogproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class BlogController {

    @Autowired
    BlogRepository blogRepository;


    @GetMapping("/allblogs")
    public String getAllBlogs(Model model){

        List<Blog> blogs = blogRepository.findAll();

        model.addAttribute("blogs",blogs);

        return "blogs";
    }



    @GetMapping("/create")
    public String create( Model model){

        Blog blog = new Blog();

        model.addAttribute("blog",blog);

        return "create";
    }



    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog){

        blogRepository.save(blog);

        return "redirect:/allblogs";
    }
    

}
