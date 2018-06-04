package org.scu.service.impl;

import org.scu.bean.ProvinceBean;
import org.scu.dao.ProvinceDao;
import org.scu.domain.Province;
import org.scu.service.ProvinceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xing on 2018/6/3.
 */
@Service
public class ProvinceServiceImpl implements ProvinceService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ProvinceDao provinceDao;

    @Override
    public List<Province> getProvinceList() {
        return provinceDao.getProvinceList();
    }

    @Override
    public Province queryProvinceById(String pid) {
        int id = Integer.parseInt(pid);
        return provinceDao.queryProvinceById(id);
    }

    @Override
    public ProvinceBean queryProvinceBeanById(String pid) {
        int id = Integer.parseInt(pid);
        ProvinceBean provinceBean = new ProvinceBean();
        Province province = provinceDao.queryProvinceById(id);
        provinceBean.setProvinceId(pid);
        provinceBean.setProvinceCode(province.getProvinceCode());
        provinceBean.setProvinceName(province.getProvinceName());
        return provinceBean;
    }

    @Override
    public List<ProvinceBean> getProvinceBeanList() {

        List<ProvinceBean> provinceBeans = new ArrayList<ProvinceBean>();
        List<Province> provinces = provinceDao.getProvinceList();
        ProvinceBean provinceBean = new ProvinceBean();
        for(Province province:provinces){
            provinceBean.setProvinceId(String.valueOf(province.getProvinceId()));
            provinceBean.setProvinceCode(province.getProvinceCode());
            provinceBean.setProvinceName(province.getProvinceName());
            provinceBeans.add(provinceBean);
        }
        return provinceBeans;
    }

}
