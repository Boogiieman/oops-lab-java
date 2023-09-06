import java.awt.*;
import java.applet.*;
public class Shapes extends Applet
{
public void init()
{
}
public void paint(Graphics g )
{
g.drawLine(20,20,200,20);
g.drawRect(20,60,200,40);
g.drawOval(20,120,200,100);
}
}
/*
<applet code="Shapes.class" width=300 height=300></applet>
*/
