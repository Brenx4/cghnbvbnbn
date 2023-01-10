package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Christmastree extends GraphicalObject {

    public Christmastree() {



    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(55, 113, 23));
        drawTool.drawFilledTriangle(230,470,260,370,290,470);
        drawTool.setCurrentColor(new Color(99, 69, 44));
        drawTool.drawFilledRectangle(255,470,10,30);
        drawTool.setCurrentColor(new Color(255, 0, 0));
        drawTool.drawFilledCircle(245,460,5);
        drawTool.drawFilledCircle(255,420,5);
        drawTool.drawFilledCircle(280,460,5);
        drawTool.setCurrentColor(new Color(255, 215, 66));
        drawTool.drawFilledCircle(270,440,5);
        drawTool.drawFilledCircle(250,430,5);


    }
}


