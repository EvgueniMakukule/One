import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;


public class Body extends JPanel{
    static JPanel body = new JPanel(new BorderLayout());
    static JPanel body1 = new JPanel(new BorderLayout());
    static JPanel body2 = new JPanel(new BorderLayout());
    
    private Color background = Color.WHITE;
    Body(){
    setLayout(new BorderLayout());
     body.setBackground(background);
     body1.setBackground(background);
     body2.setBackground(background);
     body.setLayout(new OverlayLayout(body));
     body1.add(new BodyLeftPanel(), BorderLayout.WEST);
     body1.add(new BodySheets(),BorderLayout.CENTER);
     body.add(body1);
     body.add(body2);
     add(body);

     
    }
    public static void displayRestoInfo(Restourante restourante){
      System.out.println("chgou com >"+restourante.getNomeRestourante());
     RestaurantViewPanel restaurantViewPanel = new RestaurantViewPanel(restourante);
     
        body2.add(restaurantViewPanel);
        body2.setVisible(true);
        body1.setVisible(false);
        body.repaint();
       
                
      }
    public static void backToMainMenu(){
        body2.removeAll();
        body2.repaint();
        body2.setVisible(false);
        body.revalidate();
        body1.setVisible(true);
        body.repaint();
    }
}
