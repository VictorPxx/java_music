package br.com.javamusic.modelos;

public class MinhasPreferidas extends Audio{
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " está entre as mais ouvidas!");
        } else {
            System.out.println(audio.getTitulo() + " está melhorando muito as avaliações");
        }
    }
}
