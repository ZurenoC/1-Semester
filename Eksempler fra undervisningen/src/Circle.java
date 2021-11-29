public class Circle extends Shape {


    public Circle(String color)
    {
        super(color);
    }


//hej d
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
