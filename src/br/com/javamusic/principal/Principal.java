package br.com.javamusic.principal;

import br.com.javamusic.modelos.MinhasPreferidas;
import br.com.javamusic.modelos.Musica;
import br.com.javamusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Podcast flau = new Podcast();
        flau.setTitulo("Flau Podcast");
        flau.setApresentador("Vitu 6k");
        flau.setDescricao("Podcast com convidados de diferentes meios");

        for (int i = 0; i < 1205; i++) {
            flau.curte();
        }

        for (int i = 0; i < 1000; i++) {
            flau.reproduz();
        }

        Musica cepNovo = new Musica();
        cepNovo.setTitulo("Cep Novo");
        cepNovo.setArtista("Gusttavo Tangerina");
        cepNovo.setAlbum("Paraíso privado");
        cepNovo.setGenero("Sertanejo");

        for (int i = 0; i < 2000; i++) {
            cepNovo.curte();
        }

        for (int i = 0; i < 5000; i++) {
            cepNovo.reproduz();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(flau);
        preferidas.inclui(cepNovo);
    }
}
