import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class AvaliaReserva extends RoundedPanel{

    private JLabel avalicao_title = new JLabel("Avaliacoes");
    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private  CustomButton marca_reserva= new CustomButton("Marcar Reserva",20);
    private JPanel scrollPanel = new JPanel(new BorderLayout());
    private JScrollPane scrollPane = new JScrollPane(); 
    PainelItensFava_Reserv painelItensComentario = new PainelItensFava_Reserv();
    private int idRestourante;
   
    AvaliaReserva(int idRestourante){
        this.idRestourante= idRestourante;
        init();
        addComentario();
    }
    private void init(){
        setLayout(new BorderLayout());
        setBackground(Color.white);
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        avalicao_title.setFont(new Font("Calibri", Font.BOLD, 25));
        add(avalicao_title,BorderLayout.NORTH);
        jscrollConfig();
        bottomPanel.setBackground(new Color(0,0,0,0));
        bottomPanel.add(marca_reserva);
        add(bottomPanel,BorderLayout.SOUTH);
        
    }
  private void jscrollConfig(){
         scrollPane.setBorder(null);
         scrollPane.getViewport().setBorder(null);
         scrollPane.setOpaque(false);
         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
         scrollPane.setViewportView(painelItensComentario);
         scrollPane.setVerticalScrollBar(new ScrollBar());

         scrollPanel.setLayout(new BorderLayout());
         scrollPanel.setBackground(getBackground());
         scrollPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
         scrollPanel.add(scrollPane);
         add(scrollPanel,BorderLayout.CENTER); 
      
  }

  private void addComentario(){
    ArrayList<Avaliacoes>  avaliacoeslist = Main.getAvaliacoes(getIdRestourante());
    for(int i =0; i<avaliacoeslist.size();i++){
        Avaliacoes avaliacoes = avaliacoeslist.get(i);
        painelItensComentario.add(new JLabel(avaliacoes.getNome_User()+": "+avaliacoes.getPontuacao_User() ));
        painelItensComentario.add(new JLabel(avaliacoes.getComentario_User()));
    }

  }

   public int getIdRestourante() {
        return idRestourante;
    }
    public void setIdRestourante(int idRestourante) {
        this.idRestourante = idRestourante;
    }

}

