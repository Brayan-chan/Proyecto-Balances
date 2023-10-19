package betaBalances;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class balance {
    static Scanner input = new Scanner(System.in);                                       
    public static void main(String[] args) {
        System.out.println("BALANCE GENERAL");

        //Nombre de la empresa
        System.out.print("Nombre de la empresa: ");
        String nombre = input.nextLine();
        
        //Fecha del balance
        System.out.print("Fecha del balance: ");
        String fecha = input.nextLine();
        System.out.println("");

        //Actvos
        System.out.println("ACTIVOS");
        System.out.println("Circulantes");
        System.out.print("Caja: ");
        int caja = input.nextInt();
        //Logica para comprobar longitud, si es 0 empezar con $
        //Logica para comprobar la existencia de valor, si input es = 0 pasar al siguiente activo y omitir el anterior
        System.out.print("Bancos: ");
        int bancos = input.nextInt();
        System.out.print("Inversiones temporales: ");
        int inversionesTemp = input.nextInt();
        System.out.print("Mercancias: ");
        int mercancias = input.nextInt();
        System.out.print("Clientes: ");
        int clientes = input.nextInt();
        System.out.print("Documentos por cobrar: ");
        int documentosCobrar = input.nextInt();
        System.out.print("Deudores diversos: ");
        int deudoresDiversos = input.nextInt();
        System.out.print("Anticipo a proveedores: ");
        int anticipoProveedores = input.nextInt();

        int sumaActivosCirculantes;
        sumaActivosCirculantes = caja + bancos + inversionesTemp + mercancias
        + clientes + documentosCobrar + deudoresDiversos + anticipoProveedores;

        System.out.print("Activos circulantes: " + sumaActivosCirculantes);

        System.out.println("\nFijos");
        System.out.print("Terrenos: ");
        int terrenos = input.nextInt();
        System.out.print("Edificios: ");
        int edificos = input.nextInt();
        System.out.print("Mobiliario y equipo: ");
        int mobiliarioEquipo = input.nextInt();
        System.out.print("Documentos por cobrar a largo plazo: ");
        int documentosCLP = input.nextInt();
        System.out.print("Equipo de computo electronico: ");
        int equipoCompu = input.nextInt();
        System.out.print("Equipo de entrega: ");
        int equipoEnt = input.nextInt();
        System.out.print("Depositos en garantia: ");
        int depositoGarantia = input.nextInt();
        System.out.print("Inversiones permanentes: ");
        int invPermanentes = input.nextInt();

        int sumaActivosFijos;
        sumaActivosFijos = terrenos + edificos + mobiliarioEquipo + documentosCLP
        + equipoCompu + equipoEnt + depositoGarantia + invPermanentes;
        
        System.out.print("Actvos fijos: " + sumaActivosFijos);

        System.out.println("\nDiferidos:");
        System.out.print("Gatos de investigacion y desarollo: ");
        int GID = input.nextInt();
        System.out.print("Gastos preoperativos: ");
        int GP = input.nextInt();
        System.out.print("Gastos de mercadotecnia: ");
        int GM = input.nextInt();
        System.out.print("Gastos de organizacion: ");
        int GO = input.nextInt();
        System.out.print("Gastos de instalacion: ");
        int GI = input.nextInt();
        System.out.print("Papeleria y utiles: ");
        int PU = input.nextInt();
        System.out.print("Propaganda y publicidad: ");
        int PP = input.nextInt();
        System.out.print("Primas de seguros: ");
        int PS = input.nextInt();
        System.out.print("Rentas pagadas por anticipado: ");
        int RPA = input.nextInt();
        System.out.print("Intereses pagados por anticipado: ");
        int IPA = input.nextInt();

        int sumaActivosDiferidos;
        sumaActivosDiferidos = GID + GP + GM
        + GO + GI + PU + PP + PS + RPA + IPA;
        
        System.out.print("Activos diferidos: " + sumaActivosDiferidos);

        //Pasivos 
        System.out.println("\nPASIVOS");
        System.out.println("Circulantes");
        System.out.print("Proveedores: ");
        int proveedores = input.nextInt();
        System.out.print("Documentos por pagar: ");
        int documentosPagar = input.nextInt();
        System.out.print("Acreedores diversos: ");
        int acrredoresDiversos = input.nextInt();
        System.out.print("Anticipo de clientes: ");
        int anticipoClientes = input.nextInt();
        System.out.print("Gastos pendientes de pago, por pagar o acumuldos: ");
        int GPPA = input.nextInt();
        System.out.print("Impuestos pendientes de pago, por pagar o acumuldos: ");
        int IPPA = input.nextInt();

        int sumaPasivosCirculantes;
        sumaPasivosCirculantes = proveedores + documentosPagar
        + acrredoresDiversos + anticipoClientes + GPPA + IPPA;
        
        System.out.print("Pasivos circulantes: " + sumaPasivosCirculantes);

        System.out.println("\nFijos");
        System.out.print("Hipotecas por pagar o acreedores hipotecarios: ");
        int HPPAH = input.nextInt();
        System.out.print("Documentos por pagar a largo plazo: ");
        int DPPLP = input.nextInt();
        System.out.print("Cuentas por pagar a largo plazo: ");
        int CPPLP = input.nextInt();

        int sumaPasivosFijos;
        sumaPasivosFijos = HPPAH + DPPLP + CPPLP;

        System.out.print("Pasivos fijos: " + sumaPasivosFijos);

        System.out.println("\nDiferidos");
        System.out.print("Rentas cobradas por anticipado: ");
        int RCPA = input.nextInt();
        System.out.print("Intereses cobrados por anticipado: ");
        int ICPA = input.nextInt();

        int sumaPasivosDiferidos;
        sumaPasivosDiferidos = RCPA + ICPA;

        System.out.print("Pasivos diferidos: " + sumaPasivosDiferidos);

        int sumaActivos = sumaActivosCirculantes + sumaActivosFijos + sumaActivosDiferidos;
        int sumaPasivos = sumaPasivosCirculantes + sumaPasivosFijos + sumaPasivosDiferidos;

        System.out.print("\nTotal activos: " + sumaActivos);
        System.out.print("Total pasivos: " + sumaPasivos);
        int capitalContable = sumaActivos - sumaPasivos;

        System.out.print("\nCapital contable:" + capitalContable + "\n");

        System.out.print("Autorizado por: ");
        String autorizacion = input.nextLine();
        String autorizacion_= input.nextLine();
        System.out.print("Elaborado por: ");
        String elaboracion = input.nextLine();

        System.out.println("==================BALANCE GENERAL=================");
        System.out.println(nombre + "\n" + fecha + "\nACTIVOS\n" + sumaActivos + "PASIVOS\n" + sumaPasivos + "CAPITAL CONTABLE\n" + capitalContable + "AUTORIZACION\n" + autorizacion_ + "ELABORACION\n" + elaboracion);
    }
}
