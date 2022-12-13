package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {

    public House(){

    }

    public void draw(DrawTool drawTool){
       // drawTool.drawRectangle(100,400,50,100);
       // drawTool.drawTriangle(100,400,150,400,125,350);
        drawTool.setCurrentColor(new Color(159, 225, 255));
        drawTool.drawFilledRectangle(0,3,1000000,200000);
        drawTool.drawRectangle(400,300,100,200);
        drawTool.drawTriangle(400,300,500,300,450,250);

        drawTool.setCurrentColor(new Color(175, 138, 117));
        drawTool.drawFilledRectangle(400,300,100,200);
        drawTool.setCurrentColor(new Color(59, 30, 18));
        drawTool.drawFilledTriangle(400,300,500,300,450,250);
        drawTool.setCurrentColor(new Color(245, 245, 245));
        drawTool.drawFilledRectangle(410,350,25,30);
        drawTool.drawFilledRectangle(465,350,25,30);
        drawTool.drawFilledRectangle(432,650,25,30);
        drawTool.setCurrentColor(new Color(54, 54, 54));
        drawTool.drawFilledRectangle(410,364,25,2);
        drawTool.drawFilledRectangle(465,364,25,2);
        drawTool.drawFilledRectangle(421,350,2,30);
        drawTool.drawFilledRectangle(476,350,2,30);
        drawTool.setCurrentColor(new Color(68, 116, 41));
        drawTool.drawFilledRectangle(0,500,800,300);
        drawTool.setCurrentColor(new Color(104, 60, 46));
        drawTool.drawFilledRectangle(440,460,20,40);
    }
}
