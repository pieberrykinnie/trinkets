public class BrowserDemo {
    public static void main(String[] args) {
        System.out.println("Creating a new browser history...\n");
        
        BrowserHistory history = new BrowserHistory();
        
        System.out.println("Visiting websites...\n");
        
        history.visit("https://www.example.com", "Example Website");
        System.out.println("Current page: " + history.getCurrentPage() + "\n");
        
        history.visit("https://www.google.com", "Google Search");
        System.out.println("Current page: " + history.getCurrentPage() + "\n");
        
        history.visit("https://www.wikipedia.org", "Wikipedia");
        System.out.println("Current page: " + history.getCurrentPage() + "\n");
        
        history.visit("https://www.github.com", "GitHub");
        System.out.println("Current page: " + history.getCurrentPage() + "\n");
        
        System.out.println("Full history:");
        System.out.println(history);
        
        System.out.println("Testing navigation...");
        System.out.println("Can go back: " + history.canGoBack());
        System.out.println("Can go forward: " + history.canGoForward() + "\n");
        
        System.out.println("Going back twice...");
        history.goBack();
        history.goBack();
        System.out.println("Current page: " + history.getCurrentPage() + "\n");
        
        System.out.println("Going forward once...");
        history.goForward();
        System.out.println("Current page: " + history.getCurrentPage() + "\n");
        
        System.out.println("Visiting a new page (should truncate forward history)...");
        history.visit("https://www.stackoverflow.com", "Stack Overflow");
        System.out.println("Current page: " + history.getCurrentPage() + "\n");
        
        System.out.println("Can go forward after new visit: " + history.canGoForward() + "\n");
        
        System.out.println("Updated history:");
        System.out.println(history);
        
        System.out.println("Program completed.");
    }
} 