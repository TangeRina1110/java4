package Asem4.h6.Builder;

public class BKBuilder implements Builder{
    Restaurant rest = new Restaurant();

    @Override
    public void BuildMeal() {
        rest.buildMeal("Фастфуд");
    }

    @Override
    public void SetDirector() {
        rest.setDirector("Бургер Кинг");
    }

    @Override
    public Restaurant GetResult() {
        return rest;
    }
}