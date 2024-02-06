import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RpcServer {
    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalculatorService", calculator);
            System.out.println("Server running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
