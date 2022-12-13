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
        drawTool.drawLine(150,420,154,300);
        drawTool.setCurrentColor(new Color(248, 34, 34));
        drawTool.drawFilledTriangle(150,300,145,320,160,320);
        drawTool.drawFilledCircle(x,y,radius);







}}


