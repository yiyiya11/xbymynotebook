package xiaobaiyun.mynotebook.pojo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleAddDTO implements Serializable {

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
     * 是否公开
     */
    private Integer isPublic;
}
