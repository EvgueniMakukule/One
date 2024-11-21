import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
public class HomePanel extends JPanel{
   private JScrollPane scrollPane = new JScrollPane(); 
   ImageIcon icon = new ImageIcon("search(0).png");
   JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,20,1));
   RoundedPanel searchPanel = new RoundedPanel(1);
   JTextField searchField = new JTextField();
   CustomButton searchbtn = new CustomButton("",20);
   CustomButton searchByLocat = new CustomButton("Search by my location",20);
   JPanel centerPanel = new JPanel(new BorderLayout());
   RoundedPanel centralScrollJPanel = new RoundedPanel(2); 
   RoundedPanel scrollPanel = new RoundedPanel(0);
   PainelItensRestaurant painelItens = new PainelItensRestaurant();

   HomePanel(){
      setBackground(Color.WHITE);
      setLayout(new BorderLayout());
      topPanelConfug();
      centerPanelConfig();
      addElementAtPanel();
      
 }
   private void topPanelConfug(){  
       topPanel.setBackground(new Color(0,0,0,0));
       topPanel.setBorder(BorderFactory.createEmptyBorder(1,0,0,1));
      //
      searchbtn.setIcon(icon);
      searchbtn.setPreferredSize(new Dimension(30,30));
      searchbtn.setColor(new Color(0,0,0,0));
      searchbtn.setColorClick( new Color(239, 62, 0 ));
      searchbtn.setColorOver(new Color(249, 120, 45));
      //

       searchPanel.setBorder(BorderFactory.createEmptyBorder(-4,10,-4,-4));
       searchPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
       searchPanel.setBackground(Color.white);
       searchPanel.setBorderColor(new Color(180, 180, 180));
       searchField.setOpaque(false);
       searchField.setBorder(BorderFactory.createEmptyBorder());
       searchField.setBackground(Color.WHITE);
       searchField.setPreferredSize(new Dimension(250,20));
       searchField.setFont(new Font("Calibri",Font.PLAIN,15));
       searchPanel.add(searchField);
       searchPanel.add(searchbtn);
       
       topPanel.add(searchPanel);
       topPanel.add(searchByLocat);
       
       add(topPanel,BorderLayout.NORTH);}

   private void centerPanelConfig(){
        centerPanel.setBackground(new Color(0,0,0,0));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10,10,0,8));
        centralScrollJPanelconfi();
        centerPanel.add(centralScrollJPanel);
        add(centerPanel,BorderLayout.CENTER);

       }

   private void centralScrollJPanelconfi(){
         centralScrollJPanel.setLayout(new BorderLayout());
         centralScrollJPanel.setBorderColor(new Color(168, 168, 168));
         centralScrollJPanel.setBackground(getBackground());
         centralScrollJPanel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));

         scrollPane.setBorder(null);
         scrollPane.getViewport().setBorder(null);
         scrollPane.setOpaque(false);
         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
         scrollPane.setViewportView(painelItens);
         scrollPane.setVerticalScrollBar(new ScrollBar());

         scrollPanel.setLayout(new BorderLayout());
         scrollPanel.setBackground(getBackground());
         scrollPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
         scrollPanel.add(scrollPane);
         centralScrollJPanel.add(scrollPanel); 
     

          
      }
  
       
   private void addElementAtPanel(){
      ArrayList<Restourante> resto = Main.getResto();
         for(int i =0; i<resto.size(); i++){
            painelItens.add(new ItenRestaurante(resto.get(i)));
         }
   }







 public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,400);
        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(Color.BLUE);
        main.add(new HomePanel());
        frame.getContentPane().add(main);
        frame.setVisible(true);
   
   
   
  }
   }
