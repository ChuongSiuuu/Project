package Office;

public class Position {
    private int Pos_id;
    private String name;

    public Position() {
    }

    public Position(int pos_id, String name) {
        Pos_id = pos_id;
        this.name = name;
    }

    public int getPos_id() {
        return Pos_id;
    }

    public void setPos_id(int pos_id) {
        Pos_id = pos_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position[" +
                "Pos_id=" + Pos_id +
                ", name='" + name + '\'' +
                ']';
    }
}
