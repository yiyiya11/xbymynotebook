package xiaobaiyun.mynotebook.pojo.vo;

import lombok.Data;

@Data
public class ArticleQueryVO {

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
}
