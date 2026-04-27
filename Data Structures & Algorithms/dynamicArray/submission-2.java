class DynamicArray {

    Integer[] array; 

    public DynamicArray(int capacity) {
        array = new Integer[capacity]; 
    }

    public int get(int i) {
        return this.array[i]; 
    }

    public void set(int i, int n) {
        array[i] = n; 
    }

    public void pushback(int n) {
        if (this.getSize() == this.getCapacity()) {
            this.resize(); 
        }

        // Move pushback int to the back
        this.set(this.getSize(), n); 
    }

    public int popback() {
        int popped = this.array[this.getSize() - 1]; 
        this.array[this.getSize() - 1] = null; 
        return popped; 
    }

    private void resize() {
        Integer[] newArray = new Integer[this.getSize() * 2]; 
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i]; 
        }
        array = newArray; 
    }

    public int getSize() {
        int count = 0; 
        for (int i = 0; i < array.length; i++) {
            if (this.array[i] != null) {
                count++; 
            } else {
                break; 
            }
        }
        return count; 
    }

    public int getCapacity() {
        return array.length; 
    }
}
