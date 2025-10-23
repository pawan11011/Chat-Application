package pawan.trail;

import java.time.LocalDateTime;


public class ChatMessage {
    private String sender;
    private String receiver;
    private String content;
   
    private LocalDateTime time;

    // getters and setters
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

    public String getReceiver() { return receiver; }
    public void setReceiver(String receiver) { this.receiver = receiver; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }
}
