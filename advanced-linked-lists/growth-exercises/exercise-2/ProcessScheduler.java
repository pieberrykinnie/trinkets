public class ProcessScheduler {
    private class Process {
        public String name;
        public int priority;
        public int timeRemaining;
        public Process next;
        
        public Process(String name, int priority, int timeRemaining, Process next) {
            this.name = name;
            this.priority = priority;
            this.timeRemaining = timeRemaining;
            this.next = next;
        }
        
        @Override
        public String toString() {
            return name + " (Priority: " + priority + ", Time: " + timeRemaining + "ms)";
        }
    }
    
    private Process current;  // Points to current process in the circular list
    private int size;
    private final int TIME_SLICE = 100; // Time in ms given to each process per round
    
    public ProcessScheduler() {
        current = null;
        size = 0;
    }
    
    // Add a new process to the scheduler
    public void addProcess(String name, int priority, int executionTime) {
        // TODO: Implement this method
        // Create a new Process with the given parameters
        // Add it to the circular linked list
        // If this is the first process, make it point to itself
        // Otherwise, insert it after the current process
    }
    
    // Move to the next process in the circular list
    public void nextProcess() {
        // TODO: Implement this method
        // Move to the next process in the circular list
        // If there's only one process or none, current stays the same
    }
    
    // Execute the current process for one time slice
    public boolean executeCurrentProcess() {
        // TODO: Implement this method
        // Reduce the timeRemaining of the current process by TIME_SLICE
        // If timeRemaining becomes <= 0, remove the process and return true
        // Otherwise, return false
        return false;
    }
    
    // Remove a process with the given name
    public boolean killProcess(String name) {
        // TODO: Implement this method
        // Find and remove the process with the given name
        // Return true if successful, false if process not found
        return false;
    }
    
    // Get the current process
    public String getCurrentProcess() {
        if (current == null) {
            return "No processes running";
        }
        return current.toString();
    }
    
    // Get the number of processes
    public int getSize() {
        return size;
    }
    
    // Check if the scheduler is empty
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Display all processes in the scheduler
    @Override
    public String toString() {
        if (current == null) {
            return "No processes in scheduler";
        }
        
        String result = "Process List (current process marked with →):\n";
        Process temp = current;
        int count = 1;
        
        do {
            if (temp == current) {
                result += count + ". → " + temp + "\n";
            } else {
                result += count + ". " + temp + "\n";
            }
            temp = temp.next;
            count++;
        } while (temp != current);
        
        return result;
    }
} 