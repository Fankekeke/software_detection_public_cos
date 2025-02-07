package cc.mrbird.febs.cos.dao;

import cc.mrbird.febs.cos.entity.FlawInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;

/**
 * @author Fank gmail - fan1ke2ke@gmail.com
 */
public interface FlawInfoMapper extends BaseMapper<FlawInfo> {

    /**
     * 分页获取常见缺陷信息
     *
     * @param page     分页对象
     * @param flawInfo 常见缺陷信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectFlawPage(Page<FlawInfo> page, @Param("flawInfo") FlawInfo flawInfo);
}
