import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RestaurantViewPanel extends JPanel {

   JPanel header = new JPanel(new BorderLayout());
   JPanel headerLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
   JPanel headerRitgh = new JPanel(new FlowLayout(FlowLayout.RIGHT));
   RoundedPanel conteinner = new RoundedPanel();
   JPanel conteinner_top = new JPanel();
   JPanel conteinner_bottom = new JPanel();
   JPanel piture_box = new JPanel(new BorderLayout());
   JPanel piture_menu=  new JPanel(new BorderLayout());
    JLabel voltar = new JLabel("Back");

   
   RoundedPanel pontua_avalicaPanel = new RoundedPanel();
   RoundedPanel details_panel = new RoundedPanel();
   RoundedPanel location_panel = new RoundedPanel();
   RoundedPanel userComents_panel = new RoundedPanel();

   private Color backGround = Color.WHITE;

   Restourante restourante = new Restourante(); 

RestaurantViewPanel(Restourante restourante){
this.restourante = restourante;
    init();
    
   }
private void init(){
    setBackground(backGround);
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    conteinner.setLayout(new BorderLayout());
    conteinner.setBorderThickness(2);
    conteinner.setBackground(backGround);
    conteinner_top.setBackground(backGround);
    conteinner_bottom.setBackground(backGround);
    headerConfg();
    conteinner_topConfig();
    conteinner_bottomConfig();
    conteinner.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    add(conteinner);
    action();
  

}

private void action(){
    voltar.addMouseListener(new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("clicked");
            
            Body.backToMainMenu();
            System.out.println("Passed");
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
        
    });
}
private void headerConfg(){
        JLabel resto_name = new JLabel(getRestourante().getNomeRestourante());
        headerRitgh.add(resto_name);
        headerLeft.add(voltar);
        header.add(headerLeft,BorderLayout.EAST);
        header.add(headerRitgh, BorderLayout.WEST);
        header.setBackground(backGround);
        headerLeft.setBackground(backGround);
        headerRitgh.setBackground(backGround);
        add(header,BorderLayout.NORTH);}

private void conteinner_topConfig(){
    GroupLayout layout =new GroupLayout(conteinner_top);
    conteinner_top.setLayout(layout);
    Dimension imageSize =new Dimension(200,300);

    JPanel piturePanel1= new JPanel(new BorderLayout());
     piturePanel1.setPreferredSize(imageSize);
    ImageIcon icon1 = new ImageIcon("KFC.jpg");
    ImageView piture1 = new ImageView(icon1);
     piturePanel1.add(piture1);
    
    JPanel  piturePanel2= new JPanel(new BorderLayout());
    piturePanel2.setPreferredSize(imageSize);
    ImageIcon icon2 = new ImageIcon("KFC(menu).jpg");
    ImageView piture2 = new ImageView(icon2);
    piturePanel2.add(piture2);
    
    GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
    hGroup.addComponent( piturePanel1);
    hGroup.addGap(10);
    hGroup.addComponent(piturePanel2);
    layout.setHorizontalGroup(hGroup);

    GroupLayout.ParallelGroup vGroup = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
    vGroup.addComponent( piturePanel1);
    vGroup.addComponent(piturePanel2);
    layout.setVerticalGroup(vGroup);
    
    conteinner_top.add( piturePanel1);
    conteinner_top.add(piturePanel2);
   
    conteinner.add(conteinner_top,BorderLayout.NORTH);
}

private void conteinner_bottomConfig(){
     GroupLayout layout =new GroupLayout(conteinner_bottom);
     conteinner_bottom.setLayout(layout);
     conteinner_bottom.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

     Details_Panel details_Panel = new Details_Panel(getRestourante());
     Location_Panel location_Panel = new Location_Panel(getRestourante());
     AvaliaReserva avaliaReserva = new AvaliaReserva(getRestourante().getId_restourante());

     GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
     hGroup.addComponent(details_Panel);
     hGroup.addGap(10);
     hGroup.addComponent(location_Panel);
     hGroup.addGap(10);
     hGroup.addComponent(avaliaReserva);
     layout.setHorizontalGroup(hGroup);

     GroupLayout.ParallelGroup vGroup = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
     vGroup.addComponent(details_Panel);
     vGroup.addComponent(location_Panel);
     vGroup.addComponent(avaliaReserva);
     layout.setVerticalGroup(vGroup);
    
    conteinner_bottom.add(details_Panel);
    conteinner_bottom.add(location_Panel);
    conteinner_bottom.add(avaliaReserva);

   
    conteinner.add(conteinner_bottom,BorderLayout.CENTER);

     
      


}
    

   public Restourante getRestourante() {
    return restourante;
}
public void setRestourante(Restourante restourante) {
    this.restourante = restourante;
}
     public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setBackground(Color.BLACK);
        //frame.add(new RestaurantViewPanel());
        frame.setVisible(true);
     }
}
