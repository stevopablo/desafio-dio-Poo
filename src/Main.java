import br.com.dio.desafio.dominio.*;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);


    Curso curso2 = new Curso();
    curso2.setTitulo("Curso jS");
    curso2.setDescricao("descricao curso jS");
    curso2.setCargaHoraria(4);



    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

//    System.out.println(curso1);
//    System.out.println(curso2);
//    System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devPablo = new Dev();
        System.out.println("Pablo");
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devPablo.getConteudosInscritos());
        devPablo.progredir();
        devPablo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: "+ devPablo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: "+ devPablo.getConteudosConcluidos());
        System.out.println("XP: "+ devPablo.calcularTotalXp());
        System.out.println("============");


        Dev devCamila = new Dev();
        System.out.println("Camila");
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+ devCamila.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos inscritos: "+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos concluidos: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());



    }
}
