package com.renhaixiang.demo.getApplication.controller;

import com.renhaixiang.demo.common.response.ResponseBean;
import com.renhaixiang.demo.getApplication.service.GetApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: get application from application.yml
 *
 * @author renhaixiang
 * @version 1.0
 * @date 2019/8/21 10:08
 **/
@RestController
@RequestMapping("/application")
public class GetApplicationController {

    private final GetApplicationService getApplicationService;

    @Autowired
    public GetApplicationController(GetApplicationService getApplicationService){
        this.getApplicationService = getApplicationService;
    }

    @GetMapping
    public ResponseBean getApplication() {
        return getApplicationService.applicationToString();
    }
}
