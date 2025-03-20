public class BrowserHistory {
    private class Page {
        public String url;
        public String title;
        public Page next;
        public Page prev;
        
        public Page(String url, String title, Page next, Page prev) {
            this.url = url;
            this.title = title;
            this.next = next;
            this.prev = prev;
        }
        
        @Override
        public String toString() {
            return title + " [" + url + "]";
        }
    }
    
    private Page current; // Current page being viewed
    private int historySize; // Total number of pages in history
    
    public BrowserHistory() {
        current = null;
        historySize = 0;
    }
    
    // Navigate to a new URL, which should be added after the current page
    // Any "forward" history should be deleted when a new page is visited
    public void visit(String url, String title) {
        // TODO: Implement this method
        // Create a new Page with the given URL and title
        // Add it after the current page
        // If there's any "forward" history, it should be truncated
        // Update current to point to the new page
    }
    
    // Navigate backward in history if possible
    public boolean goBack() {
        // TODO: Implement this method
        // Move to the previous page if one exists
        // Return true if successful, false otherwise
        return false;
    }
    
    // Navigate forward in history if possible
    public boolean goForward() {
        // TODO: Implement this method
        // Move to the next page if one exists
        // Return true if successful, false otherwise
        return false;
    }
    
    // Get the current page
    public String getCurrentPage() {
        if (current == null) {
            return "No page loaded";
        }
        return current.toString();
    }
    
    // Check if can go back
    public boolean canGoBack() {
        return current != null && current.prev != null;
    }
    
    // Check if can go forward
    public boolean canGoForward() {
        return current != null && current.next != null;
    }
    
    // Get the history size
    public int getHistorySize() {
        return historySize;
    }
    
    // Display the entire browsing history
    @Override
    public String toString() {
        if (current == null) {
            return "Browser history is empty";
        }
        
        String result = "Browser History (current page marked with →):\n";
        
        // First, find the beginning of the history
        Page start = current;
        while (start.prev != null) {
            start = start.prev;
        }
        
        // Now traverse from start to end
        Page temp = start;
        int count = 1;
        
        while (temp != null) {
            if (temp == current) {
                result += count + ". → " + temp + "\n";
            } else {
                result += count + ". " + temp + "\n";
            }
            temp = temp.next;
            count++;
        }
        
        return result;
    }
} 