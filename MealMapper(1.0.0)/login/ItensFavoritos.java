import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;

public class ItensFavoritos extends RoundedPanel{
    JPanel centerPanel = new JPanel(new BorderLayout());
    JPanel ritghPanel = new JPanel();
    Color backgroundColor = new Color(0,0,0,0);
    JPanel clicked_on = new JPanel();
    RoundedPanel backGround = new RoundedPanel();
    

    ItensFavoritos(){
     
        init();
     }

    private void init(){
         setLayout(new OverlayLayout(this));
        backGround. setLayout(new BorderLayout());
        backGround. setBorderThickness(1);
        backGround. setBorder(BorderFactory.createEmptyBorder(5,5 ,5,5));
        backGround. setPreferredSize(new Dimension(getWidth(),180));
        backGround. setBackground(Color.WHITE);
        centerPanelConfig();
        ritghPanelConfig();
        add(clicked_on);
        add(backGround);
        clicked_on.setBackground(new Color(10,10,10,10));

        clicked_on.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
                //Body.displayRestoInfo();
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
    public void ritghPanelConfig(){
        ritghPanel.setLayout(new BoxLayout(ritghPanel,BoxLayout.Y_AXIS));
        ritghPanel.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
        ritghPanel.setPreferredSize(new Dimension(500,getHeight()));
        ritghPanel.setBackground(new Color(0,0,0,0));
        JLabel name = new JLabel("KFC");
        JLabel location = new JLabel("Maputo, Praca da OMM");
        JLabel pontuacao = new JLabel("3");
        JTextArea comentario = new JTextArea("Lorem ipsum dolor sitligendi ipsa facere eveni");
        //configuracao dos componetes//
        JPanel name_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        name_Panel.setBackground(new Color(0,0,0,0));
        name_Panel.add(new JLabel("Name:"));
        name_Panel.add(name);
        
        JPanel location_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        location_Panel.setBackground(new Color(0,0,0,0));
        location_Panel.add(new JLabel("Location:"));
        location_Panel.add(location);

        JPanel pontucao_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        pontucao_Panel.setBackground(new Color(0,0,0,0));
        pontucao_Panel.add(new JLabel("Avalicao:"));
        pontucao_Panel.add(pontuacao);

        JPanel comentario_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        comentario_Panel.setBackground(new Color(0,0,0,0));
        comentario_Panel.add(new JLabel("Teus Comentario"));
        comentario.setColumns(2);
        comentario_Panel.add(comentario);
       
        
        
        ritghPanel.add(name_Panel);
        ritghPanel.add(location_Panel);
        ritghPanel.add(pontucao_Panel);
        ritghPanel.add(comentario_Panel);
        
        //addicoa dos componentes

        backGround.add(ritghPanel, BorderLayout.EAST);
        
        
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JPanel main = new JPanel(new BorderLayout());
        main.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        frame.setLocationRelativeTo(null);
        main.setBackground(Color.BLUE);
        main.add(new ItensFavoritos());
        frame.getContentPane().add(main);
        frame.setVisible(true);}








    }
