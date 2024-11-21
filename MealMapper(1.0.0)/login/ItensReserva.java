import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItensReserva extends RoundedPanel{
    JPanel centerPanel = new JPanel(new BorderLayout());
    JPanel ritghPanel = new JPanel();
    Color backgroundColor = new Color(0,0,0,0);
 
    JLabel nome_da_reserva = new JLabel();
    JLabel nome_restorante = new JLabel("KFC");
    JLabel horario_reserva = new JLabel();
    JLabel numero_marcado = new JLabel();
    
    

    

    ItensReserva(Restourante restourante, Reserva reserva){
      
      
      
        init();
    }
    public void init(){
        setLayout(new BorderLayout());
        setBorderThickness(1);
        setBorder(BorderFactory.createEmptyBorder(5,5 ,5,5));
        setPreferredSize(new Dimension(getWidth(),180));
        setBackground(Color.WHITE);
        centerPanelConfig();
        ritghPanelConfig();
    }
    public void centerPanelConfig(){
        ImageIcon icon = new ImageIcon("KFC.jpg");
        ImageView imageRest= new ImageView(icon);
        centerPanel.setBackground(getBackground());
        centerPanel.add(imageRest);
        add(centerPanel,BorderLayout.CENTER);
    }
    
    public void ritghPanelConfig(){
        ritghPanel.setLayout(new BoxLayout(ritghPanel,BoxLayout.Y_AXIS));
        ritghPanel.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
        ritghPanel.setBackground(new Color(0,0,0,0));
        ritghPanel.setPreferredSize(new Dimension(500,getHeight()));
        //configuracao dos componetes//
        JPanel nome_restorante_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        nome_restorante_Panel.setBackground(new Color(0,0,0,0));
        nome_restorante_Panel.add(new JLabel("nome_restorante:"));
        nome_restorante_Panel.add(nome_restorante);
        
        JPanel nome_reserva_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        nome_reserva_Panel.setBackground(new Color(0,0,0,0));
        nome_reserva_Panel.add(new JLabel("Reservation name:"));
        nome_reserva_Panel.add(nome_da_reserva);

        JPanel horario_reserva_panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        horario_reserva_panel.setBackground(new Color(0,0,0,0));
        horario_reserva_panel.add(new JLabel("Servant's schedule:"));
        horario_reserva_panel.add(horario_reserva);

        JPanel numero_marcado_panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,0));
        numero_marcado_panel.setBackground(new Color(0,0,0,0));
        numero_marcado_panel.add(new JLabel("Dialed number"));
        numero_marcado_panel.add(numero_marcado);
       
        
        
        ritghPanel.add(nome_restorante_Panel);
        ritghPanel.add(nome_reserva_Panel);
        ritghPanel.add(horario_reserva_panel);
        ritghPanel.add(numero_marcado_panel);
        
        //addicoa dos componentes

        add(ritghPanel, BorderLayout.EAST);
        
        
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JPanel main = new JPanel(new BorderLayout());
        main.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        frame.setLocationRelativeTo(null);
        main.setBackground(Color.BLUE);
       // main.add(new ItensReserva());
        frame.getContentPane().add(main);
        frame.setVisible(true);}








    }
