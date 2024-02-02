package com.spring.studies.injectionandlombok;

import org.springframework.stereotype.Component;

@Component
public class FarewellService {
    private final Translator translator;

    public FarewellService(Translator translator){
        this.translator = translator;
    }

    public String produce(){
        return translator.translate("bye");
    }
}
