package xiaobaiyun.mynotebook.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperText {

    @Autowired
    UserMapper mapper;

    @Test
    void testGetLoginInfoByUsername() {
        String username = "zhang";
        Object result = mapper.loginByUsername(username);
        System.out.println("根据username=" + username + "查询登录信息完成，结果=" + result);
    }

}
