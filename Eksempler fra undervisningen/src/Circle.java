public class Circle extends Shape {


    public Circle(String color)
    {
        super(color);
    }



    @Override
    public void redraw()
    {
        System.out.println("o with the color " + getC());
    }

    public void lilleMetode()
    {
        System.out.println("Årrhh, lilleMetode");
    }

}
