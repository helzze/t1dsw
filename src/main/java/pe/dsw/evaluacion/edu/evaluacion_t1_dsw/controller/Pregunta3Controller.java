package pe.dsw.evaluacion.edu.evaluacion_t1_dsw.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.dsw.evaluacion.edu.evaluacion_t1_dsw.serviceGenerarArchivos.Pregunta3Service;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
@RestController
public class Pregunta3Controller {
    private final Pregunta3Service pregunta3Service;

    @SneakyThrows
    @GetMapping("/pregunta-tres")
    public String Ejercicio()
            throws ExecutionException, InterruptedException {
        CompletableFuture<String> resultado =
               pregunta3Service.Asincrono();
        return resultado.get();
    }

}
