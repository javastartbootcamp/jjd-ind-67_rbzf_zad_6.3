package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        ArrayCreator arrayCreator = new ArrayCreator();
        int row = arrayCreator.readRow();
        int column = arrayCreator.readColumn();
        int[][] array = arrayCreator.createArray(row, column);
        arrayCreator.fillInArray(array);
        arrayCreator.printArray(array);

    }
}
