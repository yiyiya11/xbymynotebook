package xiaobaiyun.mynotebook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xiaobaiyun.mynotebook.mapper.UserMapper;

@SpringBootTest
class MonotebookApplicationTests {

    @Autowired
    UserMapper mapper;

    @Test
    void contextLoads() {
        System.out.println(mapper.loginByUsername("zhang"));
    }

}
