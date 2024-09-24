package pe.dsw.evaluacion.edu.evaluacion_t1_dsw.serviceGenerarArchivos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class FileService {

    private static final String FILE_PATH_1 = "infoXD.txt";
    private static final String FILE_PATH_2 = "infoXD2.txt";
    private static final String FILE_PATH_3 = "infoXD3.txt";

    //archivo 1 - 10 segundos de demora
    public CompletableFuture<String> crearArchivo1() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH_1);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            dataOutputStream.writeUTF("Archivo 1, creado con 10 segundos de delay");
            dataOutputStream.writeInt(2024);

            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.completedFuture("Archivo 1 creado exitosamente tras 10seg ");
    }

    //archivo 2 - 5 segundos de demora
    public CompletableFuture<String> crearArchivo2() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH_2);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            dataOutputStream.writeUTF("Archivo 2, creado con 5 segundos de delay");
            dataOutputStream.writeInt(2024);

            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.completedFuture("Archivo 2 creado exitosamente tras 5seg");
    }

    //archivo 3 - 7 segundos de demora
    public CompletableFuture<String> crearArchivo3() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH_3);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            dataOutputStream.writeUTF("Archivo 3, creado con 7 segundos de delay");
            dataOutputStream.writeInt(2024);

            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.completedFuture("Archivo 3 creado exitosamente tras 7 seg");
    }
}
