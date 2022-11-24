package xiaobaiyun.mynotebook.pojo.entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 文章表(Article)实体类
 *
 * @author makejava
 * @since 2022-11-01 17:03:09
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Serializable {
    private static final long serialVersionUID = 942082027444990712L;
    
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 作者ID
     */
    private Long userId;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 所属类的id
     */
    private Integer classId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更改时间
     */
    private Date modifiedTime;
    /**
     * 是否公开
     */
    private Integer isPublic;
}

