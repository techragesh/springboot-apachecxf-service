package com.techjava.springbootapachecxfservice.service.impl;

import com.techjava.springbootapachecxfservice.model.BookingRequest;
import com.techjava.springbootapachecxfservice.model.BookingResponse;
import com.techjava.springbootapachecxfservice.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;

@WebService
public class BookingServiceImpl implements BookingService{

    private static final Logger log = LoggerFactory.getLogger(BookingServiceImpl.class);

    @Override
    public BookingResponse createBookRequest(BookingRequest bookingRequest) {
        log.info("BookingRequest Details--->" +bookingRequest.getBookingName());
        BookingResponse bookingResponse = new BookingResponse();
        bookingResponse.setStatus("200");
        bookingResponse.setMessage("SUCCESS");
        return bookingResponse;
    }
}
