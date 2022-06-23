package ClassWork;

public interface EmailServer {
    public final String SERVER_REF ="2013 001";
    public boolean ReceiveMail(String to, String from, String subject, String body);
    public String getHostName();
}
