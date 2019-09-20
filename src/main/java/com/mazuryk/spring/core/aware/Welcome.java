package com.mazuryk.spring.core.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

public class Welcome implements MessageSourceAware {
    public void setMessageSource(MessageSource messageSource) {
        System.out.println(messageSource.getMessage("welcome", null, Locale.FRANCE));
        System.out.println(messageSource.getMessage("welcome", null, new Locale("ru", "RU")));
        System.out.println(messageSource.getMessage("welcome", null, new Locale("ua", "UA")));
    }
}
