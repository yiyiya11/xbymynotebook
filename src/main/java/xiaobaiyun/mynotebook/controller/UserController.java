package xiaobaiyun.mynotebook.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiaobaiyun.mynotebook.pojo.dto.UserLoginDTO;
import xiaobaiyun.mynotebook.service.IUserService;
import xiaobaiyun.mynotebook.web.JsonResult;

@Slf4j
@Api(tags = "01.用户管理模块")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService service;

    @PostMapping("/login")
    public JsonResult login(UserLoginDTO userLoginDTO){
        log.debug("开始处理登录业务,controller，请求参数{}",userLoginDTO);
        String jwt=service.login(userLoginDTO);
        return JsonResult.ok(jwt);
    }
}
