import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class ItenRestaurante extends RoundedPanel{
    JPanel centerPanel = new JPanel(new BorderLayout());
    JPanel bottomPanel = new JPanel();
    JPanel clicked_on = new JPanel();
    RoundedPanel backGround = new RoundedPanel(); 
    private Restourante restaurante = new Restourante();
    
ItenRestaurante(Restourante restaurante){
        this.restaurante = restaurante;
       
        
        
    init();

    }
   private void init(){
    setLayout(new OverlayLayout(this));
        backGround.setLayout(new BorderLayout());
        backGround.setPreferredSize(new Dimension(215,215));
        backGround.setBorder(BorderFactory.createEmptyBorder(5,5 ,0,5));
        backGround.setBorderThickness(1);
        backGround.setBackground(Color.WHITE);
        backGround.setVisible(true);
        centerPanelConfig();
        bottomPanelConfig();
        add(clicked_on);
        add(backGround);
        clicked_on.setBackground(new Color(0,0,0,0));

       clicked_on.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent a){
            System.out.println(getRestaurante().getNomeRestourante());
            
           Body.displayRestoInfo(getRestaurante());
            System.out.println("Passed!!");
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
    public void centerPanelConfig(){
        ImageIcon icon = new ImageIcon("KFC.jpg");
        ImageView imageRest= new ImageView(icon);
        centerPanel.setBackground(getBackground());
        centerPanel.add(imageRest);
        backGround.add(centerPanel,BorderLayout.CENTER);
    }
    public void bottomPanelConfig(){
        JLabel name = new JLabel(restaurante.getNomeRestourante());
        JLabel location = new JLabel(restaurante.getEndereco());
        JPanel name_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));

        name_Panel.setBackground(new Color(0,0,0,0));
        JPanel location_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        location_Panel.setBackground(new Color(0,0,0,0));
        bottomPanel.setLayout(new BoxLayout(bottomPanel,BoxLayout.Y_AXIS));

        name_Panel.add(new JLabel("Name:"));
        name_Panel.add(name);
        bottomPanel.add(name_Panel);

        bottomPanel.add(Box.createVerticalStrut(-20));

        location_Panel.add(new JLabel("Location:"));
        location_Panel.add(location);
        bottomPanel.add(location_Panel);

        bottomPanel.setBackground(new Color(0,0,0,0));
        bottomPanel.setPreferredSize(new Dimension(bottomPanel.getWidth(),50));
        backGround.add(bottomPanel, BorderLayout.SOUTH);
       
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        JPanel main = new JPanel(new BorderLayout());
        main.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        frame.setLocationRelativeTo(null);
        main.setBackground(Color.BLUE);
       // main.add(new ItenRestaurante());
        frame.getContentPane().add(main);
        frame.setVisible(true);}

        
    public JPanel getCenterPanel() {
        return centerPanel;
    }
    public void setCenterPanel(JPanel centerPanel) {
        this.centerPanel = centerPanel;
    }
    public JPanel getBottomPanel() {
        return bottomPanel;
    }
    public void setBottomPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
    }
    public JPanel getClicked_on() {
        return clicked_on;
    }
    public void setClicked_on(JPanel clicked_on) {
        this.clicked_on = clicked_on;
    }
    public RoundedPanel getBackGround() {
        return backGround;
    }
    public void setBackGround(RoundedPanel backGround) {
        this.backGround = backGround;
    }
    public Restourante getRestaurante() {
        return restaurante;
    }
    public void setRestaurante(Restourante restaurante) {
        this.restaurante = restaurante;
    }








    }
