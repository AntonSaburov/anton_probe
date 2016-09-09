package se.test;

public class Message {
    public static final int HELLO = 0;
    public static final int GOODBYE = 1;
    public static final int GOOD_DAY = 2;
    private String message;
    private int status;
    private CashFlow cashFlow;

    public Message(CashFlow cashFlow) {
        this.cashFlow = cashFlow;
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
