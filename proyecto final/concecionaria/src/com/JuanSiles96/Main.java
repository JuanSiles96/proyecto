package com.JuanSiles96;

import com.JuanSiles96.dao.ClienteDao;
import com.JuanSiles96.dao.CocheDao;
import com.JuanSiles96.dao.RevisionDao;
import com.JuanSiles96.model.Cliente;
import com.JuanSiles96.model.Coche;
import com.JuanSiles96.model.Revision;
import com.JuanSiles96.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("1450", "carlos perez", "cochabamba", "av. ayacucho s/n", 4256975);
        //Cliente laura = new Cliente("1451", "laura perez", "cochabamba", "av. ayacucho s/n", 4719635);
        //Cliente roberto = new Cliente("1452", "roberto claros", "cochabamba", "av. junin s/n", 428975);
        //Cliente lorena = new Cliente("1453", "lorena peredo", "cochabamba", "av. blanco galindo s/n", 4953687);
        //Cliente jose = new Cliente("1454", "jose jose caceres ", "cochabamba", "av. heroinas s/n", 4718523);
        //Cliente maria = new Cliente("1455", "maria magdalena", "cochabamba", "av. villazon s/n", 4987654);
        //Cliente luis = new Cliente("1456-1B", "luis flores", "cochabamba", "av. circunvalacion s/n", 4123654);
        //Cliente carmen = new Cliente("1457", "carmen siles", "cochabamba", "av. america s/n", 4192873);
        //Coche ferrari = new Coche ("AH795", "Toyota", "rojo negro", "oX129", 29034091 ,"1451");
        //Revision loca = new Revision("8888", "muchos huecos", "fino del bueno", "desgastados","AH795");


        //CRUD tabla clientes
            ClienteDao clienteDao = new ClienteDao();
            CocheDao cocheDao = new CocheDao();
            RevisionDao revisionDao = new RevisionDao();

        //CREATE
        //clienteDao.addCliente(laura);
        //clienteDao.addCliente(roberto);
        //clienteDao.addCliente(lorena);
        //clienteDao.addCliente(jose);
        //clienteDao.addCliente(maria);
        //clienteDao.addCliente(luis);
        //clienteDao.addCliente(carmen);
        //cocheDao.addCoche(ferrari);
        //revisionDao.addRevision(loca);


        //READ
        /*List<Cliente> clientes = clienteDao.getALLClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);
        }

        List<Coche> coches = cocheDao.getALLCoche();
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);
            System.out.println(coche);
        }*/
        /*List<Revision> revisiones = revisionDao.getALLRevision();
        for (int i = 0; i < revisiones.size(); i++) {
            Revision revision = revisiones.get(i);
            System.out.println(revision);
        }
         */

        //UPDATE
        //Cliente cliente = new Cliente("1450", "fernando terrazas", "cochabamba", "av. 6 de agosto s/n", 4444444 );
        //clienteDao.updateCliente(cliente);

        //Coche coche = new Coche("AH795", "Mercedez", "oX129", "Rojo", 2900000 ,"1451");
        //cocheDao.updateCoche(coche);

        //Revision loca = new Revision("8888", "ARREGLADO", "valle grande", "ultra nuevos","AH795");
        //revisionDao.updateRevision(loca);

        //DELETE
        /*clienteDao.deleteCliente("1450");
        clienteDao.deleteCliente("1456-1B");
        clienteDao.deleteCliente("1454");
         */

        //cocheDao.deleteCoche("AH795");
        revisionDao.deleteRevision("8888");
    }
}
