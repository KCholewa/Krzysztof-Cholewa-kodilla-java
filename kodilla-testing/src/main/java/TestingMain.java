import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {

    public static void main(String[] args) {

        ArrayList<Integer> fullList = new ArrayList<>();
        OddNumbersExterminator collection = new OddNumbersExterminator();

        fullList.add(8);
        fullList.add(15);
        fullList.add(25);
        fullList.add(30);

        collection.exterminate(fullList);
        }
    }

