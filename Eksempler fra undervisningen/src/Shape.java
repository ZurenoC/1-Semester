public class Shape {

    private String c;

    public  Shape(String color)
    {
        this.c = color;
    }

    public void redraw()
    {
        System.out.println("Drawing Shape with color " + c);
    }

    public String getC()
    {
return c;
    }




}
