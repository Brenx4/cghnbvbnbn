package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class baum extends GraphicalObject {

    public baum() {

    }
    public void draw(DrawTool drawTool) {
        drawTool.drawRectangle(100, 400, 50, 100);
        drawTool.drawTriangle(100, 400, 150, 400, 125, 350);

    }}
