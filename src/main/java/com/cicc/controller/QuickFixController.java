package com.cicc.controller;

import com.cicc.entity.QuickFixOrder;
import com.cicc.entity.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuickFixController {

    @RequestMapping("/send")
    public int sendMessage(@RequestBody QuickFixOrder quickFixOrder){
        return 0;
    }

    @RequestMapping("/get")
    public Response getReceiveMessage(){
        QuickFixOrder quickFixOrder=new QuickFixOrder();
        quickFixOrder.setName("杯子");
        quickFixOrder.setAddress("北京市朝阳区");
        quickFixOrder.setDate("20220212000000");
        List<QuickFixOrder> quickFixOrderList=new ArrayList<>();
        quickFixOrderList.add(quickFixOrder);
        Response response=new Response();
        response.setCode(0);
        response.setMessage("success");
        response.setData(quickFixOrderList);
        return response;
    }
}
