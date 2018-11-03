package com.lanshiqin.core.controller;

import com.lanshiqin.core.entity.UserInfoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 示例控制器
 * @author 蓝士钦
 */
@Controller
public class HelloController {

    /**
     * 输出示例页面
     * @param modelAndView 模型视图对象
     * @return 模型视图 配置的 /模板前缀/+ hello +.模板后缀名
     */
    @GetMapping("/hello")
    public ModelAndView hello(ModelAndView modelAndView){
        modelAndView.addObject("name","蓝士钦");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    /**
     * 输出示例数据
     * @return 返回用户信息 配置的消息转换Json格式
     */
    @GetMapping("/info")
    @ResponseBody
    public UserInfoEntity userInfo(){
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId(1);
        userInfoEntity.setUserName("蓝士钦");
        userInfoEntity.setPassWord("123");
        return userInfoEntity;
    }
}
