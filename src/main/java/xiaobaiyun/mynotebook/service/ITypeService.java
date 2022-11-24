package xiaobaiyun.mynotebook.service;

import xiaobaiyun.mynotebook.pojo.dto.TypeAddNewDTO;
import xiaobaiyun.mynotebook.pojo.vo.TypeListVO;

import java.util.List;

public interface ITypeService {

    /**
     * 添加新分类
     * @param typeAddNewDTO
     */
    void addNewType(TypeAddNewDTO typeAddNewDTO);

    /**
     * 根据父类id查询其中的子类
     * @param
     * @return
     */
    List<TypeListVO> listByParendId(Long parendId,Long userId);

    /**
     * 返回上一级业务
     * @param id
     * @param userId
     * @return
     */
    Long rollbackUp(Long id,Long userId);
}
