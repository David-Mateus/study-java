package com.company.Randomcode;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OderStatus status;

    public Order(Integer id, Date moment, OderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OderStatus getStatus() {
        return status;
    }

    public void setStatus(OderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
