package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * {@code @description:}
 */
@Controller
public class FormController {
    @GetMapping("/form_layouts")
    public String form_layouts() {
        return "form/form_layouts";
    }
    
    /**
     * 单文件上传
     *
     * @param multipartFile
     * @return
     */
    @PostMapping("/uploadS")
    // 上传的文件被封装到MultipartFile接口类型的参数multipartFile中，注意上传表单项的参数名要和形参对应
    public String uploadS(@RequestParam("upload") MultipartFile multipartFile) throws IOException {
        // 获取文件原始名称
        String originalFilename = multipartFile.getOriginalFilename();
        // 将文件保存到磁盘下
        multipartFile.transferTo(new File("E:\\" + originalFilename));
        System.out.println("上传成功");
        return "redirect:/mainPage";
    }
    
    /**
     * 多文件上传
     *
     * @param multipartFile
     * @throws IOException
     */
    @PostMapping("/uploadM")
    public String uploadM(@RequestParam("upload") /*MultipartFile[] multipartFile*/ List<MultipartFile> multipartFile) throws IOException {
        // System.out.println(Arrays.toString(multipartFile));
        System.out.println(multipartFile);
        for (MultipartFile file : multipartFile) {
            // 获取文件原始名称
            String originalFilename = file.getOriginalFilename();
            // 将文件保存到磁盘下
            file.transferTo(new File("E:\\" + originalFilename));
            System.out.println("上传成功");
        }
        return "redirect:/mainPage";
    }
}