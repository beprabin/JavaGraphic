/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputerGraphics;
import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author PRABIN
 */
public class Bresenhem extends Applet
{
    double x1=200,y1=100,x2=300,y2=500;
    double dx,dy,steps,x,y,j;
    double xc,yc;
    public void paint(Graphics g)
    {
    int ch=6;
    dx=Math.abs(x2-x1);
    dy=Math.abs(y2-y1);
    x=x1;
    y=y1;
    double p=(2*dy)-(dx);
    int i=1;
        one: for(j=10;ch==6;j++)
        {
            g.fillOval((int)x,(int)y,5,5);
            while(p>=0)
            {
                y=y+1;
                p=p-(2*dx);
            }
            x=x+1;
            p=p+(2*dy);
            i++;
            if(i<=dx)
            ch=6;
            else
            break one;
        }
    }
}