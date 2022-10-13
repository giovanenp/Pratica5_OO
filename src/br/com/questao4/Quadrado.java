package br.com.questao4;

public class Quadrado extends PoligonoRetangular{
  
  public Quadrado(int numLados, float tamLados) {
    super(numLados, tamLados);
  }

  @Override
  public float calcularArea() {    
    return getTamLados() * getNumLados();
  }
}
