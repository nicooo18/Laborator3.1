import ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class Main
{
    public static void main(String[] args)
    {
        PasswordMaker pm = PasswordMaker.getInstance();
        System.out.println("Parola generata : " + pm.getPassword());
    }
}