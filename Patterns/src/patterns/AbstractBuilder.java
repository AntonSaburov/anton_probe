package patterns;

public interface AbstractBuilder
{
    void createManager();
    void createConnection();
    void createDao();
    Manager getResult();
}
