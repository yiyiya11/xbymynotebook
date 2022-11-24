package xiaobaiyun.mynotebook.service;

import xiaobaiyun.mynotebook.pojo.dto.UserLoginDTO;

public interface IUserService {

    String login(UserLoginDTO userLoginDTO);
}
