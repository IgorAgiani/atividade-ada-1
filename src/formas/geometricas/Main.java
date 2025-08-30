package formas.geometricas;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma quadrado = new Quadrado(4);

        Desenho desenho = new Desenho();
        desenho.getFormas().add(circulo);
        desenho.getFormas().add(quadrado);
        desenho.calcularAreaTotal();
    }
}

// Por que é interessante usar composição em Desenho em vez de herança ?
// R: A composição é mais adequada nesse caso porque Desenho não é uma forma geométrica,
// mas contém formas geométricas. Herança seria usada se Desenho fosse uma forma geométrica específica.
// Composição permite que Desenho agregue diversas formas diferentes, sem precisar saber os
// detalhes de cada uma. Basta que todas implementem a interface Forma.
