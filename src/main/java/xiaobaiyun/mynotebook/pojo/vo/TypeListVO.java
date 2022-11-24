package xiaobaiyun.mynotebook.pojo.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class TypeListVO implements Serializable {

    private Long id;
    /**
     * 类名
     */
    private String typename;
}
