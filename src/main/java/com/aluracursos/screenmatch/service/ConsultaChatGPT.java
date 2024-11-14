package com.aluracursos.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obtenerTraduccion(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}