package xiaobaiyun.mynotebook.pojo.entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-10-29 15:56:41
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 501270550542253940L;
    
    private Long id;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 用户名
     */
    private String username;
    /**
     * 是否封号
     */
    private Integer enable;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date modifiedTime;
}

