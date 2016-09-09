package se.test;

public class Message
{
    private String message;
    private int status;

    public Message() {
    }

    public Message(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void printMessage() {
        System.out.println("Message:" + message);
    }

    public void printMessage(String message) {
        System.out.println("Local Message:" + message);
    }

    public void printAll() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Message{" + "message='" + message + ", status=" + status + '}';
    }
}
