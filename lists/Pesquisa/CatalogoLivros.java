package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!livroList.isEmpty()) {
      for(Livro l : livroList) {
        if(l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    } else {
      throw new RuntimeException("O catalogo de livros esta vazio");
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if(!livroList.isEmpty()) {
      for(Livro l : livroList) {
        if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
    } else {
      throw new RuntimeException("O catalogo de livros esta vazio");
    }
    return livrosPorIntervaloAnos;
  }

  public List<Livro> pesquisarPorTitulo(String titulo) {
    List<Livro> livrosPorTitulo = new ArrayList<>();
    if(!livroList.isEmpty()) {
      for(Livro l : livroList) {
        if(l.getTitulo().equalsIgnoreCase(titulo)) {
          livrosPorTitulo.add(l);
        }
      }
    } else {
      throw new RuntimeException("O catalogo de livros esta vazio");
    }
    return livrosPorTitulo;
  }


  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Livro 1", "Julio Vernes", 2020);
    catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
    catalogoLivros.adicionarLivro("Livro 3", "Julio Vernes", 2024);

    // List<Livro> livrosPorAutor = catalogoLivros.pesquisarPorAutor("Julio Vernes");
    // System.out.println(livrosPorAutor);

    // List<Livro> livrosPorIntervaloAnos = catalogoLivros.pesquisaPorIntervaloAnos(2020, 2021);
    // System.out.println(livrosPorIntervaloAnos);

    List<Livro> livrosPorTitulo = catalogoLivros.pesquisarPorTitulo("Livro 1");
    System.out.println(livrosPorTitulo);
  }
}
