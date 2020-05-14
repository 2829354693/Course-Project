package com.yc.controller;

import com.yc.model.User;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(Model model, User user, String birthdayStr, MultipartFile head_pic) throws Exception{
        if (!userService.isUsernameExist(user.getName())){
            String originalFilename = head_pic.getOriginalFilename();
            String headPicName;
            if (originalFilename != null && originalFilename.length() > 0){
                String path = "D:\\Java\\mvntest_pic\\head_pic\\";
                headPicName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
                File headPic = new File(path,headPicName);
                head_pic.transferTo(headPic);
            } else {
                headPicName = "null";
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = sdf.parse(birthdayStr);

            User regUser = new User(user.getName(),user.getSex(),user.getPassword(),user.getHobby(),new Date(),
                    headPicName,birthday);
            userService.insertUser(regUser);
            model.addAttribute("user", regUser);
            return "reg_success";
        }else {
            model.addAttribute("msg","用户名已存在！");
            return "error";
        }
    }

    @GetMapping("/findAll")
    public String findAll(Model model) throws Exception{
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "success";
    }

    @GetMapping("/")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(HttpSession session, Model model, String username, String password) throws Exception{
        if (userService.isUsernameExist(username)){
            List<User> users = userService.getUserByName(username);
            if (users.get(0).getPassword().equals(password)){
                session.setAttribute("user",users.get(0));
                return "redirect:/user/findAll";
            }else {
                model.addAttribute("msg","密码错误！");
                return "error";
            }
        }else {
            model.addAttribute("msg","用户名不存在！");
            return "error";
        }
    }

    @GetMapping("/update")
    public String update(Model model, Integer id) throws Exception{
        model.addAttribute("user",userService.getUserById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(User user) throws Exception{
        userService.updateUser(user);
        return "redirect:/user/findAll";
    }

    @GetMapping("/delete")
    public String deleteUser(Integer id) throws Exception{
        userService.deleteUser(id);
        return "redirect:/user/findAll";
    }

}
