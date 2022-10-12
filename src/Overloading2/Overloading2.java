package Overloading2;


class Overloading2
{
    static void doSomething()
    {
        System.out.println("Something");
    }

    static void doSomething(String idk)
    {
        System.out.println("Something " + idk);
    }

    static void doSomething(String irdk, String irrdk)
    {
        System.out.println("Something " + irdk + " " + irrdk);
    }

    public static void main(String[] args)
    {
        doSomething();
        doSomething("else");
        doSomething("else", "errrblah");

    }
}