package xiaobaiyun.mynotebook.mapper;

import org.springframework.stereotype.Repository;
import xiaobaiyun.mynotebook.pojo.dto.TypeAddNewDTO;
import xiaobaiyun.mynotebook.pojo.entity.Type;
import xiaobaiyun.mynotebook.pojo.vo.TypeListVO;

import java.util.List;

@Repository
public interface TypeMapper {

    /**
     * 新建分类
     * @param type
     * @return
     */
    int addNew(Type type);

    List<TypeListVO> listByParendId(Long parendId,Long userId);

    /**
     * 根据id查询父类id
     * @param id
     * @return
     */
    Long typeQueryByIdAndUserId(Long id,Long userId);

}
