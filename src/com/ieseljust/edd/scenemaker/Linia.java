package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

import com.ieseljust.edd.scenemaker.Renderizable;

public class Linia extends Figura{
    /*
     * Aquesta classe representa un element gràfic de tipus Linia
     */
    private Integer x2;
    private Integer y2;

    // Constructors
    Linia() {
        // Constructor per defecte sense paràmetres
        this.x = 0;
        this.y = 100;
        this.color = Color.BLACK;
    }

    Linia(int x, int y) {
        // Constructor on s'especifica la posició inicial i final d'una linia
        this.x = x;
        this.y = y;
        this.color = Color.BLACK;
    }

    Linia(int x, int y, int x2, int y2, Color color) {
        // Constructor on s'especifica la posició inicial i final de dues linies
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    // Mètode Accessors

    public Integer getX2() {
        return x2;
    }

    public Integer getY2() {
        return y2;
    }

    @Override
    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("linia " + x + " " + y + " " + x2 + " " + y2);
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
        //System.out.println("HEY QUE ESTIC FENT UNA LINIA");
        g.setColor(this.color);             // Establim el color interior
        g.drawLine(x, y, x2, x2);    // Dibuixem dues Linies en la posició i mida indicades.
    };

}