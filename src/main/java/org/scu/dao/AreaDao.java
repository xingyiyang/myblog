package org.scu.dao;

import org.apache.ibatis.annotations.Param;
import org.scu.domain.Area;

import java.util.List;

/**
 * Created by xing on 2018/6/4.
 */
public interface AreaDao {

    public List<Area> getAreaListByCitycode(@Param("citycode") String citycode);
}
