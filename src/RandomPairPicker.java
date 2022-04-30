import java.util.*;

public class RandomPairPicker {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Abhirup");
        list.add("Aritra");
        list.add("Arundhati");
        list.add("Binay");
        list.add("Chirag");
        list.add("Joydeep");
        Collections.shuffle(list);

        System.out.println(list);
    }
}
