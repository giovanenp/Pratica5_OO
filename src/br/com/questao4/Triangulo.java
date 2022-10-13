package br.com.questao4;

public class Triangulo extends PoligonoRetangular{
  
  public Triangulo(int numLados, float tamLados) {
    super(numLados, tamLados);
  }

  @Override
  public float calcularArea() {    
    return (getNumLados() * getTamLados()) / 2;
  }
}
