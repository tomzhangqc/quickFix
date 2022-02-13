package com.cicc.controller;

import com.cicc.entity.QuickFixOrder;
import com.cicc.entity.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuickFixController {

    Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/send")
    public int sendMessage(@RequestBody QuickFixOrder quickFixOrder){
        log.info(quickFixOrder.toString());
        return 0;
    }

    @RequestMapping("/get")
    public Response getReceiveMessage(){
        List<QuickFixOrder> quickFixOrderList=new ArrayList<>();
        for(int i=0;i<100;i++){
            QuickFixOrder quickFixOrder=new QuickFixOrder();
            quickFixOrder.setName("杯子");
            quickFixOrder.setAddress("北京市朝阳区");
            quickFixOrder.setDate("20220212000000");
            quickFixOrderList.add(quickFixOrder);
        }
        Response response=new Response();
        response.setCode(0);
        response.setMessage("success");
        response.setData(quickFixOrderList);
        return response;
    }
}
