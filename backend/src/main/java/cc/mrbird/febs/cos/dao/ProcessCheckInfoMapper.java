package cc.mrbird.febs.cos.dao;

import cc.mrbird.febs.cos.entity.ProcessCheckInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;

/**
 * @author Fank gmail - fan1ke2ke@gmail.com
 */
public interface ProcessCheckInfoMapper extends BaseMapper<ProcessCheckInfo> {

    /**
     * 分页获取过程检验信息
     *
     * @param page             分页对象
     * @param processCheckInfo 过程检验信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectProcessPage(Page<ProcessCheckInfo> page, @Param("processCheckInfo") ProcessCheckInfo processCheckInfo);
}
