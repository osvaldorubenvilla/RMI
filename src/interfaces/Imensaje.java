package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Imensaje extends Remote {
    String EnviarMensaje() throws RemoteException;

}
