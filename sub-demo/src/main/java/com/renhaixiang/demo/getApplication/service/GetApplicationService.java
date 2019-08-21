package com.renhaixiang.demo.getApplication.service;

import com.renhaixiang.demo.common.response.ResponseBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * description: get application from application.yml
 *
 * @author renhaixiang
 * @version 1.0
 * @date 2019/8/21 10:08
 **/
@Service
public class GetApplicationService {
     @Value("${get-application.name:default}")
     private String name;
     @Value("${get-application.mobile:default}")
     private String mobile;

     public ResponseBean applicationToString(){
          ResponseBean responseBean = new ResponseBean();
          String result = "name:"+ name+ "\n mobile: " + mobile;
          responseBean.setCode("0");
          responseBean.setMessage("success");
          responseBean.setResult(result);
         return responseBean;
     }
}
