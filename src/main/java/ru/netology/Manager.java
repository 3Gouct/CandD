package ru.netology;

public class Manager {

    private int limit = 10;
    private int newLimit;

    public Manager() {

    }

    public Manager(int newLimit) {
        this.newLimit = newLimit;
    }

    private MoviesItem[] items = new MoviesItem[0];

    public void add(MoviesItem item) {
        int length = items.length + 1;
        MoviesItem[] tmp = new MoviesItem[length];
        System.arraycopy (items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MoviesItem[] findAll() {
        return items;
    }

    public MoviesItem[] findLast() {
        int resultLength;
        if (newLimit < limit) {
            resultLength = newLimit;
        } else {
            resultLength = limit;
        }
        MoviesItem[] result = new MoviesItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}