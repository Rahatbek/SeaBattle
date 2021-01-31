public class Player {

    Field field;
    String name;

    public Player(String name, Field field) {
        this.field = field;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "field=" + field +
                ", name='" + name + '\'' +
                '}';
    }
}
