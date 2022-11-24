package xiaobaiyun.mynotebook.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginVO {

    private Long id;

    private String username;

    private String password;

    private String nickname;

    private Integer enable;
}
