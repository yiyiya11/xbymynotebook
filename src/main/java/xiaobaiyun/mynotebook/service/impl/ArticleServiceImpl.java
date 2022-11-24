package xiaobaiyun.mynotebook.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaobaiyun.mynotebook.ex.ServiceException;
import xiaobaiyun.mynotebook.mapper.ArticleMapper;
import xiaobaiyun.mynotebook.pojo.dto.ArticleAddDTO;
import xiaobaiyun.mynotebook.pojo.entity.Article;
import xiaobaiyun.mynotebook.pojo.vo.ArticleQueryVO;
import xiaobaiyun.mynotebook.service.IArticleService;
import xiaobaiyun.mynotebook.web.ServiceCode;

import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public void addNewArticle(ArticleAddDTO articleAddDTO) {
        Article article=new Article();
        BeanUtils.copyProperties(articleAddDTO,article);
        int i = articleMapper.addNewArticle(article);
        if (i!=1){
           throw new ServiceException(ServiceCode.ERR_INSERT,"插入文章失败");
        }
    }

    @Override
    public List listArticle(Long userId, Long classId) {
        List list = articleMapper.listArticle(userId, classId);
        return list;
    }

    @Override
    public ArticleQueryVO queryArticle(Long id) {
        ArticleQueryVO articleQueryVO = articleMapper.queryByArticleId(id);
        return articleQueryVO;
    }
}
