package pe.dsw.evaluacion.edu.evaluacion_t1_dsw.serviceGenerarArchivos;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class Pregunta3Service {

    private final FileService fileService;

    @Async
    public CompletableFuture<String> Asincrono() throws IOException{
        CompletableFuture<String> tarea1 = fileService.crearArchivo1();
        CompletableFuture<String> tarea2 = fileService.crearArchivo2();
        CompletableFuture<String> tarea3 = fileService.crearArchivo3();
        return CompletableFuture.allOf(tarea1, tarea2, tarea3)
                .thenApply(result ->{
                    try{
                        String valor1 = tarea1.join();
                        String valor2 = tarea2.join();
                        String valor3 = tarea3.join();
                        return "Resultado de tareas: "+
                                valor1+"  - "+
                                valor2+"  - "+
                                valor3;

                    }catch (Exception ex){
                        return "Error al combinar los datos "+ex.getMessage();
                    }
                })
                .exceptionally(ex-> "Error al ejecutar tareas " + ex.getMessage());
    }
}


