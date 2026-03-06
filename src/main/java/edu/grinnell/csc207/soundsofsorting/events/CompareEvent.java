package edu.grinnell.csc207.soundsofsorting.events;
import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {
    private int index1;
    private int index2;

    public CompareEvent(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }
    
    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        return;
    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices() {
        List<Integer> lst = new ArrayList<>();
        lst.add(index1);
        lst.add(index2);
        return lst;
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    public boolean isEmphasized() {
        return false;
    }
}


