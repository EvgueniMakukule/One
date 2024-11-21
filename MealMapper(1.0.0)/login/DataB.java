import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class DataB {
    final String url = "jdbc:mysql://localhost/slrbank";
    final String user = "root";
    final String senhaBanco = "";

public DataB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ee) {
            System.out.println(ee.getMessage());
        }
    }

    
public void RegistarUser(Utilizador utilizador) throws IOException {

        try {

            Connection connect = DriverManager.getConnection("jdbc:mysql://localHost/slrbank", "root", "");
            PreparedStatement smt = connect.prepareStatement(
                    "INSERT INTO utilizador (email,nomeUt,sexo,cidade_proviniencia,telefoneUt1,senha) VALUES (?,?,?,?,?,?)");
            smt.setString(1, utilizador.getEmail());
            smt.setString(2, utilizador.getNomeUtilizador());
            smt.setString(3, String.valueOf(utilizador.getSexo()));
            smt.setString(4, utilizador.getCidade_proveniencia());
            smt.setString(5, utilizador.getTelefoneUtilizador());
            smt.setInt(6, utilizador.getSenha());
            int row = smt.executeUpdate();
            connect.close();
            if (row == 1) {
                System.out.println("Registrado com sucesso");
            } else {
                System.out.println("Erro tentado registar");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

ArrayList<Restourante> getRandomRestorants(){
        Restourante resto = new Restourante();
        ArrayList<Restourante> arrayRest  = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url, user, senhaBanco);
            PreparedStatement smt = connection.prepareStatement("SELECT *FROM RESTAURANTE;");
            ResultSet table = smt.executeQuery();

            while(table.next()){
            resto.setId_restourante(table.getInt("idRestourante"));
            resto.setNomeRestourante(table.getString("nomeRestaurante"));
            resto.setEndereco(table.getString("endereco"));
            //adcionar mais tarde as configuracoes da imagems e time
            resto.setPicture(null);
            resto.setMenu(null);
            resto.setHorario(null);
            //
            resto.setAvaliacao_media(table.getInt("avaliacao_media"));
            resto.setTelefoneRestourante(table.getString("tel_restaurante1"));
            arrayRest.add(resto);
            resto = new Restourante();
             }
             smt.close();
             connection.close();
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return arrayRest;

    }

public Utilizador getUser(String nome, int senhaUt) throws IOException {
        Utilizador userP = new Utilizador();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conect = DriverManager.getConnection(url, user, senhaBanco);
            PreparedStatement smt = conect.prepareStatement("SELECT *FROM utilizador WHERE nomeUt = ? AND senha =?;");

            smt.setString(1, nome);
            smt.setInt(2, senhaUt);
            ResultSet table = smt.executeQuery();

            while (table.next()){
                userP.setIdUtilizador(table.getInt("idUtilizador"));
                userP.setEmail(table.getString("email"));
                userP.setSenha(table.getInt("senha"));
                userP.setTelefoneUtilizador(table.getString("telefoneUt1"));
                userP.setNomeUtilizador(table.getString("nomeUt"));
                userP.setCidade_proveniencia(table.getString("cidade_proviniencia"));
            }
            table.close();
            smt.close();
            conect.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException d) {
            System.out.println(d.getMessage());
        }
        return userP;

    }    

ArrayList<Avaliacoes> getAvalicaoesDoResto(int idRestourante){
    ArrayList<Avaliacoes> avaliacoeslist = new ArrayList<>();
    try {
        Connection connection = DriverManager.getConnection(url, user, senhaBanco);
        PreparedStatement smt = connection.prepareStatement("CALL AvalicaoesDoResto(?);");
        smt.setInt(1, idRestourante);
        ResultSet table = smt.executeQuery();
        while (table.next()){
            Avaliacoes avaliacoes = new Avaliacoes(table.getString("nomeUt"), table.getString("comentarios"),table.getString("pontuacao"));
            avaliacoeslist.add(avaliacoes);
            avaliacoes= null;
            
        }
        table.close();
        smt.close();
        connection.close();
        
    } catch (Exception e) {
        e.printStackTrace();}

        return avaliacoeslist;
        }
   
ArrayList<Reserva> getUserReservation(int idUtilizador){
   ArrayList<Reserva> reservaList = new ArrayList<>();
    try {
        Connection connection = DriverManager.getConnection(url, user, senhaBanco);
        PreparedStatement smt = connection.prepareStatement("CALL getUserReservation(?);");
        smt.setInt(1, idUtilizador);
        ResultSet table = smt.executeQuery();
        while (table.next()){
          Timestamp timestamp = table.getTimestamp("horario_reserva");
            LocalDateTime time = timestamp.toLocalDateTime();
            Reserva reserva = new Reserva(
            table.getInt("idReserva"),
            table.getInt("idRestourante"),
            table.getInt("idUtilizador"),
            table.getString("nomeDeReserva"),
            table.getString("nomeUtilizador"),
            table.getString("telefoneUtilizador"),
            time
            );
            reservaList.add(reserva);    
            
        }
        table.close();
        smt.close();
        connection.close();
        
    } catch (Exception e) {
        e.printStackTrace();}

        return reservaList;
        }




















/* 
   
    public Restourante searchRestourante(String nomeRestaurane) throws IOException {
        Restourante restourante = new Restourante();
        try {
            Connection connection = DriverManager.getConnection(url, user, senhaBanco);
            PreparedStatement smt = connection.prepareStatement("SELECT *FROM RESTAURANTE WHERE  nomeRestaurante LIKE ?;");
           smt.setString(1, nomeRestaurane);
            ResultSet table = smt.executeQuery();
             while(table.next()){
            restourante.setId_restourante(table.getInt("idRestourante"));
            restourante.setNomeRestourante(table.getString("nomeRestaurante"));
            restourante.setEndereco(table.getString("endereco"));
            restourante.setAvaliacao_media(null);
            restourante.setHorario(table.getString("horario_funcionamento"));
            restourante.setTelefoneRestourante(table.getString("tel_restaurante1"));
             }
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }

        return restourante;
    }

    */
    public void registraReserva(Reserva reserva) throws IOException {
        try {
            Connection connection = DriverManager.getConnection(url, user, senhaBanco);
            PreparedStatement smt = connection
                    .prepareStatement("iNSERT INTO reserva values (DEFAULT,?,?,?,?,?,NULL,NULL,?);");
            smt.setInt(1, reserva.getId_restourante());
            smt.setInt(2, reserva.getIdUtilizador());
            smt.setString(3, reserva.getNomeUtilizador());
            smt.setString(4, reserva.getNomeReserva());
           // smt.setInt(5, reserva.getTelefoneUtilizador());
            smt.setObject(6, reserva.getHorario_reserva());
            int row = smt.executeUpdate();
            connection.close();
            if (row == 1) {
                System.out.println("Reserva feita com sucesso");
            } else {
                System.out.println("Erro tentando fazer Reserva");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

   
    public void registarAvalicao(Avaliacao avaliacao) throws IOException {
        try {
            Connection connection = DriverManager.getConnection(url, user, senhaBanco);
            PreparedStatement smt = connection.prepareStatement("INSERT INTO avaliacao VALUES (DEFAULT,?,?,?,?);");
            smt.setInt(1, avaliacao.getIdUtilizador());
            smt.setInt(2, avaliacao.getId_restourante());
            smt.setString(3, avaliacao.getComentarios());
            smt.setInt(4, avaliacao.getPontuacao());
            int row = smt.executeUpdate();
            if (row != 0) {
                System.out.println("FeedBack guardado!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    
    public void registarFavoritos(int idUtilizadorGlobal, Restourante restourante) throws IOException {
        try {
            FileWriter file = new FileWriter("FileFavoritos.txt", true);
            BufferedWriter hand = new BufferedWriter(file);
            hand.newLine();
            hand.write(idUtilizadorGlobal + "//");
            hand.write(restourante.getId_restourante() + "//");
            hand.write(restourante.getNomeRestourante() + "//");
            hand.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

   
    public Vector buscarFavoritos(int idUtilizadorGlobal) {
        String nomesR = null;
        int id = 0;
        StringTokenizer token;
        Vector listFav = new Vector<>();
        try {
            FileReader file = new FileReader("FileFavoritos.txt");
            BufferedReader eyes = new BufferedReader(file);
            String line = eyes.readLine();

            while (line != null) {
                token = new StringTokenizer(line, "//");
                id = Integer.parseInt(token.nextToken());
                if (idUtilizadorGlobal == id) {
                    token.nextElement();
                    listFav.addElement(token.nextElement());

                }
                line = eyes.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (NoClassDefFoundError a) {
            System.out.println(a.getMessage());
        }

        return listFav;
    }

    public int getUserId(String nome, int senhaUt){
        int id=0;
        try {
            
            Connection conect = DriverManager.getConnection(url, user, senhaBanco);
            PreparedStatement smt = conect.prepareStatement("select idUtilizador from utilizador where nomeUt = ? and senha =?;");

            smt.setString(1, nome);
            smt.setInt(2, senhaUt);
            ResultSet table = smt.executeQuery();
            while(table.next()){
            id = table.getInt("idUtilizador");
                  }
        }catch( SQLException ss){}
      return id;
    
}

public static void main(String[] args) {
    new DataB();
}
}