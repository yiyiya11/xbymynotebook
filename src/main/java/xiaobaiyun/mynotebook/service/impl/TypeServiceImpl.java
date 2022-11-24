package xiaobaiyun.mynotebook.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaobaiyun.mynotebook.ex.ServiceException;
import xiaobaiyun.mynotebook.mapper.TypeMapper;
import xiaobaiyun.mynotebook.pojo.dto.TypeAddNewDTO;
import xiaobaiyun.mynotebook.pojo.entity.Type;
import xiaobaiyun.mynotebook.pojo.vo.TypeListVO;
import xiaobaiyun.mynotebook.service.ITypeService;
import xiaobaiyun.mynotebook.web.ServiceCode;

import java.util.List;

@Slf4j
@Service
public class TypeServiceImpl implements ITypeService {


    @Autowired
    TypeMapper mapper;

    /**
     * 创建分类
     * @param typeAddNewDTO
     */
    @Override
    public void addNewType(TypeAddNewDTO typeAddNewDTO) {
        Type type=new Type();
        BeanUtils.copyProperties(typeAddNewDTO,type);
        int i = mapper.addNew(type);
        if (i!=1){
            throw new ServiceException(ServiceCode.ERR_INSERT,"新建类别失败");
        }
    }

    @Override
    public List<TypeListVO> listByParendId(Long parendId,Long userId) {
        List<TypeListVO> list = mapper.listByParendId(parendId,userId);
        return list;
    }

    @Override
    public Long rollbackUp(Long id, Long userId) {
        Long parendId = mapper.typeQueryByIdAndUserId(id, userId);
        log.info("父类id为{}",parendId);
        if (parendId==null){
            throw new ServiceException(ServiceCode.ERR_NOT_FOUND,"您现在已经在首页了");
        }
        return parendId;
    }
}
