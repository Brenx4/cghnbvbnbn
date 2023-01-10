package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class star extends GraphicalObject {

    public star(){


    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(189, 174, 26));
        drawTool.drawFilledPolygon(250,360,260,360,270,340,275,360,290,370,280,360);
    }
}
