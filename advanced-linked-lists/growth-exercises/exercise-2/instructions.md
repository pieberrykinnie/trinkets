# Instructions

In this exercise, you'll implement a simple round-robin process scheduler using a circular linked list. This models how operating systems might allocate CPU time to different processes in a fair manner.

Your task is to implement the missing methods in `ProcessScheduler.java` to create a functioning round-robin scheduler. The circular list structure ensures that once the scheduler reaches the end of the process list, it loops back to the beginning. Then, run `SchedulerDemo.java` to test your implementation and see how it simulates process scheduling. 