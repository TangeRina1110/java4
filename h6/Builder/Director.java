package Asem4.h6.Builder;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void Construct() {
        builder.BuildMeal();
        builder.SetDirector();
    }
}