import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BodyLeftPanel extends JPanel {
   JPanel info = new JPanel();
   JPanel user_info=new JPanel();
     JLabel user = new JLabel("User:");
        JLabel user_name = new JLabel("Sunday Eam");
    BodyLeftPanel(){
        setLayout(new BorderLayout());
        setBackground(new Color(0,0,0,0));
        init();
        user_infoConfig();
        add(new DashBord(),BorderLayout.CENTER );
      
    }
    private void init(){
           
            info.setBackground(new Color(0,0,0,0));
            info.setPreferredSize(new Dimension(120,100));
            info.setLayout(new FlowLayout(FlowLayout.CENTER));
            info.add(new JLabel(""));
            add(info,BorderLayout.SOUTH);
    }

    public void user_infoConfig(){
            user_info.setBackground(new Color(0,0,0,0));
            user_info.setPreferredSize(new Dimension(120,100));
            user_info.setBorder(BorderFactory.createEmptyBorder(10,5,10,0));
            user_info.setLayout(new BoxLayout(user_info,BoxLayout.Y_AXIS));

            user_info.add(user);
            user_info.add(Box.createVerticalStrut(10));
            user_info.add(user_name);

            add(user_info,BorderLayout.NORTH);
    }
}
