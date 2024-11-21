import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Details_Panel extends RoundedPanel{
    JLabel details = new JLabel("Detalhes");
    JLabel faixa_preco_info = new JLabel("FAIXA DE PREÇO");
    JLabel faixa_preco = new JLabel();
    JLabel cozinhas_info = new JLabel("COZINHAS");
    JLabel cozinhas = new JLabel();
    JLabel avalicaoMed_info = new JLabel("Avaliaçõe Media");
    JLabel avalicaoMedia= new JLabel();
    JPanel centerPanel = new JPanel();

    
    Details_Panel(Restourante restourante){
        faixa_preco.setText("1000-100000");
        cozinhas.setText("comida");
       avalicaoMedia.setText(Integer.toString(restourante.getAvaliacao_media())+ " Em Pontucao media");
        init();

    }
    private void init(){
      
        setLayout(new BorderLayout());
        centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.Y_AXIS));
        setBackground(Color.white);
        centerPanel.setBackground(new Color(0,0,0,0));
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setBorderThickness(1);
        fontConfg();


       add(details,BorderLayout.NORTH);
       centerPanel. add(Box.createVerticalStrut(15));
        centerPanel.add(faixa_preco_info);
        centerPanel.add(faixa_preco);
        centerPanel.add(cozinhas_info);
       centerPanel. add(cozinhas);
       centerPanel. add(avalicaoMed_info);
       centerPanel. add(avalicaoMedia);
       add(centerPanel);
            

    }
    private void fontConfg(){
        details.setFont(new Font("Calibri", Font.BOLD, 25));
        faixa_preco_info.setFont(new Font("Calibri", Font.BOLD, 19));
        faixa_preco.setFont(new Font("Calibri", Font.BOLD, 16));
        cozinhas_info.setFont(new Font("Calibri", Font.BOLD, 19));
        cozinhas.setFont(new Font("Calibri", Font.BOLD, 16));
        avalicaoMed_info.setFont(new Font("Calibri", Font.BOLD, 19));
        avalicaoMedia.setFont(new Font("Calibri", Font.BOLD, 16));
    }
 public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
       //frame.add(new Details_Panel());
        frame.setVisible(true);
     }
}
