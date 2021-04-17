
public class Section {
    private double coordinateX1;
    private double coordinateX2;
    private double coordinateY1;
    private double coordinateY2;
    private String color;

    public double getCoordinateX1() {
        return coordinateX1;
    }

    public void setCoordinateX1(double coordinateX1) {
        this.coordinateX1 = coordinateX1;
    }

    public double getCoordinateX2() {
        return coordinateX2;
    }

    public void setCoordinateX2(double coordinateX2) {
        this.coordinateX2 = coordinateX2;
    }

    public double getCoordinateY1() {
        return coordinateY1;
    }

    public void setCoordinateY1(double coordinateY1) {
        this.coordinateY1 = coordinateY1;
    }

    public double getCoordinateY2() {
        return coordinateY2;
    }

    public void setCoordinateY2(double coordinateY2) {
        this.coordinateY2 = coordinateY2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Section(double coordinateX1, double coordinateX2, double coordinateY1, double coordinateY2, String color) {
        this.coordinateX1 = coordinateX1;
        this.coordinateX2 = coordinateX2;
        this.coordinateY1 = coordinateY1;
        this.coordinateY2 = coordinateY2;
        this.color = color;
    }

    public boolean isEqual(Section section1) {
        double distance = section1.getDistance();
        double distance1 = this.getDistance();
        if (distance == distance1) {
            return true;
        }
        return false;
    }

    private double getDistance() {
        return Math.sqrt((coordinateX2 - coordinateX1) *
                (coordinateX2 - coordinateX1) + (coordinateY2 - coordinateY1) * (coordinateY2 - coordinateY1));
        //почему подчеркнул все даблы?
    }
}


