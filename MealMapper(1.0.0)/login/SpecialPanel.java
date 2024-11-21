import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class SpecialPanel extends JPanel{
    public Color getborderColor() {
        return borderColor;
    }



    public void setborderColor(Color borderColor) {
        this.borderColor = borderColor;
    }



    private Color borderColor = Color.DARK_GRAY;

    SpecialPanel(){


    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getborderColor());
        g2d.fillRoundRect(0,0,getWidth(),getHeight(),0,0);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(2,2,getWidth()-4,getHeight()-4,0,0);
    }
}
