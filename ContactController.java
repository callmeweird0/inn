import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @PostMapping
    public String handleContactForm(@RequestParam String name, @RequestParam String email, @RequestParam String message) {
        // Process the contact form data
        System.out.println("Received contact form submission from: " + name + " (" + email + ")");
        System.out.println("Message: " + message);
        return "Message received!";
    }
}
