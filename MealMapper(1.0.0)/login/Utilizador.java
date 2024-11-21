//Sunday.eam
public class Utilizador{

private int idUtilizador;
private String email;
private int senha;
private String telefoneUtilizador;
private char sexo;
private String nomeUtilizador;
private String cidade_proveniencia;


public Utilizador(int idUtilizador, String email, int senha, String telefoneUtilizador, char sexo, String nomeUtilizador,
        String cidade_proveniencia) {
    this.idUtilizador = idUtilizador;
    this.email = email;
    this.senha = senha;
    this.telefoneUtilizador = telefoneUtilizador;
    this.sexo = sexo;
    this.nomeUtilizador = nomeUtilizador;
    this.cidade_proveniencia = cidade_proveniencia;
}
public Utilizador(){}

public int getIdUtilizador() {
    return idUtilizador;
}
public void setIdUtilizador(int idUtilizador) {
    this.idUtilizador = idUtilizador;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public int getSenha() {
    return senha;
}
public void setSenha(int senha) {
    this.senha = senha;
}
public String getTelefoneUtilizador() {
    return telefoneUtilizador;
}
public void setTelefoneUtilizador(String telefoneUtilizador) {
    this.telefoneUtilizador = telefoneUtilizador;
}
public char getSexo() {
    return sexo;
}
public void setSexo(char sexo) {
    this.sexo = sexo;
}
public String getNomeUtilizador() {
    return nomeUtilizador;
}
public void setNomeUtilizador(String nomeUtilizador) {
    this.nomeUtilizador = nomeUtilizador;
}
public String getCidade_proveniencia() {
    return cidade_proveniencia;
}
public void setCidade_proveniencia(String cidade_proveniencia) {
    this.cidade_proveniencia = cidade_proveniencia;
}


@Override
public String toString() {
    return "Utilizador [idUtilizador=" + idUtilizador + ", email=" + email + ", senha=" + senha
            + ", telefoneUtilizador=" + telefoneUtilizador + ", sexo=" + sexo + ", nomeUtilizador=" + nomeUtilizador
            + ", cidade_proveniencia=" + cidade_proveniencia + "]";
}




}
// sunday.eam