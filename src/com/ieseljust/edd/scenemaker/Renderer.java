package com.ieseljust.edd.scenemaker;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

import java.util.ArrayList;

public class Renderer extends Canvas {
    /*
    Aquesta classe s'encarrega de generar els elements gràfics necessaris
    per tal de mostrar una finestra i dibuixar en ella l'escena.

    En principi, haurem de tocar poc d'aquest fitxer.

    */

    private static final long serialVersionUID = 1L;

    // Contingut de l'escena a dibuixar
    ArrayList<Rectangle> Scene;
    ArrayList<Quadrat> Scene;
    ArrayList<Linia> Scene;
    ArrayList<Ellipse> Scene;
    ArrayList<Cercle> Scene;
    Integer w, h;
    
    Renderer() {};  // Constructor buit

    Renderer(Integer x, Integer y) {
        // Constructor inicialitzant les dimensions
        w = x;
        h = y;
    };

    Renderer(ArrayList<Rectangle> Scene) {
        // Constructor passnt-li l'escena.
        this.Scene = Scene;
    };
    Renderer(ArrayList<Quadrat> Scene) {
        // Constructor passnt-li l'escena.
        this.Scene = Scene;
    };
    Renderer(ArrayList<Linia> Scene) {
        // Constructor passnt-li l'escena.
        this.Scene = Scene;
    };
    Renderer(ArrayList<Cercle> Scene) {
        // Constructor passnt-li l'escena.
        this.Scene = Scene;
    };
    Renderer(ArrayList<Ellipse> Scene) {
        // Constructor passnt-li l'escena.
        this.Scene = Scene;
    };

    int Render(ArrayList<Rectangle> Scene) {
        /*
        Crea el JFrame i el Canvas per dibuixar la
        imatge i mostrar-la per pantalla.
        */
        JFrame frame = new JFrame("SceneMaker");
        System.out.println(w + " " + h);
        Canvas canvas = new Renderer(Scene);
        canvas.setSize(w, h);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        repaint();
        return 1;
    }
    int Render(ArrayList<Quadrat> Scene) {
        /*
        Crea el JFrame i el Canvas per dibuixar la
        imatge i mostrar-la per pantalla.
        */
        JFrame frame = new JFrame("SceneMaker");
        System.out.println(w + " " + h);
        Canvas canvas = new Renderer(Scene);
        canvas.setSize(w, h);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        repaint();
        return 1;
    }
    int Render(ArrayList<Linia> Scene) {
        /*
        Crea el JFrame i el Canvas per dibuixar la
        imatge i mostrar-la per pantalla.
        */
        JFrame frame = new JFrame("SceneMaker");
        System.out.println(w + " " + h);
        Canvas canvas = new Renderer(Scene);
        canvas.setSize(w, h);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        repaint();
        return 1;
    }int Render(ArrayList<Cercle> Scene) {
        /*
        Crea el JFrame i el Canvas per dibuixar la
        imatge i mostrar-la per pantalla.
        */
        JFrame frame = new JFrame("SceneMaker");
        System.out.println(w + " " + h);
        Canvas canvas = new Renderer(Scene);
        canvas.setSize(w, h);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        repaint();
        return 1;
    }
    int Render(ArrayList<Ellipse> Scene) {
        /*
        Crea el JFrame i el Canvas per dibuixar la
        imatge i mostrar-la per pantalla.
        */
        JFrame frame = new JFrame("SceneMaker");
        System.out.println(w + " " + h);
        Canvas canvas = new Renderer(Scene);
        canvas.setSize(w, h);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        repaint();
        return 1;
    }

    // @Override
    public void paint(Graphics g) {
        /*
        Amb aquest mètode sobrecrivim el mètode `paint`per defecte de
        la classe "canvas".

        Dins d'ell, haurem d'invocar el mètode `render` de les figures
        que desitgem dibuixar.
        
        */
        if (Scene != null) {
            Scene.forEach((Rectangle) -> Rectangle.render(g));
            Scene.forEach((Quadrat) -> Quadrat.render(g));
            Scene.forEach((Linia) -> Linia.render(g));
            Scene.forEach((Cercle) -> Cercle.render(g));
            Scene.forEach((Ellipse) -> Ellipse.render(g));
        }
    }

}