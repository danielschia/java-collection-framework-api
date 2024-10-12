package OperacoesBasicas;
public class Tarefa {
  //atributo
  private String descricao;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return this.descricao;
  }


  public String toString() {
    return "Tarefa{" +
      " descricao='" + getDescricao() + "'" +
      "}";
  }

}
