package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Numero> numeros;

  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumeros(int numero) {
    this.numeros.add(new Numero(numero));
  }

  public int calcularSoma() {
    int soma = 0;
    for(Numero n : this.numeros) {
      soma += n.getNumero();
    }
    return soma;
  }

  public int encontrarMaiorNumero(){
    int maiorNumero = Integer.MIN_VALUE;
    if(!numeros.isEmpty()) {
      for(Numero numero : numeros) {
        if(numero.getNumero() >= maiorNumero) {
          maiorNumero = numero.getNumero();
        }
      }
      return maiorNumero;
    } else {
      throw new RuntimeException("A lista de numeros esta vazia");
    }
  }

  public int encontrarMenorNumero(){
    int menorNumero = Integer.MAX_VALUE;
    if(!numeros.isEmpty()) {
      for(Numero numero : numeros) {
        if(numero.getNumero() <= menorNumero) {
          menorNumero = numero.getNumero();
        }
      }
      return menorNumero;
    } else {
      throw new RuntimeException("A lista de numeros esta vazia");
    }
  }

  public List<Numero> exibirNumeros() {
    return this.numeros;
  }
  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();
    somaNumeros.adicionarNumeros(1);
    somaNumeros.adicionarNumeros(2);
    somaNumeros.adicionarNumeros(3);
    System.out.println(somaNumeros.calcularSoma());
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());

    System.out.println(somaNumeros.exibirNumeros());
  }
}
