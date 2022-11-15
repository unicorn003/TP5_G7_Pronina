public class Main {
    public static void main(String[] args) {
       SortClass sortTest = new SortClass();
       sortTest.initialiserTableau();
       sortTest.triSelection(sortTest.copyTableau());
       sortTest.triInsertion(sortTest.copyTableau());
       sortTest.triBulles(sortTest.copyTableau());
       sortTest.quickSort(sortTest.copyTableau(),0,Integer.MAX_VALUE / 10000);
       sortTest.triJava(sortTest.copyTableau());
    }
}