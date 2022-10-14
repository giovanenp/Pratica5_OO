package br.com.questao4;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    PoligonoRetangular pTriangulo = new Triangulo(4, 4);
    PoligonoRetangular pQuadrado = new Quadrado(4, 4);

    JOptionPane.showMessageDialog(null, pTriangulo.calcularArea(), "Area do Triangulo", 0);
    JOptionPane.showMessageDialog(null, pQuadrado.calcularPerimetro(), "Perimetro do quadrado", 0);    
    JOptionPane.showMessageDialog(null, pQuadrado.calcularArea(), "Area do quadrado", 0);    
    JOptionPane.showMessageDialog(null, pQuadrado.calcularPerimetro(), "Perimetro do quadrado", 0);    
  }
}
