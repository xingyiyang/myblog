package org.scu.service.impl;

import org.scu.bean.AreaBean;
import org.scu.dao.AreaDao;
import org.scu.domain.Area;
import org.scu.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xing on 2018/6/4.
 */
@Service
public class AreaServiceImpl implements AreaService{

    @Resource
    private AreaDao areaDao;

    @Override
    public List<AreaBean> getAreabeanListByCitycode(String citycode) {
        List<AreaBean> areaBeans = new ArrayList<>();
        List<Area> areas = areaDao.getAreaListByCitycode(citycode);
        for (Area area : areas){
            AreaBean areaBean = new AreaBean();
            areaBean.setAreaId(String.valueOf(area.getAreaId()));
            areaBean.setAreaCode(area.getAreaCode());
            areaBean.setAreaName(area.getAreaName());
            areaBean.setCitycode(area.getCitycode());
            areaBeans.add(areaBean);
        }
        return areaBeans;
    }
}
