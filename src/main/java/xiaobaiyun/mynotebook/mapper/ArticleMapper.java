package xiaobaiyun.mynotebook.mapper;

import org.springframework.stereotype.Repository;
import xiaobaiyun.mynotebook.pojo.entity.Article;
import xiaobaiyun.mynotebook.pojo.vo.ArticleQueryVO;

import java.util.List;

@Repository
public interface ArticleMapper {

    /**
     * 新增文章
     * @param article
     * @return
     */
    int addNewArticle(Article article);

    List listArticle(Long userId,Long classId);

    ArticleQueryVO queryByArticleId(Long id);
}
