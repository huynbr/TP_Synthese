package exceptions;
//
// TODO 09-- Ajoutez le code nécessaire pour créer l'exception générée
//         quand on essaie de créer un payabe avec un numéro de ID existant
//
public class ExceptionPayableExisteDeja extends Exception{

    public ExceptionPayableExisteDeja(int ID){
        super("Payable avec ID " + ID + " existe déja.");
    }
}