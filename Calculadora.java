public class Calculadora {
    
    int numero1;
    int numero2;

    // Construtor    
    public Calculadora(int numero1Arg, int numero2Arg;) {
         numero1 = numero1Arg;
         numero2 = numero2Arg;
  }

    public int somar() {
         int resultado = numero1 + numero2;
         return resultado; 
}
    public int subtrair() {
         int resultado = numero1 - numero2;
         return resultado;
}
    public int mutiplicacao() {
         int resultado = numero1 * numero2;
         return resultado;
}      

    public void mostrarResultados() {
        System.out.println("Adição de " + numero1 + " + " + numero2 + " = " + somar());
        System.out.println("Subtração de " + numero1 + " - " + numero2 + " = " + subtrair());
        System.out.println("Multiplicação de " + numero1 + " x " + numero2 + " = " + multiplicacao());

  }

   public static void main(String args[]) {
        int numero1 = Integer.parseInt(args[0]);
        int numero1 = Integer.parseInt(args[1]);
   
        Calculadora calculo = new Calculadora(numero1, numero2);
        calculo.mostrarResultado();
 }
        


}