package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

import com.ieseljust.edd.scenemaker.Renderizable;

public class Quadrat extends Figura{
    /*
     * Aquesta classe representa un element gràfic de tipus Quadrat
     */
    private Integer side;

    // Constructors
    Quadrat() {
        // Constructor per defecte sense paràmetres
        this.x = 0;
        this.y = 0;
        this.side = 100;
        this.color = Color.BLACK;
    }

    Quadrat(int x, int y) {
        // Constructor on s'especifica només pa posició
        this.x = x;
        this.y = y;
        this.side = 100;
        this.color = Color.BLACK;
    };

    Quadrat(int x, int y, Color color) {
        // Constructor on s'especifica la posició i el color
        this.x = x;
        this.y = y;
        this.side = 100;
        this.color = color;
    }

    Quadrat(int x, int y, int side, Color color) {
        // Constructor on s'especifica la posició, el color i les dimensions
        this.x = x;
        this.y = y;
        this.side = side;
        this.color = color;
    }

    @Override
    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("quadrat " + x + " " + y + " " + side + " " + color);
    };

    @Override
    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */

        g.setColor(this.color);             // Establim el color interior
        g.fillRect(x, y, side, side);    // Dibuixem un quadrat en la posició i mida indicades
    };

}