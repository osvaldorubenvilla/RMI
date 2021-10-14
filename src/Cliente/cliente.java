package Cliente;

import interfaces.Imensaje;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class cliente {

    private cliente (){}

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(1000);
        Imensaje stub = (Imensaje) registry.lookup("ObjetoMensaje");
        System.out.println("Mensaje => "+stub.EnviarMensaje());
    }
}
