package xiaobaiyun.mynotebook.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiaobaiyun.mynotebook.pojo.dto.ArticleAddDTO;
import xiaobaiyun.mynotebook.pojo.vo.ArticleQueryVO;
import xiaobaiyun.mynotebook.service.IArticleService;
import xiaobaiyun.mynotebook.web.JsonResult;

import java.util.List;

@Api(tags = "文章管理模块")
@RequestMapping("/article")
@RestController
public class ArticleController {

    @Autowired
    IArticleService articleService;

    @PostMapping("/addNew")
    public JsonResult addNewArticle(ArticleAddDTO articleAddDTO){
        articleService.addNewArticle(articleAddDTO);
        return JsonResult.ok();
    }

    @GetMapping("/listArticle")
    public JsonResult listArticle(Long userId,Long classId){
        List list = articleService.listArticle(userId, classId);
        return JsonResult.ok(list);
    }

    @GetMapping("/queryArticle")
    public JsonResult queryArticle(Long id){
        ArticleQueryVO articleQueryVO = articleService.queryArticle(id);
        return JsonResult.ok(articleQueryVO);
    }
}
