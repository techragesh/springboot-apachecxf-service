package com.techjava.springbootapachecxfservice.service;

import com.techjava.springbootapachecxfservice.model.BookingRequest;
import com.techjava.springbootapachecxfservice.model.BookingResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public interface BookingService {

    @WebMethod
    @WebResult(name = "bookingResponse")
    public @XmlElement(required = true, nillable = false) BookingResponse createBookRequest(
            @XmlElement(required = true, nillable = false)
            @WebParam(name = "bookingRequest")
            BookingRequest bookingRequest);

}
