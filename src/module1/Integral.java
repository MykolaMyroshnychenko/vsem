package module1;

/**
 * @version 1.0.0
 * @autor Mykola Myroshnychenko
 * @project myr.vsem
 * @class Integral
 * @since 11.03.2021 - 12.22
 */
public class Integral {

public static double getIntegral(int secant){
        double start = 0;
        double finish = Math.PI;
        int steps = 1000;
        double step = (finish - start) / steps;
        double area = 0;
        double height = 0;

    for (int i = 0; i < steps; i++) {
        if (Math.sin(i * step) < 0.1 * secant) {
            height = Math.sin(i * step);
        } else
            height = 0.1 * secant;
        double currentArea = height * step;
        area = area + currentArea;
    }

        return area;


}
    public static void main(String[] args) {
        System.out.println(getIntegral(8));

    }
}

//result 1.8296002917686307

