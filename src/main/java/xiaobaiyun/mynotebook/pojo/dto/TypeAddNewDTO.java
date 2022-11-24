package xiaobaiyun.mynotebook.pojo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TypeAddNewDTO implements Serializable {
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
}
