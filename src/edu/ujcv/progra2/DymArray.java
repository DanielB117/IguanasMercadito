package edu.ujcv.progra2;

public class DymArray <T>implements Lista<T> {

    private T[] mItems;
    int mSize;


    public DymArray() {
        this.mItems = (T[]) new  Object[40];
        mSize = 0;
    }

    private void grow() {

        // E[] arr = (E[])new Object[INITIAL_ARRAY_LENGTH];
        T[] temp = (T[]) new  Object[mItems.length * 2];
        for (int i = 0; i < mItems.length; i++) {
            temp[i] = mItems[i];
        }
        mItems = temp;
    }

    public void add(T data) {
        if(mSize >= mItems.length){
            grow();
        }
        mItems[mSize] = data;
        mSize++;
    }


    public boolean isEmpty() {
        return false;
    }

    public T remove(int index) {
        if(index >= mSize)
            return null;
        T retval = mItems[index];


        for (int i = index + 1; i < mSize ; i++) {
            mItems[i-1] = mItems[i];
        }
        mSize--;
        return retval;
    }

    public T getItem(int index) {
        return mItems[index];
    }

    public int getSize() {
        return mSize;
    }
}