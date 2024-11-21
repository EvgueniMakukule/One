//Sunday.eam
public class Avaliacao {
    private int id;
    private int idUtilizador;
    private int id_restourante;
    private String comentarios;
    private int pontuacao;
    
    

    public Avaliacao(int id, int idUtilizador, int id_restourante, String comentarios, int pontuacao) {
        this.id = id;
        this.idUtilizador = idUtilizador;
        this.id_restourante = id_restourante;
        this.comentarios = comentarios;
        this.pontuacao = pontuacao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public int getId_restourante() {
        return id_restourante;
    }
    public void setId_restourante(int id_restourante) {
        this.id_restourante = id_restourante;
    }
    public int getIdUtilizador() {
        return idUtilizador;
    }
    public void setIdUtilizador(int idUtilizador) {
        this.idUtilizador = idUtilizador;
    }
}
// Sunday.eam