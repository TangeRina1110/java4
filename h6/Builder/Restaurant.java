package Asem4.h6.Builder;

public class Restaurant {
    private String meal;
    private String director;

    public void buildMeal(String meal) {
        this.meal = meal;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void print() {
        System.out.println("Ресторан " + director + " в меню " + meal);
    }
}
