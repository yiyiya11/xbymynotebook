package xiaobaiyun.mynotebook.pojo.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleListVO implements Serializable {

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
     * 所属类的id
     */
    private Integer classId;
}
