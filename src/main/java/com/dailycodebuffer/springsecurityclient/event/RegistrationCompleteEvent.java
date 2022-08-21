package com.dailycodebuffer.springsecurityclient.event;

import com.dailycodebuffer.springsecurityclient.entity.User;
import org.springframework.context.ApplicationEvent;

public class RegistrationCompleteEvent extends ApplicationEvent {

    private User user;
    private String applicaitonUrl;

    public RegistrationCompleteEvent(User source,String applicationUrl) {
        super(source);
        this.user=user;
        this.applicaitonUrl=applicationUrl;
    }
}
