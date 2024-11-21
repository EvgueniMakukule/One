import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
public class ReservationPanel extends JPanel{
  Color backgroundColor = Color.white;
     private JScrollPane scrollPane = new JScrollPane(); 
   
    JPanel topPanel = new JPanel();
    JPanel panel = new JPanel(new BorderLayout());
      RoundedPanel favoritsConts = new RoundedPanel(2);
        PainelItensFava_Reserv painelItensFavoritos= new PainelItensFava_Reserv();

    ReservationPanel(){
      
       setBackground(new Color(0,0,0,0));
       setLayout(new BorderLayout());
       topPanelConig();
       centerConfig();
       centralScrollJPanelconfi();
      

       
 }
    private void topPanelConig(){
      topPanel.setBackground(backgroundColor);
      topPanel.setBorder(BorderFactory.createEmptyBorder(0,20,0,0));
       JLabel tittle = new JLabel("Reservations");
       JLabel text_info = new JLabel("Your last reservations made");
       topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.Y_AXIS));
       topPanel.add(tittle);
       topPanel.add(text_info);
        add(topPanel, BorderLayout.NORTH);

    }
    public void centerConfig(){
      panel.setBackground(backgroundColor);
      panel.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
      favoritsConts.setBorderColor(Color.GRAY);
      panel.add(favoritsConts);
      add(panel,BorderLayout.CENTER);

    }
   
  
       
   
    private void centralScrollJPanelconfi(){
     scrollPane.setBorder(null);
      scrollPane.getViewport().setBorder(null);
      scrollPane.setOpaque(false);
      scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      scrollPane.setViewportView(painelItensFavoritos);
      scrollPane.setVerticalScrollBar(new ScrollBar());
     
      favoritsConts.setLayout(new BorderLayout());
      favoritsConts.setBackground(backgroundColor);
      favoritsConts.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
      favoritsConts.add(scrollPane);

     
   //adiciona o itens ao Jscrol//
      for(int i =0; i<10; i++){
        JPanel margin = new JPanel(new BorderLayout());
        margin.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        margin.add(new ItensReserva());
        margin.setBackground(backgroundColor);
        painelItensFavoritos.add(margin);
      }

       
   }






 public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        JPanel main = new JPanel(new BorderLayout());
        frame.setLocationRelativeTo(null);
        main.setBackground(Color.BLUE);
        main.add(new ReservationPanel());
        frame.getContentPane().add(main);
        frame.setVisible(true);
   
   
   
  }
   }