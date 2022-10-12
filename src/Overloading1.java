class Overloading1
{
    public int calculateArea(int side)
    {
        return side * 2;
    }


    public int calculateArea(int length, int height)
    {
        return length * height;
    }


    public int calculateArea(int length, int width, int height)
    {
        return length * height * width;
    }
}


class Main
{
    public static void main(String[] YARRRRRRRGGGGSSSSSPIRATES)
    {
        Overloading1 square = new Overloading1();
        System.out.println(square.calculateArea(5));
        System.out.println(square.calculateArea(5, 6));
        System.out.println(square.calculateArea(5, 6, 7));

    }
}




































































/*



Create 1 class in which create a methods that will calculate the area (volume in case of box) of
        Rectangle
        Square
        Box

        Use separate class to test your code




*/






























