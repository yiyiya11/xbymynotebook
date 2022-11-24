package xiaobaiyun.mynotebook.service;

import xiaobaiyun.mynotebook.ex.ServiceException;
import xiaobaiyun.mynotebook.pojo.dto.ArticleAddDTO;
import xiaobaiyun.mynotebook.pojo.vo.ArticleQueryVO;

import java.util.List;

public interface IArticleService {

    /**
     * 发布文章
     * @param articleAddDTO
     * @return
     */
    void addNewArticle(ArticleAddDTO articleAddDTO);

    List listArticle(Long userId,Long classId);

    ArticleQueryVO queryArticle(Long id);
}
