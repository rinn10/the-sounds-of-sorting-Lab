package edu.grinnell.csc207.soundsofsorting.events;
import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T> {
    private int index1;
    private int index2;

    public SwapEvent(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        T tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
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
        return true;
    }
}
