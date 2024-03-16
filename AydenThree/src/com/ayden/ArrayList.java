package com.ayden;

/***
 * it can append things
 * it has negative positions
 * it can remove things
 * You can check if something is inside the list
 * taking a certain position of the list
 */
public class ArrayList extends List{

    // member variables
    private int[] array = new int[9];
    public ArrayList() {

    }
    public ArrayList(int[] array) {
        this.array = array;
    }

    @Override
    public void append(int num) {
        if (size < array.length) {
            array[size] = num;
            size++;
            return;
        }

        System.out.println("Making new array");
        int[] temp = new int[array.length+10];
        int last_pos = array.length;
        for(int i = 0; i <array.length; i++){
            temp[i] = array[i];
        }
        temp[last_pos] = num;

        array = temp;



    }


    public void printList() {
        for(int i=0; i< size; i++ ) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("");
    }

    /**
     *  Get the element at position pos.
     *  If pos is negative, get the number from the back of the list
     **/
    @Override
    public int get(int pos){
        if(pos<0){
            int negativeSize = size + pos;
            if (negativeSize < 0) {
                throw new IndexOutOfBoundsException("Pos is out of bounds");
            }
            return array[negativeSize];
        }

        if (pos > size) {
            throw new IndexOutOfBoundsException("Pos is out of bounds");
        }

        return array[pos];
    }


    // 1,2,3,4,5,6,7,8
    // 1,2,3,5,5,6,7,8,0
    // 1,2,3,5,6,6,7,8,0
    // 1,2,3,5,6,7,7,8,0
    // 1,2,3,5,6,7,8,8,0
    // 1,2,3,5,6,7,8,0,0
    @Override
    public void remove(int pos) {
        if(pos>size)
            throw new IndexOutOfBoundsException("Pos is out of bounds");
        for(int i=pos;i<size;i++){
            array[i] = array[i+1];
        }
        size--;
    }

    // a = 10;
    // check if 10 is in the array
    @Override
    public boolean has(int a){
        for(int i=0; i<size;i++){
            if (array[i] == a){
                return true;
            }
        }


        return false;
    }

    private void superSecret() {
        System.out.println("No one should be able to call me");
    }














}
