import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class MarcarResercaPanel extends RoundedPanel{

    JLabel tittle = new JLabel("Marcar reserva");
    JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel centerPanel = new JPanel();
    JPanel bottomPanel = new JPanel();

    JLabel nome_tittle = new JLabel("Nome da Reserva");
    JLabel data_tittle = new JLabel("A data da Reserva");
    JLabel hora_tittle = new JLabel("A hora pra que esta marcada");
    JLabel numeroUsuario_title = new JLabel("O Numero de pessoas");
    JLabel numeroPessoa_tittle = new JLabel("O seu numero");

    JTextField nome_Fild = new JTextField();
    JSpinner data = new JSpinner();
  
    JTextField numeroUsuario_Fild = new JTextField();
    JTextField numeroPessoa_Fild = new JTextField();

    CustomButton marcar = new CustomButton("Marcar",20);

    MarcarResercaPanel(){
        init();
    }
    private void init(){
        setLayout(new BorderLayout());
        setBorderThickness(2);
        topPanelConfig();
        centerPanelConfig();
        bottomPanelConfig();
    }
    private void topPanelConfig(){
        topPanel.add(tittle);
        add(topPanel,BorderLayout.NORTH);
     }
    private void centerPanelConfig(){
        centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.Y_AXIS));
        centerPanel.add(nome_tittle);
        centerPanel.add(data_tittle);
        centerPanel.add(hora_tittle);
        centerPanel.add(numeroUsuario_title);
        centerPanel.add(numeroPessoa_tittle);
        add(centerPanel,BorderLayout.CENTER);
    }
    private void bottomPanelConfig(){
        bottomPanel.add(marcar);
        add(bottomPanel,BorderLayout.SOUTH);
    }

    
     public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);

        frame.add(new MarcarResercaPanel());
        frame.setVisible(true);
     }
}
