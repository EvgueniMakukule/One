import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static DataB dataB = new DataB();
    public static void main(String[] args) {
        FirstFrame firstFrame = new FirstFrame();
        firstFrame.repaint();
   }

    public static Utilizador setNewUser(Utilizador user) throws IOException{
        dataB.RegistarUser(user);
        return  dataB.getUser(user.getNomeUtilizador(),user.getSenha());
    }

    public static Utilizador loginUser(String nome, int senha)throws IOException{
        Utilizador user= dataB.getUser(nome, senha);
        if(!(user.getIdUtilizador()==0)){
            return user;
        } 
      return user;
    }

    public static ArrayList<Restourante> getResto(){
        return dataB.getRandomRestorants();
    }

    public static ArrayList<Avaliacoes> getAvaliacoes(int id_restourante){
        return dataB.getAvalicaoesDoResto(id_restourante);
    }
}
