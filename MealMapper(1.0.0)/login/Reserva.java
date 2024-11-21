//Sunday.eam
import java.time.LocalDateTime;
public class Reserva {
private int idReserva;
private int id_restourante;
private int idUtilizador;
private String nomeReserva;
private String nomeUtilizador;
private String telefoneUtilizador;
private LocalDateTime horario_reserva;



public Reserva(
    
    int idReserva,
    int id_restourante,
    int idUtilizador,
    String nomeReserva,
    String nomeUtilizador,
    String telefoneUtilizador, 
    LocalDateTime horario_reserva) 
    
    {
    this.idReserva = idReserva;
    this.id_restourante = id_restourante;
    this.idUtilizador = idUtilizador;
    this.nomeReserva = nomeReserva;
    this.nomeUtilizador = nomeUtilizador;
    this.telefoneUtilizador = telefoneUtilizador;
    this.horario_reserva= horario_reserva;
}



public int getIdReserva() {
    return idReserva;
}
public void setIdReserva(int idReserva) {
    this.idReserva = idReserva;
}
public String getNomeReserva() {
    return nomeReserva;
}
public void setNomeReserva(String nomeReserva) {
    this.nomeReserva = nomeReserva;
}
public String getNomeUtilizador() {
    return nomeUtilizador;
}
public void setNomeUtilizador(String nomeUtilizador) {
    this.nomeUtilizador = nomeUtilizador;
}
public String getTelefoneUtilizador() {
    return telefoneUtilizador;
}
public void setTelefoneUtilizador(String telefoneUtilizador) {
    this.telefoneUtilizador = telefoneUtilizador;
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



public LocalDateTime getHorario_reserva() {
    return horario_reserva;
}



public void setHorario_reserva(LocalDateTime horario_reserva) {
    this.horario_reserva = horario_reserva;
}




}
// Sunday.eam