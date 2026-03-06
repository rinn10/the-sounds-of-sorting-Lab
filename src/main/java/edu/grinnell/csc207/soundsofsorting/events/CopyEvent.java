package edu.grinnell.csc207.soundsofsorting.events;
import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent<T>{
    private int index;
    private T value;

    public CopyEvent(int index, T value) {
        this.index = index;
        this.value = value;
    }

    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        arr[index] = value;
    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices() {
        List<Integer> lst = new ArrayList<>();
        lst.add(index);
        return lst;
    }

    /**
     * @return <code>true</code> iff this event is emphasized
     */
    public boolean isEmphasized() {
        return true;
    }
}
