package Prueba;

// esta clase se relaciona con la clase CreateBox
public class Common {

    private int length;
    private int width;
    private int height;

    public void setBoxDimension(int l, int w, int h) {
        if (l > 0 && w > 0 && h > 0) {
            System.out.println("Box created with dimensions " + l + " " + w + " " + h + " ");
        } else {
            System.out.println("Invalid dimensions");
        }
    }

    public int setLength(int l) {

        if (l > 0)
        {
            length = l;
        }
        else
        {
            System.out.println("Invalid length");
        }
            return length;
    }

    public int setWidth(int w) {
        if (w > 0)
        {
        width = w;
        }
        else
        {
            System.out.println("Invalid width");
        }
        return width;
    }

    public int setHeight(int h) {

        if (h > 0)
        {
        height = h;}
        else {
            System.out.println("Invalid height");
        }
        return height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {

    }
}
