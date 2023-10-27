package com.proftelran.org.homeworkseven;

import java.util.Iterator;

        //Это смог сделать только с помощью ChatGPT. Напишите, плиз, как правильно надо был сделать)

public class MyPrivateIterator implements Iterator<Integer> {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 16, 47};

        MyPrivateIterator myPrivateIterator = new MyPrivateIterator(numbers);
        while (myPrivateIterator.hasNext()){
            System.out.println(myPrivateIterator.next());
        }
    }

    private int[] integers;
    private  int pos;

    public MyPrivateIterator(int[] integers) {
        this.integers = integers;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < integers.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return integers[pos++];
    }
}
