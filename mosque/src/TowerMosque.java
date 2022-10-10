import java.util.ArrayList;
import java.util.List;

public class TowerMosque implements Observable {
    private List<Observer> muslims;
    private String newsMosque;

    public TowerMosque() {
        muslims = new ArrayList<>();
    }

    public void setNewsMosque(String news) {
        this.newsMosque = news;
        notifyMuslims();
    }

    @Override
    public void registerMuslims(Observer muslim) {
        muslims.add(muslim);
    }

    @Override
    public void removeMuslims(Observer muslim) {
        muslims.remove(muslim);
    }

    @Override
    public void notifyMuslims() {
        for (Observer muslim : muslims)
            muslim.update(newsMosque);
    }
}
