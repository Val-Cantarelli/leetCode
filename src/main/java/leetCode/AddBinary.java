package leetCode;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder("");
        int add1 = 0;

        int i = a.length()-1;
        int j = b.length()-1;

        while(i >=0 || j >=0 || add1!=0){

            int bitA = (i >= 0) ? (a.charAt(i) - '0') : 0;
            int bitB = (j >= 0) ? (b.charAt(j) - '0') : 0;
            int sum = bitA+ bitB + add1;
            i--;
            j--;

            if (sum == 0) {
                answer.append("0");
            } else if (sum == 1) {
                answer.append("1");
                add1 = 0;
            }else if (sum == 2) {
                answer.append("0");
                add1 = 1;
            } else if (sum == 3) {
                answer.append("1");
            }

        }

    return answer.reverse().toString();
    }


    public static void main(String[] args) {
        String a = "101", b="101";
        System.out.println(new AddBinary().addBinary(a,b));
    }
}
