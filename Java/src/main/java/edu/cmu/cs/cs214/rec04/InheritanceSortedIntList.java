package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Angel Nyaga
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation

    public InheritanceSortedIntList(){
        super(); //Check!!!! 
        this.totalAdd = 0;
    }

    @Override
    boolean add(int newNum){
        boolean addResult = super.add(newNum);
        if(addResult){
            this.totalAdd++;
            return true;
        } return false;
    }

    @Override
    boolean addAll(IntegerList list){
        boolean addAllResult = super.addAll(list);
        if(addAllResult) return true;
        return false;
    }

    int getTotalAdded(){
        return this.totalAdd;
    }
}