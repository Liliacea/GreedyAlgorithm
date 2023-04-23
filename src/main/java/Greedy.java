import java.util.ArrayList;

public class Greedy {
    public static void main(String[] args) {
        int [] weights = {1,7,5,4,5};
        int[] prices = {5,4,8,9,7};
        int maxWeight = 13;
        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int resultWeight = 0;

        for (int i = 0; i < weights.length; i++) {
            indexes.add(i);
            }
        while (!indexes.isEmpty()){
            int maxValue = prices[indexes.get(0)];
            int maxIndex = indexes.get(0);
            for (int i = 1; i < indexes.size(); i++) {
                if(maxValue<prices[indexes.get(i)]){
                    maxValue = prices[indexes.get(i)];
                    maxIndex = indexes.get(i);
                }

            }
            resultWeight += weights[maxIndex];
            if(resultWeight>maxWeight){
                break;
            }
            result.add(maxIndex);
            indexes.remove(maxIndex);
        }
        System.out.println("оптимальное содержимое"); for (Integer integer : result) {
            System.out.println(integer + 1);
        }
    }
}
