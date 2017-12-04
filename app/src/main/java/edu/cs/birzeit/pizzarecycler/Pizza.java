package edu.cs.birzeit.pizzarecycler;

/**
 * Created by Tec on 11/20/2017.
 */

public class Pizza {
    private String name;
    private int imageID;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi),
            new Pizza("Diavolo2", R.drawable.diavolo),
            new Pizza("Funghi2", R.drawable.funghi),
    };
    private Pizza(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}
