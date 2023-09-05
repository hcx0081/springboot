package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * {@code @description:}
 */
@Controller
public class IndexController {
    
    /**
     * 跳转到登录页面
     *
     * @return
     */
    // 只接收映射为“/”和“/login”的GET请求，这两个映射方法都可以访问到登录页
    @GetMapping({"/", "/loginPage"})
    public String loginPage() {
        return "login";
    }
    
    /**
     * 进行登录
     *
     * @param user
     * @param session
     * @param model
     * @return
     */
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        if ((user.getUsername().length() > 0 && !(user.getUsername().contains(" ")))
                &&
                (user.getPassword().length() > 0 && !(user.getPassword().contains(" ")))) {
            session.setAttribute("user", user);
            System.out.println(user);
            // 登录成功重定向到main.html，为了解决表单重复提交；如果是请求转发则地址栏不变，再次刷新则表单重复提交
            return "redirect:/mainPage";
        }
        model.addAttribute("msg", "账号或密码错误");
        // 跳转到登录页面
        return "login";
        
        
    }
    
    /**
     * 跳转至主页面
     *
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/mainPage")
    public String mainPage(HttpSession session, Model model) throws CustomException {
        
        /*判断是否登录，最好使用拦截器或者过滤器，这里编写一个简易版*/
        /*Object user = session.getAttribute("user");
        if (user != null) {
            //如果session域中user为main，则跳转至main.html
            return "main";
        }
        model.addAttribute("msg", "请重新登录");
        //如果session域中user为null，则跳转至login.html
        return "login";*/
        return "main";
    }
}