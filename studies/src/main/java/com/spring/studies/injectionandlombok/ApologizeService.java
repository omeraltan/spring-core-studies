package com.spring.studies.injectionandlombok;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApologizeService {
    private final Translator translator;
    private final String message;

    @Autowired
    public ApologizeService(Translator translator) {
        this(translator, "sorry");
    }

    public String produce(){
        return translator.translate(message);
    }
}
