package java_week8_homework.programme_17_carpet_cost_calculator;

public class Calculator {

    public Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
}
}
