package designPattern.proxyDesignPattern;

public class DatabaseExecuterProxy implements DatabaseExecuter{

    boolean ifAdmin;
    DatabaseExecuterImpl databaseExecuter;

    public DatabaseExecuterProxy(String name, String passwd)
    {
        if(name == "Admin" && passwd == "Admin@123")
        {
            ifAdmin = true;
        }
        databaseExecuter = new DatabaseExecuterImpl();
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if(ifAdmin)
        {
            databaseExecuter.executeDatabase(query);
        }
        else
        {
            if(query.equals("DELETE"))
            {
                throw new Exception("DELETE not allowed for non-admin user");
            }
            else
            {
                databaseExecuter.executeDatabase(query);
            }
        }
    }
    }

