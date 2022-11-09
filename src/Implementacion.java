import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementacion extends UnicastRemoteObject implements Operaciones {

    public double num1, num2;

    protected Implementacion() throws RemoteException {
        super();
        this.num1 = 0;
        this.num2 = 0;
    }

    public double suma(double n1, double n2) throws RemoteException {
        return n1 + n2;
    }

    public double resta(double n1, double n2) throws RemoteException {
        return n1 - n2;
    }

    public double multiplicacion(double n1, double n2) throws RemoteException {
        return n1 * n2;
    }

    public double division(double n1, double n2) throws RemoteException {
        return n1 / n2;
    }

    public double modulo(double n1, double n2) throws RemoteException {
        return n1 % n2;
    }

    public double potencia(double n1, double n2) throws RemoteException {
        return Math.pow(n1, n2);
    }

    public double raiz(double n1, double n2) throws RemoteException {
        return Math.pow(n1,  1 / n2);
    }

    public void agregar(double num) throws RemoteException {
        if(this.num1 != 0 && this.num2 != 0) {
            this.num1 = num;
            this.num2 = 0;
            return;
        } if(this.num1 != 0) {
            this.num2 = num;
            return;
        }
        this.num1 = num;
    }

    public boolean verificar() throws RemoteException {
        return !(this.num1 == 0 || this.num2 == 0);
    }

    public double obtenerNum1() throws RemoteException {
        return this.num1;
    }

    public double obtenerNum2() throws RemoteException {
        return this.num2;
    }

}
