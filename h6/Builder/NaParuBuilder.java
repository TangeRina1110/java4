package Asem4.h6.Builder;

public class NaParuBuilder implements Builder{
    Restaurant rest = new Restaurant();

    @Override
    public void BuildMeal() {
        rest.buildMeal("Полезное питание");
    }

    @Override
    public void SetDirector() {
        rest.setDirector("На пару");
    }

    @Override
    public Restaurant GetResult() {
        return rest;
    }
}
