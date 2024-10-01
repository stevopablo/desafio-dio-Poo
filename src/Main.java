import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);


    Curso curso2 = new Curso();
    curso2.setTitulo("Curso jS");
    curso2.setDescricao("descricao curso jS");
    curso2.setCargaHoraria(4);


    System.out.println(curso1);
    System.out.println(curso2);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(mentoria);
    }
}
