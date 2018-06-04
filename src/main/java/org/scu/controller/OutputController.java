package org.scu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xing on 2018/6/3.
 */
@Controller
@RequestMapping("/output")
public class OutputController {

    @RequestMapping(value = "province",method = RequestMethod.POST)
    public void getProvince(HttpServletRequest request, HttpServletResponse response){

        String province = request.getParameter("province");
        String city = request.getParameter("city");
        String area = request.getParameter("area");

        System.out.println(province+"-->"+city+"-->"+area);
    }
}
