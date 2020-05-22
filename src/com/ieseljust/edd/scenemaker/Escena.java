package com.ieseljust.edd.scenemaker;

import java.util.ArrayList;

class Escena {
    /*
     * Aquesta classe representa una escena, entesa com un conjunt d'objectes que
     * formen una imatge.
     * 
     * L'escena tindrà unes dimensions, que determinaran el marc per dibuixar
     * posteriorment.
     */

    private int tamX;
    private int tamY;

    // Les figures de l'escena s'emmagatzemen en una llista
    private ArrayList<Rectangle> LlistaFigures;
    private ArrayList<Cercle> LlistaCercles;
    private ArrayList<Ellipse> LlistaEllipses;
    private ArrayList<Linia> LlistaLinies;
    private ArrayList<Quadrat> LlistaQuadrats;

    Escena() {
        // Constructor. Pr defecte creem un tamany de 800x600;
        this.tamX = 800;
        this.tamY = 600;

        // Inicialitzem la llista de figures
        LlistaFigures = new ArrayList<Rectangle>();
        LlistaCercles = new ArrayList<Cercle>();
        LlistaEllipses = new ArrayList<Ellipse>();
        LlistaLinies = new ArrayList<Linia>();
        LlistaQuadrats = new ArrayList<Quadrat>();

    }

    Escena(int x, int y) {
        // Constructor (sobrecarregat), quan se'ns indica
        // un tamany per al marc.
        this.tamX = x;
        this.tamY = y;

        // Inicialitzem la llista de figures
        LlistaFigures = new ArrayList<Rectangle>();
        LlistaCercles = new ArrayList<Cercle>();
        LlistaEllipses = new ArrayList<Ellipse>();
        LlistaLinies = new ArrayList<Linia>();
        LlistaQuadrats = new ArrayList<Quadrat>();
    }

    // Mètodes accessors
    int getX() {
        return this.tamX;
    }

    int getY() {
        return this.tamY;
    }

    void setX(int x) {
        this.tamX = x;
    }

    void setY(int y) {
        this.tamY = y;
    }

    public void add(Rectangle figura) {
        /*
         * Aquest mètode afig un objecte de tipus Rectangle a l'escena.
         */

        // Comprovem que la figura cau dins la imatge
        if (figura.getX() < this.tamX && figura.getY() < this.tamY) {
            this.LlistaFigures.add(figura);
            System.out.println("\u001B[32m OK \u001B[0m");
        } else {
            // En cas contrari, mostrem l'error
            System.out.println("\u001B[31m La imatge cau fora de l'escena. \u001B[0m");
        }
    }

    public void add(Quadrat figura) {
        /*
         * Aquest mètode afig un objecte de tipus Rectangle a l'escena.
         */

        // Comprovem que la figura cau dins la imatge
        if (figura.getX() < this.tamX && figura.getY() < this.tamY) {
            this.LlistaFigures.add(figura);
            System.out.println("\u001B[32m OK \u001B[0m");
        } else {
            // En cas contrari, mostrem l'error
            System.out.println("\u001B[31m La imatge cau fora de l'escena. \u001B[0m");
        }
    }

    public void add(Cercle figura) {
        /*
         * Aquest mètode afig un objecte de tipus Rectangle a l'escena.
         */

        // Comprovem que la figura cau dins la imatge
        if (figura.getX() < this.tamX && figura.getY() < this.tamY) {
            this.LlistaFigures.add(figura);
            System.out.println("\u001B[32m OK \u001B[0m");
        } else {
            // En cas contrari, mostrem l'error
            System.out.println("\u001B[31m La imatge cau fora de l'escena. \u001B[0m");
        }
    }

    public void add(Ellipse figura) {
        /*
         * Aquest mètode afig un objecte de tipus Rectangle a l'escena.
         */

        // Comprovem que la figura cau dins la imatge
        if (figura.getX() < this.tamX && figura.getY() < this.tamY) {
            this.LlistaFigures.add(figura);
            System.out.println("\u001B[32m OK \u001B[0m");
        } else {
            // En cas contrari, mostrem l'error
            System.out.println("\u001B[31m La imatge cau fora de l'escena. \u001B[0m");
        }
    }

    public void add(Linia figura) {
        /*
         * Aquest mètode afig un objecte de tipus Rectangle a l'escena.
         */

        // Comprovem que la figura cau dins la imatge
        if (figura.getX1() < this.tamX && figura.getY1() < this.tamY && figura.getX2() < this.tamX && figura.getY2() < this.tamY) {
            this.LlistaFigures.add(figura);
            System.out.println("\u001B[32m OK \u001B[0m");
        } else {
            // En cas contrari, mostrem l'error
            System.out.println("\u001B[31m La imatge cau fora de l'escena. \u001B[0m");
        }
    }

    public void renderText() {
        /* Mostra la llista de figures i les seues propietats */

        // Recorrem la llista de figures i invoquem
        // el mètode describeMe de cadascuna d'elles.
        for (Rectangle f : this.LlistaFigures) {
            f.describeMe();
        }
        for (Quadrat : this.LlistaQuadrats) {
            f.describeMe();
        }
        for (Cercle f : this.LlistaCercles) {
            f.describeMe();
        }
        for (Ellipse f : this.LlistaEllipses) {
            f.describeMe();
        }
        for (Linia f : this.LlistaLinies) {
            f.describeMe();
        }
    }

    public void renderScene() {
        /*
         * Aquest mètode s'encarrega de dibuixar l'escena. Per a això, crearà un objecte
         * de la classe renderer, que s'inicialitza amb les dimensions de la imatge, i
         * seguidament, li proporciona la llista de figures que es volen dibuixar.
         * Aquest mètode Render de la classe Renderer ja s'encarregarà de crear la
         * imatge, i invocar al mètode `render` de cada rectangle per tal que es dibuixe
         * en l'àrea de dibuix.
         */

        Renderer dr = new Renderer(this.tamX, this.tamY);
        dr.Render(LlistaFigures);

    };

}
