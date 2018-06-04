package org.scu.dao;

import org.apache.ibatis.annotations.Param;
import org.scu.domain.Province;

import java.util.List;

/**
 * Created by xing on 2018/6/3.
 */
public interface ProvinceDao {
    public List<Province> getProvinceList();

    public Province queryProvinceById(@Param("pid") int pid);
}
