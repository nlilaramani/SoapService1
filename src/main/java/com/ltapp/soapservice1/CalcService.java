/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltapp.soapservice1;
import com.example.calc_web_service.AddRequest;
import com.example.calc_web_service.AddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author itexps
 */
@Endpoint
public class CalcService {
    private static final String NAMESPACE_URI = "http://example.com/calc-web-service";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addRequest")
    @ResponsePayload
    public AddResponse add(@RequestPayload AddRequest request) {
        AddResponse result=new AddResponse();
        result.setResult(request.getA()+request.getB());
        return result;
    }
}
