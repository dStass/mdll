public class Demo {
    public static void main(String[] args) {
        MDLL<String> mdll = new MDLL<String>();
        mdll.add(1, "One");
        mdll.add(2, "Two");

        // traversing
        String newString = "";
        for (String numString : mdll) {
            newString += numString;
        }

        // adding elements
        mdll.add(12, newString);

        // removing elements
        mdll.remove(1);

        // get size
        System.out.println(mdll.size());
    }
}