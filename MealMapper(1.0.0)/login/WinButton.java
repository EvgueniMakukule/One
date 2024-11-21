import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class WinButton extends JPanel{

static CustomButton minimize = new CustomButton("", 10);
static CustomButton maximize = new CustomButton("", 10);
static CustomButton close = new CustomButton("", 10);



    WinButton(){
        setBackground(new Color(0,0,0,0));
        setPreferredSize(new Dimension(80,13));
        setLayout(new FlowLayout(FlowLayout.RIGHT,4,1));

        minimize.setPreferredSize(new Dimension(22, 12));
        maximize.setPreferredSize(new Dimension(22, 12));
        close.setPreferredSize(new Dimension(22, 12));
       
        //custom
        close.setColor(new Color(220, 32, 32));
        minimize.setColor(new Color(200, 220, 40 ));
        maximize.setColor(new Color(50, 200, 100 ));

        close.setColorOver(new Color(239,32,20,200));
        minimize.setColorOver(new Color(239,193,26,200));
        maximize.setColorOver(new Color(34,240,63,200));

        close.setColorClick(new Color(239,32,20,255));
        minimize.setColorClick(new Color(239,193,26,255));
        maximize.setColorClick(new Color(34,240,63,255));


        //fim

   
        add(minimize);
        add(maximize);
        add(close);

        action();
       

    }

    public void action(){
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              //Butao de maximizar
              MealMapper.closeWindow();
            }
            
        });

         maximize.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              //Butao de Minimizar
              MealMapper.maximizeWindow();
            }
            
        });
         
        minimize.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              //Butao de maximizar
              MealMapper.minimizeWindow();
            }
            
        });
    }
}