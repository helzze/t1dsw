package pe.dsw.evaluacion.edu.evaluacion_t1_dsw;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import pe.dsw.evaluacion.edu.evaluacion_t1_dsw.serviceGenerarArchivos.FileService;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication

public class EvaluacionT1DswApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionT1DswApplication.class, args);
	}


}
