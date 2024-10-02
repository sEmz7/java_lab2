package main;

import java.util.Objects;

public class WashingMachine {
    private String linentype = "неопределен";
    private int temperature;
    private int max_linenWeight;
    private int loadedWeight = 0;


    public WashingMachine(int temperature, int weight) {
        this.temperature = temperature;
        this.max_linenWeight = weight;
    }


    public String Load(String linentype, int linenWeight) {
        if (loadedWeight + linenWeight > max_linenWeight) {
            return "Превышена максимальная вместимость стиралки";
        }
        else if (Objects.equals(this.linentype, "неопределен")) {
            this.linentype = linentype;
            this.loadedWeight = linenWeight;
            return "Загружено белье типа " + linentype + " массой " + linenWeight + "кг. Текущая масса " + loadedWeight + "кг";
        }
        else if (Objects.equals(linentype, this.linentype)) {
            this.loadedWeight += linenWeight;
            return "Добавлено белье типа " + linentype + " массой " + linenWeight + "кг. Текущая масса " + loadedWeight + "кг";
        }
        else {
            return "В стиралке уже загружено белье другого типа";
        }
    }


    @Override
    public String toString() {
        return "Стиральная машина загружена на " + loadedWeight + "кг. Тип белья " + linentype;
    }
}
