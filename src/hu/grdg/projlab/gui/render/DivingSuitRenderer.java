package hu.grdg.projlab.gui.render;

import hu.grdg.projlab.gui.ItemRenderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DivingSuitRenderer implements ItemRenderer {
    private BufferedImage divingSuitImage;

    public DivingSuitRenderer() {
        try {
            this.divingSuitImage = ImageIO.read(new File("img/DivingSuit.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @Override
    public void draw(Graphics2D g, boolean isTile) {
        g.setColor(Color.WHITE);
        g.fillRect(5,5,45,45);
        g.drawImage(divingSuitImage,5,5,45,45, null);
    }
}