public class Numeros {
    public boolean numeroPar(int n){
        return n%2==0;
        
    }
    
    public int  areaQuadrado( int lado){
        return lado*lado;
    }
    
    public boolean numeroDivisivel (int dividendo, int divisor){
            return dividendo%divisor==0;
    }

    public int quadrado(int x) {
        return x*x;
    }

    public int multiplicacao(int a, int b) {
        return a*b;
    }

    public int soma(int a, int b) {
        return a+b;
    }

    public int subtracao(int a, int b) {
        return a-b;
    }

    public int equacao(int a, int b) {
        return (quadrado(a)+multiplicacao(a, soma(a, b))-soma(0, 1));
    }

    // def quadrado(x)
    //     return x*x
    // end
    
    // def multiplicacao(a, b)
    //     return a*b
    // end
    
    // def soma(a, b)
    //     return  a+b
    // end
    
    // def subtracao(a, b)
    //     return a-b
    // end 
    
    // def equacao(x, y)
    //     return (quadrado(x)+multiplicacao(x, soma(x, y))-soma(0, 1))
    //     # x²+x*(x+y)-1
    // end
}
