public class Muslim implements Observer{
    private String name;

    public Muslim(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + "'s notification: " + news);
    }
}
