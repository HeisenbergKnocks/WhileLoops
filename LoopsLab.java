* Name:
 * Section: 
 */

import java.awt.*;
import java.applet.*;


public class LoopsLab extends Applet
{

	public void paint(Graphics g)
	{
		this.setSize(800, 600); //canvas width and height
		g.drawLine(0,300,800,300);
		g.drawLine(400,0,400,600);

		int i = 0;
		while(i < 100) {
			
			//x and y values for two endpoints
			int x1 = (int) (Math.random() * (399-1+1));
			int x2 = (int) (Math.random() * (399-1+1));
			int y1 = (int) (Math.random() * (299-1+1));
			int y2 = (int) (Math.random() * (299-1+1));
			
			int r = (int) (Math.random() * (255+1));
			int gr = (int) (Math.random() * (255+1));
			int b = (int) (Math.random() * (255+1));
			
			//colors
			g.setColor(new Color(r, gr, b));
			
			//draw the lines
			g.drawLine(x1, y1, x2, y2);
			
			i++;
			
		}
		
		i = 0;
		while(i < 100) {
			
			//x and y values for endpoints
			int w = 50;
			
			int xs = 401 + (int) (Math.random() * (350));
			int ys = (int) (Math.random() * (249));
			
			int r = (int) (Math.random() * (255));
			int gr = (int) (Math.random() * (255));
			int b = (int) (Math.random() * (255));
			
			//colors
			g.setColor(new Color(r, gr, b));
			
			//draw squares
			g.fillRect(xs, ys, w, w);
			
			i++;
		}

		i = 0;
		while(i < 100) {
			int d = (int) (Math.random() * (200+1));
			
			//x and y values for the circle
			
			int xc = (int) (Math.random() * (199+1));
			int yc = 301 + (int) (Math.random() * (99+1));
			
			int r = (int) (Math.random() * (255+1));
			int gr = (int) (Math.random() * (255+1));
			int b = (int) (Math.random() * (255+1));
			
			
			//colors
			g.setColor(new Color(r, gr, b));
			
			//draw circles
			g.drawOval(xc, yc, d, d);
			
			i++;
			
		}
		
	}

}
