package org.scu.service;

import org.scu.bean.AreaBean;

import java.util.List;

/**
 * Created by xing on 2018/6/4.
 */
public interface AreaService {
    public List<AreaBean> getAreabeanListByCitycode(String citycode);
}
