package com.mazuryk.spring.core.event;

import org.springframework.context.ApplicationEvent;

import java.util.Calendar;
import java.util.Date;

public class DateTimeEvent extends ApplicationEvent {
    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DateTimeEvent(Object source) {
        super(source);
        this.dateTime = Calendar.getInstance().getTime();
    }
}
