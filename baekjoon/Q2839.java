import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {

    private static int sum = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(br.readLine());

        int three_bag = 0;
        int five_bag = kg / 5;

        kg = kg % 5;
        while (five_bag >= 0) {
            if (kg % 3 == 0) {
                three_bag = kg / 3;
                sum = three_bag + five_bag;
                break;
            }
            five_bag--;
            kg += 5;
        }

        System.out.println(sum);
        br.close();
    }
}
