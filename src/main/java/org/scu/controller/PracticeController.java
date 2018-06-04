package org.scu.controller;

import org.scu.bean.AreaBean;
import org.scu.bean.CityBean;
import org.scu.domain.Province;
import org.scu.service.AreaService;
import org.scu.service.CityService;
import org.scu.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by xing on 2018/6/2.
 */

@Controller
@RequestMapping("/prac")
public class PracticeController {

    @Resource
    private ProvinceService provinceService;

    @Resource
    private CityService cityService;

    @Resource
    private AreaService areaService;

    //ResponseBody注解可以把返回的数据封装成json
    @RequestMapping(value = "provincelist")
    @ResponseBody
    public List<Province> getProvinceList(){

        List<Province> provinces = provinceService.getProvinceList();
        return  provinces;
    }

    @RequestMapping(value = "province")
    @ResponseBody
    public Province getProvinceById(HttpServletRequest request){

        String pid = request.getParameter("pid");
        Province province = provinceService.queryProvinceById(pid);
        return  province;
    }

    @RequestMapping(value = "citylist")
    @ResponseBody
    public List<CityBean> getCityListByProvincecode(HttpServletRequest request){
        String provincecode = request.getParameter("provincecode");
        List<CityBean> cityBeans = cityService.getCityListByProvincecode(provincecode);
        return cityBeans;
    }

    @RequestMapping(value = "arealist")
    @ResponseBody
    public List<AreaBean> getAreaListByCitycode(HttpServletRequest request){
        String citycode = request.getParameter("citycode");
        List<AreaBean> areaBeans = areaService.getAreabeanListByCitycode(citycode);
        return areaBeans;
    }

}
