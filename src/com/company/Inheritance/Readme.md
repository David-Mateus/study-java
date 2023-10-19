# Herança
#### É um tipo de associação que permite que uma classe herde todos dados e comportamento de outra.
## Sintaxe
````ruby
public class BusinessAccount extends Account(){}

````
## Modificadores de acesso
#### Public: São acessiveis de qualquer lugar.
#### Protected: São acessíveis dentro da mesma classe, mesmo pacote e em subclasses.
#### Private: São acessíveis dentro da mesma classe.
## UPcasting e DownCasting

#### UPcasting: é o processo de atribuir uma instancia de uma subclasse a uma varivael de referencia da superClasse.
````ruby
SuperClasse = variavel = new SubClasse()
variavel.(retorna todos metodos/atributos da superclasse)
````
#### Downcasting: É o processo de conveter uma referencia da superclasse de volta para sua subclasse.

## Sobreposição
#### É a implemntação de um metedo de uma superclasse na subclasse | @Override
````ruby
        @Override
        public void  withDraw(double amount){
        balance -= amount;
    }
````

## Classes e metodos final
#### A palavra chave : final - na classe evita que seja herdada e no metodo evita que seja sobreposto, ou seja não permite o uso de override.
#### Obs: Recomenda-se usar em sopreposições a palavra final para evitar inconsistência de dados
````ruby
    public final class Saving(){}
    public final void withDraw(){}
````
## Polimorfismo
#### É a capicidade de objetos de classes diferentes respoderem de maneira única a chamadas de metodos com o mesmo nome.
````ruby
        Account x = new Account(1001, "David", 1000.0);
        Account y = new SavingsAccount(1002, "Mateus", 1000.0, 0.01);
        x.withDraw(50.0);
        y.withDraw(50.0);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
````