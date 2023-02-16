import java.util.*;

/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке
 * с повторениями. Вывести название каждой планеты и количество его повторений
 * в списке.
 */

public class Task132 {
    public static void main(String[] args) {
        ArrayList<String> randPlanets = new ArrayList<>();
        randFillList(20, randPlanets);
        System.out.println(randPlanets.toString());

        int count = 1;

        randPlanets.sort(null);

        for (int i = 1; i < randPlanets.size(); i++) {
            if (randPlanets.get(i - 1).equals(randPlanets.get(i))) {
                count ++;
            }
            else {
                System.out.println(randPlanets.get(i - 1) + " " + count);
                count = 1;
            }
        }
    }

    public static void randFillList(int count, ArrayList<String> list) {
        Random rand = new Random();
        String[] planets = {
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune"
        };
        for (int i = 0; i < count; i++) list.add(planets[rand.nextInt(planets.length)]);
    }
}
