import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Location_Panel extends RoundedPanel{
    JLabel location = new JLabel("Localização e contato");
    JLabel endereco_info = new JLabel("Endereco");
    JLabel endereco = new JLabel();
    JLabel contacto_info = new JLabel("Contacto");
    JLabel contacto = new JLabel();
    JLabel email_info = new JLabel("Email");
    JLabel email= new JLabel();
    JPanel centerPanel = new JPanel();

    
    Location_Panel(Restourante restourante){
        endereco.setText(restourante.getEndereco());
        contacto.setText(restourante.getTelefoneRestourante());
        email.setText(restourante.getNomeRestourante()+"@gmail.com");
        init();

    }
    private void init(){
        setLayout(new BorderLayout());
        setBackground(Color.white);
        centerPanel.setBackground(new Color(0,0,0,0));
        centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setBorderThickness(1);
        fontConfg();
        centerPanel.add(location, BorderLayout.NORTH);
        centerPanel. add(Box.createVerticalStrut(10));
        centerPanel.add(endereco_info);
        centerPanel.add(endereco);
        centerPanel.add(contacto_info);
        centerPanel. add(contacto);
        centerPanel.add(email_info);
        centerPanel.add(email);
        add(centerPanel);


    }
    private void fontConfg(){
        location.setFont(new Font("Calibri", Font.BOLD, 25));
        endereco_info.setFont(new Font("Calibri", Font.BOLD, 19));
        endereco.setFont(new Font("Calibri", Font.BOLD, 16));
        contacto_info.setFont(new Font("Calibri", Font.BOLD, 19));
        contacto.setFont(new Font("Calibri", Font.BOLD, 16));
        email_info.setFont(new Font("Calibri", Font.BOLD, 19));
        email.setFont(new Font("Calibri", Font.BOLD, 16));
    }
 public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
       // frame.add(new Location_Panel());
        frame.setVisible(true);
     }
}
