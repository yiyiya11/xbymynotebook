package xiaobaiyun.mynotebook.pojo.entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * (Type)实体类
 *
 * @author makejava
 * @since 2022-10-29 15:57:15
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type implements Serializable {
    private static final long serialVersionUID = -98032041705425466L;
    
    private Long id;

    /**
     * 所属用户的id
     */
    private Long userId;
    /**
     * 类名
     */
    private String typename;
    /**
     * 父类id
     */
    private Integer parendId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifiedTime;
    

}

