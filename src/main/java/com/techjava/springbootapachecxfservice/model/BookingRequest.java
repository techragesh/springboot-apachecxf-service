package com.techjava.springbootapachecxfservice.model;


import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BookingRequest {

    @XmlAttribute(required = true)
    private String bookingId;
    @XmlElement(required = true, nillable = false)
    private String bookingName;
    @XmlElement(required = true, nillable = false)
    private String bookingDesc;
    @XmlElement(required = true, nillable = false)
    private String bsnNr;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public String getBookingDesc() {
        return bookingDesc;
    }

    public void setBookingDesc(String bookingDesc) {
        this.bookingDesc = bookingDesc;
    }

    public String getBsnNr() {
        return bsnNr;
    }

    public void setBsnNr(String bsnNr) {
        this.bsnNr = bsnNr;
    }
}
