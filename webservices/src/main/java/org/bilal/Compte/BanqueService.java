package org.bilal.Compte;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;

//POJO Plain Old Java Object
@WebService(serviceName="Banquews)")
public class BanqueService {

    @WebMethod(operationName="convert")
    public double conversion (@WebParam(name="montant") double mt) {
        return mt*10.49;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name="code") int code) {
        double solde;
        return new Compte(code, Math.random()*9888,new Date());
    }

    @WebMethod
    public List<Compte> listComtes() {

        return List.of (
                new Compte(1, Math.random()*9888,new Date()),
                new Compte(2, Math.random()*9888,new Date()),
                new Compte(3, Math.random()*9888,new Date())
        );
    }
}