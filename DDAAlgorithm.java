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
public class DDAAlgorithm extends Applet {
    public void paint(Graphics g){
    double dx,dy,steps,x,y,j;
    double xc,yc;
    double x1=20, y1=50, x2=60, y2=20;
    dx=x2-x1;
    dy=y2-y1;
    if(Math.abs(dx)>Math.abs(dy)){
        steps=Math.abs(dx);
    }
    else{
        steps=Math.abs(dy);
    }
    xc=dx/steps;
    yc=dy/steps;
    x=x1;
    y=y1;
    //g.fillOval(x,y,width,height);
    g.fillOval((int)x, (int)y, 5, 5);
    for(j=1;j<=steps;j++){
        x=x+xc;
        y=y+yc;
        g.fillOval((int)x, (int)y, 5, 5);
        System.out.println((int)y);
    }
    }
}
