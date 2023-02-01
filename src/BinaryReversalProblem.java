public class BinaryReversalProblem {
    // my incorrect solution
//    public static String BinaryReversal(String str) {
//        // convert string to its binary representation
//        byte[] bytes = str.getBytes();
//        StringBuilder binary = new StringBuilder();
//        for (byte b : bytes) {
//            int val = b;
//            // pad it to the nearest n* 8 bits
//            for (int i=0; i < 8; i++) {
//                binary.append((val & 128) == 0 ? 0 : 1);
//                val <<= 1;
//            }
//            binary.append(" ");
//        }
//        // reverse the new string
//        // convert new string to decimal
//        // return new string
//        return "" + binary;
// }

    // Cole's Solution
    public static String BinaryReversal(String str) {
        // declare int variable  then change str to Integer
        int num = Integer.parseInt(str);
        //convert string to its binary representation
        String binary = Integer.toBinaryString(num);
        while (binary.length() % 8 != 0) {
            binary = "0" + binary;
        }
        //reverse the new string
        String reversed = new StringBuilder(binary).reverse().toString();
        int decimalString = Integer.parseInt(reversed, 2);
        // return new string
        return Integer.toString(decimalString);
    }

    public static void main(String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
        System.out.println(BinaryReversal(int num));
    }
}