package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

import com.ieseljust.edd.scenemaker.Renderizable;

public class Linia implements Renderizable{
    /*
     * Aquesta classe representa un element gràfic de tipus Linia
     */

    private Integer x1;
    private Integer y1;
    private Integer x2;
    private Integer y2;

    // Constructors
    Linia() {
        // Constructor per defecte sense paràmetres
        this.x1 = 0;
        this.y1 = 100;
    }

    Linia(int x1, int y1) {
        // Constructor on s'especifica la posició inicial i final d'una linia
        this.x1 = x1;
        this.y1 = y1;
    }

    Linia(int x1, int y1, int x2, int y2) {
        // Constructor on s'especifica la posició inicial i final de dues linies
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Mètode Accessors

    public Integer getX1() {
        return x1;
    }

    public Integer getY1() {
        return y1;
    }

    public Integer getX2() {
        return x2;
    }

    public Integer getY2() {
        return y2;
    }

    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("Linia " + x1 + " " + y1 + " " + x2 + " " + y2);
    };

    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */

        g.fillRect(x1, y1, x2, x2);    // Dibuixem dues Linies en la posició i mida indicades.
    };

}