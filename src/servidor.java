import interfaces.Imensaje;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class servidor implements Imensaje {

    private String mensaje;

    @Override
    public String EnviarMensaje() throws RemoteException {
        return "Mensaje enviado desde el servidor: =>"+this.mensaje;
    }

    public static void main(String[] args) throws RemoteException {
        servidor server = new servidor();
        server.mensaje = "Comprobando que el server funciona correctamente";

        Imensaje stub = (Imensaje) UnicastRemoteObject.exportObject(server, 0);

        Registry registry = LocateRegistry.createRegistry(1000);
        registry.rebind("ObjetoMensaje",stub);

        System.out.println("Servidor encendido");
    }
}
