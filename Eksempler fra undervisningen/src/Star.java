public class Star extends Shape{


    public Star(String color)
    {
        super(color);
    }

    @Override
    public void redraw()
    {
        System.out.println("* in color " + getC());
    }

}
