public class main {

    public static void fillBidimentional(Integer[][] bidimentionalArray) {
        for (int i = 0; i < bidimentionalArray.length; i++) {
            for (int j = 0; j < bidimentionalArray[i].length; j++) {
                bidimentionalArray[i][j] = i * 5 + j + 1;
            }
        }
    }

    public static String printBidimentionalArray(Integer[][] bidimentionalArray) {
        String arrayString = "";
        for (int i = 0; i < bidimentionalArray.length; i++) {
            arrayString += "Line " + (i + 1) + "\n";
            for (int j = 0; j < bidimentionalArray[i].length; j++) {
                arrayString += bidimentionalArray[i][j] + " ";
            }
            arrayString += "\n";
            arrayString += "\n";
        }
        return arrayString;
    }

    public static void main(String[] args) {
        Integer[][] intArray = new Integer[5][5];
        fillBidimentional(intArray);
        System.out.println(printBidimentionalArray(intArray));
    }
}