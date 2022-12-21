package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Balloon extends GraphicalObject{

    public Balloon(double xPos, double yPos, double r){


        x = xPos;
        y = yPos;
        radius = r;

    }


    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawLine(x,y+120,x+4,y);
        drawTool.setCurrentColor(new Color(248, 34, 34));
        drawTool.drawFilledTriangle(x,y,x-5,y+20,x+10,y+20);
        drawTool.drawFilledCircle(x,y,radius);
    }

    public void update ( double dt ){
        x = x + 50*dt;
        y = y - (Math.random()*50)*dt;
    }
}