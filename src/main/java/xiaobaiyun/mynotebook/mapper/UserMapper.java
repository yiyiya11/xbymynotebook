package xiaobaiyun.mynotebook.mapper;

import org.springframework.stereotype.Repository;
import xiaobaiyun.mynotebook.pojo.vo.UserLoginVO;

@Repository
public interface UserMapper {

    /**
     * 根据用户名查询用户相关信息返回信息用来验证登录
     * @param username 登陆时前端传过来的用户名
     * @return 登陆时所需要校验的信息
     */
    UserLoginVO loginByUsername(String username);
}
