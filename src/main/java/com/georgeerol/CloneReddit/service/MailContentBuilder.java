package com.georgeerol.CloneReddit.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


/**
 * Created by George Fouche on 8/27/20.
 */
@Service
@AllArgsConstructor
public class MailContentBuilder {


    private final TemplateEngine templateEngine;

    public String build(String message) {
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }
}
