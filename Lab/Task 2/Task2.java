public class Task2 {
    public static void main(String[] args) {
        
        
        String firstName = "Tanima Dash";
        String lastName = "Gupta";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        
        
        String productName = "Laptop";
        String productId = "123";
        String productCode = productName + productId;
        System.out.println("Product Code: " + productCode);
        
       
        String email = "tanimadashgupta@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        System.out.println("Username: " + username);
        
        
        String message = "Welcome";
        int length = message.length();
        System.out.println("Message length: " + length);
        
        
        String sentence = "Hello Java";
        String upper = sentence.toUpperCase();
        String lower = sentence.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        
       
        String text = "I like laptop gaming";
        String newText = text.replace("laptop gaming", "coding");
        System.out.println("New text: " + newText);
    }
}