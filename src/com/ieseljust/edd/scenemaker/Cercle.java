package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

import com.ieseljust.edd.scenemaker.Renderizable;

public class Cercle implements Renderizable{
    /*
     * Aquesta classe representa un element gràfic de tipus Cercle
     */

    private Integer x;
    private Integer y;
    private Color color;
    private Integer radi;

    // Constructors
    Cercle() {
        // Constructor per defecte sense paràmetres
        this.x = 0;
        this.y = 0;
        this.radi = 100;
        this.color = Color.BLACK;
    }

    Cercle(int x, int y) {
        // Constructor on s'especifica només pa posició
        this.x = x;
        this.y = y;
        this.radi = 100;
        this.color = Color.BLACK;
    };

    Cercle(int x, int y, Color color) {
        // Constructor on s'especifica la posició i el color
        this.x = x;
        this.y = y;
        this.radi = 100;
        this.color = color;
    }

    Cercle(int x, int y, int radi, Color color) {
        // Constructor on s'especifica la posició, el color i les dimensions
        this.x = x;
        this.y = y;
        this.radi = radi;
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
        System.out.println("Cercle " + x + " " + y + " " + radi + " " + color);
    };

    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */

        g.setColor(this.color);                                 // Establim el color interior
        g.fillOval (x - radi, y - radi, radi * 2, radi * 2);    // Dibuixem un Cercle en la posició i mida indicades
    };

}