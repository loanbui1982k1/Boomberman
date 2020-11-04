package uet.oop.bomberman.entities;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Bomber extends Entity {

    public Bomber() {

    }
    public Bomber(double x, double y, Image img) {
        super( x, y, img);
    }

    @Override
    public void update() {
       super.setX(x);
       super.setY(y);
       super.setImg(img);
    }

}
