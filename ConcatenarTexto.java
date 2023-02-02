import java.util.Arrays;

public class ConcatenarTexto {
    public static void main(String[] args) {
        String[] nombres = {"José", "Carlos", "Ruperto", "Humberto"
        };
        for (String nombre : nombres) {
            if (nombre.equals(nombres[3]))
                System.out.println(nombres[0] + " " + nombres[1] + " " + nombres[2] + " " + nombres[3]);


        }
    }
}
