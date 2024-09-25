import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
//    Skapa en klass Matratt
// den ska ha ett namn, pris, typ, antal kalorier
// Typ kan man tänka sig Vegetarisk, Vegansk, Kött
// Skapa upp några från main och lägg i en List.
// Skriv ut en dagens lunchmeny!
// Tips, tänk Listor och exemplet HockeyPlayer vi hade.

        ArrayList<Dish> dishes = new ArrayList<>();   

        Dish mat1 = new Dish();
        mat1.setName("Pannkakor");
        mat1.setCalories(20);
        mat1.setPrice(99);
        mat1.setTyp("Vegetarisk");
        
        dishes.add(mat1);

        Dish mat2 = new Dish();
        mat2.setName("Köttsoppa");
        mat2.setCalories(200);
        mat2.setPrice(55);
        mat2.setTyp("Kött");
        
        dishes.add(mat2);

        for (Dish dish : dishes) {
            System.out.println(dish.getName());
        }




    }
}
