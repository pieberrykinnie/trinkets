public class SchedulerDemo {
    public static void main(String[] args) {
        System.out.println("Creating a new process scheduler...\n");
        
        ProcessScheduler scheduler = new ProcessScheduler();
        
        System.out.println("Adding processes to the scheduler...\n");
        
        scheduler.addProcess("Text Editor", 2, 300);
        scheduler.addProcess("Web Browser", 1, 500);
        scheduler.addProcess("Compiler", 3, 250);
        scheduler.addProcess("Music Player", 1, 400);
        scheduler.addProcess("File Indexer", 2, 350);
        
        System.out.println(scheduler);
        System.out.println("Current process: " + scheduler.getCurrentProcess() + "\n");
        
        System.out.println("Running the scheduler for several cycles...\n");
        
        // Simulate the scheduler running for several cycles
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cycle " + i + ":");
            
            boolean processCompleted = scheduler.executeCurrentProcess();
            
            if (processCompleted) {
                System.out.println("Process completed and removed!");
            }
            
            System.out.println("Current process: " + scheduler.getCurrentProcess());
            scheduler.nextProcess();
            System.out.println("Moved to next process: " + scheduler.getCurrentProcess() + "\n");
            
            // If all processes are done, exit the loop
            if (scheduler.isEmpty()) {
                System.out.println("All processes completed!");
                break;
            }
        }
        
        System.out.println("\nKilling a specific process...");
        boolean killed = scheduler.killProcess("Web Browser");
        if (killed) {
            System.out.println("Process 'Web Browser' successfully killed");
        } else {
            System.out.println("Process 'Web Browser' not found");
        }
        
        System.out.println("\nAfter killing process:");
        System.out.println(scheduler);
        
        System.out.println("Program completed.");
    }
} 