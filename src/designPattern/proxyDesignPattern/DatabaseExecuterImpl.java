package designPattern.proxyDesignPattern;

public class DatabaseExecuterImpl implements DatabaseExecuter{
    @Override
    public void executeDatabase(String query) {
        System.out.println("Going to execute Query: " + query);
    }
}
