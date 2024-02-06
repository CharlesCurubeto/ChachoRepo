package TryCatch;

public class TryCatch {
    public static void main(String[] args) {

        try {
            int i = 10;
            System.out.println("Before division");
            System.out.println(i / 2);
        }
        catch (Throwable t){
            System.out.println(t.getMessage());
            System.out.println(t.getCause());
            t.printStackTrace();
        }

        finally {
            System.out.println("This is the finally block");
        }


        System.out.println("After division");

    }
}
