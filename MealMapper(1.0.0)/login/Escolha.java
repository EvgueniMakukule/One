public class Escolha {
private int id_escolha;
private String tipo_refeicao;
private String tipo_comida;
private double preco;
private int avaliacao_media;


public Escolha(int id_escolha, String tipo_refeicao, String tipo_comida, double preco, int avaliacao_media) {
    this.id_escolha = id_escolha;
    this.tipo_refeicao = tipo_refeicao;
    this.preco = preco;
    this.avaliacao_media = avaliacao_media;
}


public int getId_escolha() {
    return id_escolha;
}


public void setId_escolha(int id_escolha) {
    this.id_escolha = id_escolha;
}


public String getTipo_refeicao() {
    return tipo_refeicao;
}


public void setTipo_refeicao(String tipo_refeicao) {
    this.tipo_refeicao = tipo_refeicao;
}


public String getTipo_comida() {
    return tipo_comida;
}


public void setTipo_comida(String tipo_comida) {
    this.tipo_comida = tipo_comida;
}


public double getPreco() {
    return preco;
}


public void setPreco(double preco) {
    this.preco = preco;
}


public int getAvaliacao_media() {
    return avaliacao_media;
}


public void setAvaliacao_media(int avaliacao_media) {
    this.avaliacao_media = avaliacao_media;
}



}
