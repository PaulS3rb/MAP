public class Punkt {

    int id;
    String name;
    String house;
    String autoritat;
    int points;

    public Punkt(int id, String name, String house, String autoritat, int points) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.autoritat = autoritat;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", house='" + house + '\'' +
                ", autoritat='" + autoritat + '\'' +
                ", points=" + points +
                '}';
    }


}
