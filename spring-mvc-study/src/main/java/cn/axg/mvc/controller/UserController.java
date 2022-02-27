package cn.axg.mvc.controller;

import cn.axg.mvc.api.Asserts;
import cn.axg.mvc.api.CommonResult;
import cn.axg.mvc.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/index")
    public String index() {
        int i = 10 / 0;
        return "index";
    }


    @RequestMapping("/add")
    public String add(@RequestParam(name = "username", required = true, defaultValue = "jack") String username) {
        return "add";
    }

    @RequestMapping("/delete/{username}/{password}")
    public void delete(@PathVariable("username") String username, @PathVariable("password") String password) {
        System.out.println("==============请求delete方法成功==============");
    }

    /**
     * 获取cookie
     * 获取请求头中的数据
     *
     * @param jsid
     */
    @RequestMapping("/cookie")
    public void getCookie(@CookieValue("JSESSIONID") String jsid, @RequestHeader("Cookie") String header) {
        System.out.println("===============" + jsid);
        System.out.println("---------------" + header);
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setId("1");
        user.setUsername("jack");
        user.setPassword("123");
        user.setBirthday(new Date());
        return user;
    }

    @RequestMapping("/test")
    public CommonResult testException(@RequestParam String username) {
        if (StringUtils.isEmpty(username)) {
            Asserts.fail("用户名不能为空");
        }
        return null;
    }

    @RequestMapping(name = "/upload",method = RequestMethod.POST)
    public CommonResult upload(@RequestParam(name = "file") MultipartFile file,String fileName) throws IOException {
        log.info("fileName名称：{}",fileName);
        log.info("文件名称：{}",file.getName());
        log.info("文件类型：{}",file.getContentType());
        log.info("文件大小：{}",file.getSize());
        log.info("getOriginalFilename：{}",file.getOriginalFilename());

        //存储文件到本地磁盘中
        file.transferTo(new File("D:\\image\\"+file.getOriginalFilename()));

        return CommonResult.success(null);

    }

    @PostMapping("/valid")
    public String testValid(@RequestBody @Validated User user){
        log.info("成功进入handler：[{}]","testValid");
        return "success";
    }


}
