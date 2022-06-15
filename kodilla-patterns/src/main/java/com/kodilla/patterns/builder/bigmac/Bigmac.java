package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();


    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            bun = bun.toUpperCase();
            if (bun.equals(Bun.BUN.name())
                    || bun.equals(Bun.ROLL.name())
            ) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Wrong bun");
            }
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            sauce = sauce.toUpperCase();
            if (sauce.equals(Sauce.STANDARD.name())
                    || sauce.equals(Sauce.THOUSAND_ISLAND.name())
                    || sauce.equals(Sauce.BARBECUE.name())
            ) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Wrong sauce");
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredient = ingredient.toUpperCase();
            if (ingredient.equals(Ingredients.LETTUCE.name())
                    || ingredient.equals(Ingredients.ONION.name())
                    || ingredient.equals(Ingredients.BACON.name())
                    || ingredient.equals(Ingredients.CUCUMBER.name())
                    || ingredient.equals(Ingredients.CHILLI_PEPPER.name())
                    || ingredient.equals(Ingredients.SHRIMPS.name())
                    || ingredient.equals(Ingredients.CHEESE.name())
            ) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Wrong ingredient");
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
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

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
