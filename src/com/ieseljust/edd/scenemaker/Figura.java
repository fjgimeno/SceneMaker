package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

import com.ieseljust.edd.scenemaker.Renderizable;

public class Figura implements Renderizable{
    /*
     * Aquesta classe representa un element gràfic.
     */
    protected Integer x;
    protected Integer y;
    protected Color color;

    // Constructors
    // No tinc clar que fera falta posar constructors, pero els he deixat igualment.
    Figura() {
        // Constructor per defecte sense paràmetres
        this.x = 0;
        this.y = 0;
        this.color = Color.BLACK;
    }
    Figura(int x, int y) {
        // Constructor on s'especifica només la posició
        this.x = x;
        this.y = y;
        this.color = Color.BLACK;
    };
    Figura(int x, int y, Color color) {
        // Constructor on s'especifica la posició i el color.
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Mètode Accessors

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println(figura + x + " " + y + " " + color);
    };

    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */

        g.setColor(this.color);             // Establim el color interior
        g.fillRect(x, y, 5, 5);    // Dibuixem un rectangle en la posició i mida indicades

    };

}
