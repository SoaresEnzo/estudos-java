package java8.datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exerc1 {

    public static void main(String[] args) {
        // Exercícios-------------------------
//		Crie uma nova classe com um método main para escrever seus exercícios com datas.
//
//		Nessa classe imprima a data atual utilizando a classe LocalDate.
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        LocalDate futuro = LocalDate.of(2099,01,25);
        System.out.println(futuro);

        Period periodo = Period.between(agora,futuro);
        System.out.println(periodo);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(agora.format(formatador));

    }
}