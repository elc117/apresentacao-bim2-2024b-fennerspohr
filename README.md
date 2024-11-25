# 15 - Similaridade de objetos com o operador "==" e método equals()

## Operador "=="
Compara *referências* de objetos, ou seja, verifica se duas variáveis apontam para o mesmo endereço na memória.

## Método equals()
Compara os *valores* dos obejtos. É um método definido em diversas classes em Java (como a classe Object) que por padrão funciona da mesma forma que o operador "==", verificando as referências.
Porém, muitas classes sobrescrevem o método para comparar o conteúdo dos objetos (String, Integer, Double, etc.).

```

String str1 = new String("Hello");
String str2 = str1;
String str3 = new String("Hello");

boolean areEqual = (str1 == str2); // true, porque ambas as variáveis apontam para o mesmo objeto
boolean areEqual2 = (str1 == str3); // false, porque str1 e str3 apontam para objetos diferentes
boolean areEqual = str1.equals(str3); // true, porque o método equals compara o conteúdo das strings

```
![image](https://github.com/user-attachments/assets/13f8b490-d75d-4ae4-a1a9-7e4c9bc69128)


## Referências
https://cursos.alura.com.br/forum/topico-qual-seria-a-diferenca-entre-suar-o-e-o-equals-e-qual-o-momento-mais-adequado-de-usar-um-ou-o-outro-330393
https://www.linkedin.com/pulse/difference-between-equals-java-babar-shahzad/
