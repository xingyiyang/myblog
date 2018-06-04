package org.scu.dao;

import org.apache.ibatis.annotations.Param;
import org.scu.domain.City;

import java.util.List;

/**
 * Created by xing on 2018/6/4.
 */
public interface CityDao {
    public List<City> getCityListByProvincecode(@Param("provincecode") String provincecode);
}
