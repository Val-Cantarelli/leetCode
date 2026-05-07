package leetCode.arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratePascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 1){
            List<List<Integer>> triangle = new ArrayList<>();
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);

            return triangle;
        }

        List<List<Integer>> triangle = generate(numRows-1);
        List<Integer> previous = triangle.getLast();
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);

        for(int i = 1; i < previous.size(); i++){
            int elem = previous.get(i-1)+previous.get(i);
            newRow.add(elem);
        }

        newRow.add(1);
        triangle.add(newRow);
        return triangle;
    }

    public static void main(String[] args) {
        GeneratePascalsTriangle solution = new GeneratePascalsTriangle();

        System.out.println(solution.generate(5));
    }

}
