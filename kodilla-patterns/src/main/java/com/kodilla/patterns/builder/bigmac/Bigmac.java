package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {


    public String getBon() {
        return bon;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    private final String bon;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bon;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bon (String bom){
            this.bon = bom;
            return this;
        }

        public BigmacBuilder burgers (int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce (String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient (String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bon,burgers,sauce,ingredients);
        }
    }

    private Bigmac(String bon, int burgers, String sauce, List<String> ingredients) {
        this.bon = bon;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bon='" + bon + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

}
