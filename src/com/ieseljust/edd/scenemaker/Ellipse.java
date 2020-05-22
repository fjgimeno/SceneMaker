package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

import com.ieseljust.edd.scenemaker.Renderizable;

public class Ellipse implements Renderizable{
    /*
     * Aquesta classe representa un element gràfic de tipus Ellipse
     */

    private Integer x;
    private Integer y;
    private Color color;
    private Integer radi_X;
    private Integer radi_Y;

    // Constructors
    Ellipse() {
        // Constructor per defecte sense paràmetres
        this.x = 0;
        this.y = 0;
        this.radi_X = 100;
        this.radi_Y = 100;
        this.color = Color.BLACK;
    }

    Ellipse(int x, int y) {
        // Constructor on s'especifica només pa posició
        this.x = x;
        this.y = y;
        this.radi_X = 100;
        this.radi_Y = 100;
        this.color = Color.BLACK;
    };

    Ellipse(int x, int y, Color color) {
        // Constructor on s'especifica la posició i el color
        this.x = x;
        this.y = y;
        this.radi_X = 100;
        this.radi_Y = 100;
        this.color = color;
    }

    Ellipse(int x, int y, int radi_X, int radi_Y, Color color) {
        // Constructor on s'especifica la posició, el color i les dimensions
        this.x = x;
        this.y = y;
        this.radi_X = radi_X;
        this.radi_Y = radi_Y;
        this.color = color;
    }

    // Mètode Accessors

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("Ellipse " + x + " " + y + " " + radi_X + " " + color);
    };

    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */

        g.setColor(this.color);                                             // Establim el color interior
        g.fillOval (x - radi_X, y - radi_Y, radi_X * 2, radi_Y * 2);        // Dibuixem un Ellipse en la posició i mida indicades
    };

}