package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class carrinhoCompras {

  private List<Item> itemList;

  public carrinhoCompras() {
    this.itemList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    Item item = new Item(nome, preco, quantidade);
    this.itemList.add(item);
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    if (!itemList.isEmpty()) {
      for (Item i : itemList) {
        if (i.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(i);
        }
      }
      itemList.removeAll(itensParaRemover);
    } else {
      System.out.println("O carrinho de compras esta vazio");
    }
  }


  public void exibirItens() {
    if (!itemList.isEmpty()) {
      System.out.println(this.itemList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public double calcularTotalCarrinho() {
    double valorTotal = 0;
    double valorItem = 0;
    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("Carrinho de compras vazio");
    }
  }

  public String toString() {
    return "CarrinhoCompras{" +
      "itemList=" + itemList +
      '}';
  }


  public static void main(String[] args) {

    carrinhoCompras carrinhoCompras = new carrinhoCompras();

    carrinhoCompras.adicionarItem("Queijo", 13.5, 1);
    carrinhoCompras.adicionarItem("Leite", 8.5, 2);
    carrinhoCompras.exibirItens();


    System.out.println("O valor total da compra é = " + carrinhoCompras.calcularTotalCarrinho());
  }

}
