package abstractVsInterface.inter;

public interface Messenger {
    String PROTOCOL = "HTTP2";

    void sendMsg(String to, String jsonBody);
}
