/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author pmigu
 */
public class classeArrays  {

    double[] array1 = new double[10];
    double[] array2 = new double[10];

    public void adicionaArray1(int valor, int posição) {
        if (posição >= 0 && posição <= 9) {
            array1[posição] = valor;
        }
        if (posição < 0 || posição > 9) {
            System.out.println("Por favor digite um valor valido (de 0 a 9)");
        }
    }

    public void adicionaArray2(int valor, int posição) {
        if (posição >= 0 && posição <= 9) {
            array2[posição] = valor;
        }
        if (posição < 0 || posição > 9) {
            System.out.println("Por favor digite um valor valido (de 0 a 9)");
        }
    }

    public void CalculaDivisaoArrays() throws ExcecaoDivisaoResultadoZero {
        //popula array
        for (int i = 0; i < 10; i++) {
            adicionaArray1((int) gerador0a99(), i);
            adicionaArray2((int) gerador0a99(), i);
        }
        for (int i = 0; i < 10; i++) {
            try{
                double resultado;
                resultado = calcula(array1[i], array2[i]);
                System.out.println("Divisão " + i + " = " + resultado);      
                throw new ExcecaoDivisaoResultadoZero();
            }
            catch(ExcecaoDivisaoResultadoZero aex){
                if (array1[i]/array2[i] == 0){
                    System.out.println(aex); 
                }
            }
            finally {
                System.out.println("A = " + array1[i] + " B = " + array2[i]);
            }
    }
    }
    
    public double gerador0a99() {
        double min = 0;
        double max = 99;
        double valorAleatorio = Math.floor(Math.random() * (max - min + 1) + min);
        return valorAleatorio;
    }

    
    public static double calcula(double a, double b) {
        try {
            double c = a / b;
        } catch (ArithmeticException aex) {
            System.out.println("Digite um número válido, não é possível dividir por 0. Erro:\n" + aex);
        }        
        return a/b;
    }
        
    
        
           
        
        
        
               
        
        
        
        
        
        
        /*public void ExcecaoDivisaoResultadoZero(Double resultadoAnterior) {

        try {
         
            if (resultadoAnterior == 0) {
                
            }

        } catch (Exception e) {
            System.out.println("err:\n" + e);
        }

    }

    /*
    
    3) Agora crie uma nova exceção que é disparada quando a divisão do 'calcula(int a, int b)' resulta em 0. 
    Chame essa exceção de ExcecaoDivisaoResultadoZero e faça com o que método 'calcula' lance (throw) essa exceção 
    quando o resultado da divisão por 'a' por 'b' for igual a zero. Lembre-se que como você criou uma exceção nova, é interessante 
    você sobrescrever a mensagem da sua nova exceção para uma mensagem mais apropriada.
    
    4) Para finalizar, crie um método CalculaDivisaoArrays que chama o método calcula para cada posição correspondente dos arrays arrayA e arrayB. 
    Ou seja, ele divide arrayA[0] por arrayB[0], arrayA[1] por arrayB[1] até a última posição do array.
    Repare que nesse método, você vai ter que tratar a exceção que pode ser lançada no item 3. Logo, use aqui o bloco try-catch-finally. 
    No caso do finally, você deve usar para imprimir os valores (a e b) que foram usados na divisão
   
     */
    //Getters and setters 
    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double[] array1) {
        this.array1 = array1;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }

}
