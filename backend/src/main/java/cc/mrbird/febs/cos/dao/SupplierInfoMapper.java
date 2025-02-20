package cc.mrbird.febs.cos.dao;

import cc.mrbird.febs.cos.entity.SupplierInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;

/**
 * @author Fank gmail - fan1ke2ke@gmail.com
 */
public interface SupplierInfoMapper extends BaseMapper<SupplierInfo> {

    /**
     * 分页获取测试企业信息
     *
     * @param page         分页对象
     * @param supplierInfo 测试企业信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectSupplierPage(Page<SupplierInfo> page, @Param("supplierInfo") SupplierInfo supplierInfo);
}
