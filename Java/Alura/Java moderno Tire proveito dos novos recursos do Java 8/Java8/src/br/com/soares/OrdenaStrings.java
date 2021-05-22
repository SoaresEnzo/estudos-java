package br.com.soares;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("Casa do código");
        palavras.add("Caelum");

        //Collections.sort(palavras, new ComparadorPorTamanho());
        palavras.sort(new ComparadorPorTamanho());
        System.out.println(palavras);

//        for (String p: palavras) {
//            System.out.println(p);
//        }

        palavras.forEach(new ImprimeNaLinha());
    }
}

class ImprimeNaLinha implements Consumer {

    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}