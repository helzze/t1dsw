package pe.dsw.evaluacion.edu.evaluacion_t1_dsw;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.dsw.evaluacion.edu.evaluacion_t1_dsw.serviceGenerarArchivos.FileService;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class EvaluacionT1DswApplication implements CommandLineRunner {

	private final FileService fileService;

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionT1DswApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Ejecutando Examen");
		fileService.crearArchivo1();
		log.info("Creando archivo 1, delay de 10 segundos");
		fileService.crearArchivo2();
		log.info("Creando archivo 2, delay de 5 segundos");
		fileService.crearArchivo3();
		log.info("Creando archivo 3, delay de 7 segundos");
		log.info("Ejercicio terminado");
	}
}
