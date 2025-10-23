package pawan.trail;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {


    @MessageMapping("/sendMessage")   // client -> server
    @SendTo("/out/messages")          // server -> all clients
    public ChatMessage sendMessage(ChatMessage message) {
    
    	message.setTime(LocalDateTime.now());
        return message;
    }
}
