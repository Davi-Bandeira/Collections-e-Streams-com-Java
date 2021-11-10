package one.digitalinnovation.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie( "got", "fantasia", 60));
            add(new Serie( "dark", "drama", 60));
            add(new Serie( "that '70s show", "comédia", 60));
        }};

        System.out.println("--\tOrdem Aleatória\t---");
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("--\tOrdem de Inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie( "got", "fantasia", 60));
            add(new Serie( "dark", "drama", 60));
            add(new Serie( "that '70s show", "comédia", 60));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                                                           + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("--\tOrdem Natural (tempoEpisodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                                                            + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                                                            + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
               "nome='" + nome + '\'' +
               ", genero='" + genero + '\'' +
               ", tempoEpisodio=" + tempoEpisodio +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.genero.compareTo(serie.genero);
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }
}