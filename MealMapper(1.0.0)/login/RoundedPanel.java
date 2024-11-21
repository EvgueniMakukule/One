import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {

  private Color borderColor = Color.GRAY;
  private int borderThickness=1; 
  private int radious = 23;
  RoundedPanel(){
    setOpaque(false);
    
  }  
  RoundedPanel(int borderThickness){
    this.borderThickness=borderThickness;
    setOpaque(false);
   
    }

 public Color getBorderColor() {
	return borderColor;}

public void setBorderColor(Color borderColor) {
	this.borderColor = borderColor;}

public int getBorderThickness() {
	return borderThickness;}

public void setBorderThickness(int borderThickness) {
	this.borderThickness = borderThickness;}

      public int getRadious() {
      return radious;
    }
    public void setRadious(int radious) {
      this.radious = radious;
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        
        Graphics2D g2 =(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBorderColor());
        g2.fillRoundRect(0,0,getWidth(),getHeight(),getRadious(),getRadious());
        g2.setColor(getBackground());
        g2.fillRoundRect(getBorderThickness(),getBorderThickness(),getWidth()-getBorderThickness()*2, getHeight()-getBorderThickness()*2,getRadious()-3,getRadious()-3);
        super.paintComponent(g);
    }


     
}
