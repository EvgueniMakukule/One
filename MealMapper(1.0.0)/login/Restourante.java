//Sunday.eam

import java.time.LocalDateTime;

import javax.swing.ImageIcon;

public class Restourante {
private int id_restourante;
private String nomeRestourante;
private ImageIcon menu;
private ImageIcon picture;
private String endereco;
private LocalDateTime horario;
private String telefoneRestourante;
private int  avaliacao_media;

public Restourante(){};
public Restourante(int id_restourante, String nomeRestourante, ImageIcon menu, String endereco, LocalDateTime horario,
    String telefoneRestourante, int avaliacao_media) {
    this.id_restourante = id_restourante;
    this.nomeRestourante = nomeRestourante;
    this.menu = menu;
    this.endereco = endereco;
    this.horario = horario;
    this.telefoneRestourante = telefoneRestourante;
    this.avaliacao_media = avaliacao_media;
}
public int getId_restourante() {
    return id_restourante;
}
public void setId_restourante(int id_restourante) {
    this.id_restourante = id_restourante;
}
public String getNomeRestourante() {
    return nomeRestourante;
}
public void setNomeRestourante(String nomeRestourante) {
    this.nomeRestourante = nomeRestourante;
}

public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getTelefoneRestourante() {
    return telefoneRestourante;
}
public void setTelefoneRestourante(String telefoneRestourante) {
    this.telefoneRestourante = telefoneRestourante;
}

public ImageIcon getMenu() {
    return menu;
}
public void setMenu(ImageIcon menu) {
    this.menu = menu;
}
public ImageIcon getPicture() {
    return picture;
}
public void setPicture(ImageIcon picture) {
    this.picture = picture;
}
public int getAvaliacao_media() {
    return avaliacao_media;
}
public void setAvaliacao_media(int avaliacao_media) {
    this.avaliacao_media = avaliacao_media;
}
public LocalDateTime getHorario() {
    return horario;
}
public void setHorario(LocalDateTime horario) {
    this.horario = horario;
}



    
}
// Sunday.eam