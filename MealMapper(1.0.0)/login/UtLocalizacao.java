//Sunday.eam
public class UtLocalizacao {

private int idLocalizacao;
private String distrito;
private String rua;
private String avenida;

public UtLocalizacao(int idLocalizacao, String bairro, String distrito, String rua, String avenida) {
    this.idLocalizacao = idLocalizacao;
    this.distrito = distrito;
    this.rua = rua;
    this.avenida = avenida;
}


public int getIdLocalizacao() {
    return idLocalizacao;
}
public void setIdLocalizacao(int idLocalizacao) {
    this.idLocalizacao = idLocalizacao;
}

public String getDistrito() {
    return distrito;
}
public void setDistrito(String distrito) {
    this.distrito = distrito;
}
public String getRua() {
    return rua;
}
public void setRua(String rua) {
    this.rua = rua;
}
public String getAvenida() {
    return avenida;
}
public void setAvenida(String avenida) {
    this.avenida = avenida;
}


}
