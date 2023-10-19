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

