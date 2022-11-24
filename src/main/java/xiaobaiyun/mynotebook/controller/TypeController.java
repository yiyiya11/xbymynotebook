package xiaobaiyun.mynotebook.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiaobaiyun.mynotebook.pojo.dto.TypeAddNewDTO;
import xiaobaiyun.mynotebook.pojo.vo.TypeListVO;
import xiaobaiyun.mynotebook.service.ITypeService;
import xiaobaiyun.mynotebook.web.JsonResult;

import java.util.List;

@Api(tags = "类别管理模块")
@RequestMapping("/Type")
@RestController
@Slf4j
public class TypeController {

    @Autowired
    ITypeService service;

    @PostMapping("/addNew")
    public JsonResult addNew(TypeAddNewDTO typeAddNewDTO){
        log.info("传过来的数据是:",typeAddNewDTO);
        service.addNewType(typeAddNewDTO);
        return JsonResult.ok("创建分类完成");
    }

    @GetMapping("/listByParendId")
    public JsonResult listByParendId(Long parentId,Long userId){
        List<TypeListVO> list = service.listByParendId(parentId,userId);
        log.info("集合中的数据{}",list);
        return JsonResult.ok(list);
    }

    @GetMapping("/rollback")
    public JsonResult<Long> rollback(Long id,Long userId){
        log.info("类别id{}，用户id{}",id,userId);
        Long parendId = service.rollbackUp(id, userId);
        log.info("父类别id{}",parendId);
        return JsonResult.ok(parendId);
    }
}