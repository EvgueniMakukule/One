public class Avaliacoes {
    private String nome_User;
    private String Comentario_User;
    private String pontuacao_User;
    public Avaliacoes(String nome_User, String comentario_User, String pontuacao_User) {
        this.nome_User = nome_User;
        Comentario_User = comentario_User;
        this.pontuacao_User = pontuacao_User;
    }
    public String getNome_User() {
        return nome_User;
    }
    public void setNome_User(String nome_User) {
        this.nome_User = nome_User;
    }
    public String getComentario_User() {
        return Comentario_User;
    }
    public void setComentario_User(String comentario_User) {
        Comentario_User = comentario_User;
    }
    public String getPontuacao_User() {
        return pontuacao_User;
    }
    public void setPontuacao_User(String pontuacao_User) {
        this.pontuacao_User = pontuacao_User;
    }
    
}
