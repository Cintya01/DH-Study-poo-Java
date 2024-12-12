public class Square extends GeometricFigure {

    private Double sideLenght;

    public Square (Double sideLenght){

        super(4);
        this.sideLenght = sideLenght;
    }

    @Override
    public Double calculatedArea() {
        return sideLenght * sideLenght;
    }
}
