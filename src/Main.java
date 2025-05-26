import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, producto, cantidad, opc, opc1, total, cantManzanaRoja = 0, cantManzanaVerde = 0, cantNaranja = 0;
        int cantMango = 0, cantDurazno = 0, cantPlatanoAmarillo = 0, cantPlatanoVerde = 0, cantBananoPequeno = 0;
        int cantBananoGrande = 0, cantPera = 0, cantPina = 0, cantTomateRojo = 0, cantTomateVerde = 0, cantTomatePintoso = 0;
        int cantLechugaCrespa = 0, cantLechugaMorada = 0, cantLechugaVatiba = 0, cantZanahoria = 0, cantBrocoli = 0;
        int cantCebollaCabezona = 0;
        int cantCebollaRama = 0;
        int cantCebollaMorada = 0;
        double subtotal;
        int iva;
        int totaliva;
        boolean salir = false;
        boolean repeticion = false;

        Frutas manzanaRoja = new Frutas("Manzana", "Roja", "", "Mediana", 1700);
        Frutas manzanaVerde = new Frutas("Manzana", "Verde", "", "Mediana", 2000);
        Frutas naranja = new Frutas("Naranja", "Color", "", "Mediana", 800);
        Frutas mango = new Frutas("Mango", "Amarillo", "Tommy", "Mediano", 2000);
        Frutas durazno = new Frutas("Durazno", "Amarillo", "", "Mediano", 1000);
        Frutas platanoAmarillo = new Frutas("Platano", "Amarillo", "", "Grande", 700);
        Frutas platanoVerde = new Frutas("Platano", "Verde", "", "Grande", 700);
        Frutas bananoPequeno = new Frutas("Banano", "Amarillo", "", "Pequeño", 500);
        Frutas bananoGrande = new Frutas("Banano", "Amarillo", "", "Mediano", 700);
        Frutas pera = new Frutas("Pera", "Verde", "", "Mediana", 1200);
        Frutas pina = new Frutas("Piña", "Amarillo", "", "Grande", 3500);

        Verduras tomateRojo = new Verduras("Tomate", "Rojo", "", "Mediano", 500);
        Verduras tomateVerde = new Verduras("Tomate", "Verde", "", "Mediano", 500);
        Verduras tomatePintoso = new Verduras("Tomate", "Pintoso", "", "Mediano", 500);
        Verduras lechugaCrespa = new Verduras("Lechuga", "", "Crespa", "Mediana", 2500);
        Verduras lechugaMorada = new Verduras("Lechuga", "", "Morada", "Mediana", 2500);
        Verduras lechugaVatiba = new Verduras("Lechuga", "", "Vatiba", "Mediana", 2500);
        Verduras zanahoria = new Verduras("Zanahoria", "Naranja", "", "Mediana", 500);
        Verduras brocoli = new Verduras("Brocoli", "Verde", "", "Mediano", 3000);
        Verduras cebollaCabezona = new Verduras("Cebolla", "", "Cabezona", "Mediana", 500);
        Verduras cebollaRama = new Verduras("Cebolla", "", "Larga", "Mediana", 500);
        Verduras cebollaMorada = new Verduras("Cebolla", "Morada", "", "Mediana", 700);

        do {
            System.out.println("          SUPERMERCADO UNIMINUTO");
            System.out.println("    Menú");
            System.out.println("1. Comprar");
            System.out.println("2. Calcular compra");
            System.out.println("3. Salir");

            System.out.print("Digite su opcion: ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                do {
                    System.out.println(" ");
                    System.out.println("          SUPERMERCADO UNIMINUTO");
                    System.out.println("    Seleccione el tipo de producto que desea comprar");
                    System.out.println("1. Frutas");
                    System.out.println("2. Verduras");
                    System.out.print("Digite su opcion: ");
                    producto = teclado.nextInt();
                    if (producto == 1) {
                        System.out.println("        FRUTAS");
                        System.out.println("1." + manzanaRoja.getNombre() + " " + manzanaRoja.getColor() + "      -> " + manzanaRoja.getPrecio());
                        System.out.println("2." + manzanaVerde.getNombre() + " " + manzanaVerde.getColor() + "     -> " + manzanaVerde.getPrecio());
                        System.out.println("3." + naranja.getNombre() + "           ->  " + naranja.getPrecio());
                        System.out.println("4." + mango.getNombre() + "             -> " + mango.getPrecio());
                        System.out.println("5." + durazno.getNombre() + "           -> " + durazno.getPrecio());
                        System.out.println("6." + platanoAmarillo.getNombre() + " " + platanoAmarillo.getColor() + "  ->  " + platanoAmarillo.getPrecio());
                        System.out.println("7." + platanoVerde.getNombre() + " " + platanoVerde.getColor() + "     ->  " + platanoVerde.getPrecio());
                        System.out.println("8." + bananoPequeno.getNombre() + " " + bananoPequeno.getTamano() + "    ->  " + bananoPequeno.getPrecio());
                        System.out.println("9." + bananoGrande.getNombre() + " " + bananoGrande.getTamano() + "    ->  " + bananoGrande.getPrecio());
                        System.out.println("10." + pera.getNombre() + "             -> " + pera.getPrecio());
                        System.out.println("11." + pina.getNombre() + "             -> " + pina.getPrecio());
                        System.out.print("Digite su opcion: ");
                        opc = teclado.nextInt();
                        switch (opc) {
                            case 1 -> {
                                System.out.println("Cuantas manzanas rojas desea comprar?");
                                cantidad = teclado.nextInt();
                                cantManzanaRoja += cantidad;
                                System.out.println("Valor: " + (cantidad * manzanaRoja.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 2 -> {
                                System.out.println("Cuantas manzanas verdes desea comprar?");
                                cantidad = teclado.nextInt();
                                cantManzanaVerde += cantidad;
                                System.out.println("Valor: " + (cantidad * manzanaVerde.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 3 -> {
                                System.out.println("Cuantas naranjas desea comprar?");
                                cantidad = teclado.nextInt();
                                cantNaranja += cantidad;
                                System.out.println("Valor: " + (cantidad * naranja.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 4 -> {
                                System.out.println("Cuantos mangos desea comprar?");
                                cantidad = teclado.nextInt();
                                cantMango += cantidad;
                                System.out.println("Valor: " + (cantidad * mango.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 5 -> {
                                System.out.println("Cuantos duraznos desea comprar?");
                                cantidad = teclado.nextInt();
                                cantDurazno += cantidad;
                                System.out.println("Valor: " + (cantidad * durazno.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 6 -> {
                                System.out.println("Cuantos Platanos amarillos desea comprar?");
                                cantidad = teclado.nextInt();
                                cantPlatanoAmarillo += cantidad;
                                System.out.println("Valor: " + (cantidad * platanoAmarillo.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 7 -> {
                                System.out.println("Cuantos Platanos verdes desea comprar?");
                                cantidad = teclado.nextInt();
                                cantPlatanoVerde += cantidad;
                                System.out.println("Valor: " + (cantidad * platanoVerde.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 8 -> {
                                System.out.println("Cuantos bananos pequeños desea comprar?");
                                cantidad = teclado.nextInt();
                                cantBananoPequeno += cantidad;
                                System.out.println("Valor: " + (cantidad * bananoPequeno.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 9 -> {
                                System.out.println("Cuantos bananos grandes desea comprar?");
                                cantidad = teclado.nextInt();
                                cantBananoGrande += cantidad;
                                System.out.println("Valor: " + (cantidad * bananoGrande.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 10 -> {
                                System.out.println("Cuantas peras desea comprar?");
                                cantidad = teclado.nextInt();
                                cantPera += cantidad;
                                System.out.println("Valor: " + (cantidad * pera.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 11 -> {
                                System.out.println("Cuantas piñas desea comprar?");
                                cantidad = teclado.nextInt();
                                cantPina += cantidad;
                                System.out.println("Valor: " + (cantidad * pina.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                        }
                    }
                    if (producto == 2) {
                        System.out.println("        VERDURAS");
                        System.out.println("1." + tomateRojo.getNombre() + " " + tomateRojo.getColor() + "      ->  " + tomateRojo.getPrecio());
                        System.out.println("2." + tomateVerde.getNombre() + " " + tomateVerde.getColor() + "     ->  " + tomateVerde.getPrecio());
                        System.out.println("3." + tomatePintoso.getNombre() + " " + tomatePintoso.getColor() + "   ->  " + tomatePintoso.getPrecio());
                        System.out.println("4." + lechugaCrespa.getNombre() + " " + lechugaCrespa.getTipo() + "   -> " + lechugaCrespa.getPrecio());
                        System.out.println("5." + lechugaMorada.getNombre() + " " + lechugaMorada.getTipo() + "   -> " + lechugaMorada.getPrecio());
                        System.out.println("6." + lechugaVatiba.getNombre() + " " + lechugaVatiba.getTipo() + "   -> " + lechugaVatiba.getPrecio());
                        System.out.println("7." + zanahoria.getNombre() + "        ->  " + zanahoria.getPrecio());
                        System.out.println("8." + brocoli.getNombre() + "          -> " + brocoli.getPrecio());
                        System.out.println("9." + cebollaCabezona.getNombre() + " " + cebollaCabezona.getTipo() + " ->  " + cebollaCabezona.getPrecio());
                        System.out.println("10." + cebollaRama.getNombre() + " " + cebollaRama.getTipo() + "   ->  " + cebollaRama.getPrecio());
                        System.out.println("11." + cebollaMorada.getNombre() + " " + cebollaMorada.getColor() + "  ->  " + cebollaMorada.getPrecio());
                        System.out.print("Digite su opcion: ");
                        opc = teclado.nextInt();
                        switch (opc) {
                            case 1 -> {
                                System.out.println("Cuantos Tomates rojos desea comprar?");
                                cantidad = teclado.nextInt();
                                cantTomateRojo += cantidad;
                                System.out.println("Valor: " + (cantidad * tomateRojo.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 2 -> {
                                System.out.println("Cuantos Tomates verdes desea comprar?");
                                cantidad = teclado.nextInt();
                                cantTomateVerde += cantidad;
                                System.out.println("Valor: " + (cantidad * tomateVerde.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 3 -> {
                                System.out.println("Cuantos Tomates pintosos desea comprar?");
                                cantidad = teclado.nextInt();
                                cantTomatePintoso += cantidad;
                                System.out.println("Valor: " + (cantidad * tomatePintoso.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 4 -> {
                                System.out.println("Cuanta lechuga crespa desea comprar?");
                                cantidad = teclado.nextInt();
                                cantLechugaCrespa += cantidad;
                                System.out.println("Valor: " + (cantidad * lechugaCrespa.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 5 -> {
                                System.out.println("Cuanta lechuga morada desea comprar?");
                                cantidad = teclado.nextInt();
                                cantLechugaMorada += cantidad;
                                System.out.println("Valor: " + (cantidad * lechugaMorada.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 6 -> {
                                System.out.println("Cuanta lechuga Vatiba desea comprar?");
                                cantidad = teclado.nextInt();
                                cantLechugaVatiba += cantidad;
                                System.out.println("Valor: " + (cantidad * lechugaVatiba.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 7 -> {
                                System.out.println("Cuantas zanahorias desea comprar?");
                                cantidad = teclado.nextInt();
                                cantZanahoria += cantidad;
                                System.out.println("Valor: " + (cantidad * zanahoria.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 8 -> {
                                System.out.println("Cuantos brocolis desea comprar?");
                                cantidad = teclado.nextInt();
                                cantBrocoli += cantidad;
                                System.out.println("Valor: " + (cantidad * brocoli.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 9 -> {
                                System.out.println("Cuantas cebollas cabezonas desea comprar?");
                                cantidad = teclado.nextInt();
                                cantCebollaCabezona += cantidad;
                                System.out.println("Valor: " + (cantidad * cebollaCabezona.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 10 -> {
                                System.out.println("Cuantas cebollas largas desea comprar?");
                                cantidad = teclado.nextInt();
                                cantCebollaRama += cantidad;
                                System.out.println("Valor: " + (cantidad * cebollaRama.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                            case 11 -> {
                                System.out.println("Cuantas cebollas moradas desea comprar?");
                                cantidad = teclado.nextInt();
                                cantCebollaMorada += cantidad;
                                System.out.println("Valor: " + (cantidad * cebollaMorada.getPrecio()));
                                System.out.println("Desea seguir comprando? 1.Si   2.No");
                                opc1 = teclado.nextInt();
                                if (opc1 == 1) {
                                    repeticion = true;
                                } else {
                                    repeticion =false;
                                    salir = true;
                                }
                            }
                        }
                    }
                }while (repeticion);
            }
            else if (opcion == 2) {
                total = 0;
                System.out.println(" ");
                System.out.println("          SUPERMERCADO UNIMINUTO");
                System.out.println("PRODUCTO            CANT      V/UNIT     V/TOTAL   ");
                if (cantManzanaRoja > 0) {
                    subtotal = cantManzanaRoja * manzanaRoja.getPrecio();
                    System.out.println("Manzana Roja         " + cantManzanaRoja + "       " + manzanaRoja.getPrecio() + "      " + subtotal);
                    total += (int) subtotal;
                }
                if (cantManzanaVerde > 0) {
                    subtotal = cantManzanaVerde * manzanaVerde.getPrecio();
                    System.out.println("Manzana Verde        " + cantManzanaVerde + "       " + manzanaVerde.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantNaranja > 0) {
                    subtotal = cantNaranja * naranja.getPrecio();
                    System.out.println("Naranja              " + cantNaranja + "       " + naranja.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantMango > 0) {
                    subtotal = cantMango * mango.getPrecio();
                    System.out.println("Mango                " + cantMango + "       " + mango.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantDurazno > 0) {
                    subtotal = cantDurazno * durazno.getPrecio();
                    System.out.println("Durazno              " + cantDurazno + "       " + durazno.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantPlatanoAmarillo > 0) {
                    subtotal = cantPlatanoAmarillo * platanoAmarillo.getPrecio();
                    System.out.println("Platano Amarillo     " + cantPlatanoAmarillo + "       " + platanoAmarillo.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantPlatanoVerde > 0) {
                    subtotal = cantPlatanoVerde * platanoVerde.getPrecio();
                    System.out.println("Platano Verde        " + cantPlatanoVerde + "       " + platanoVerde.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantBananoPequeno > 0) {
                    subtotal = cantBananoPequeno * bananoPequeno.getPrecio();
                    System.out.println("Banano Pequeño       " + cantBananoPequeno + "       " + bananoPequeno.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantBananoGrande > 0) {
                    subtotal = cantBananoGrande * bananoGrande.getPrecio();
                    System.out.println("Banano Grande        " + cantBananoGrande + "       " + bananoGrande.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantPera > 0) {
                    subtotal = cantPera * pera.getPrecio();
                    System.out.println("Pera                 " + cantPera + "       " + pera.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantPina > 0) {
                    subtotal = cantPina * pina.getPrecio();
                    System.out.println("Piña                 " + cantPina + "       " + pina.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantTomateRojo > 0) {
                    subtotal = cantTomateRojo * tomateRojo.getPrecio();
                    System.out.println("Tomate Rojo          " + cantTomateRojo + "       " + tomateRojo.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantTomateVerde > 0) {
                    subtotal = cantTomateVerde * tomateVerde.getPrecio();
                    System.out.println("Tomate Verde         " + cantTomateVerde + "       " + tomateVerde.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantTomatePintoso > 0) {
                    subtotal = cantTomatePintoso * tomatePintoso.getPrecio();
                    System.out.println("Tomate Pintoso       " + cantTomatePintoso + "       " + tomatePintoso.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantLechugaCrespa > 0) {
                    subtotal = cantLechugaCrespa * lechugaCrespa.getPrecio();
                    System.out.println("Lechuga Crespa       " + cantLechugaCrespa + "       " + lechugaCrespa.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantLechugaMorada > 0) {
                    subtotal = cantLechugaMorada * lechugaMorada.getPrecio();
                    System.out.println("Lechuga Morada       " + cantLechugaMorada + "       " + lechugaMorada.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantLechugaVatiba > 0) {
                    subtotal = cantLechugaVatiba * lechugaVatiba.getPrecio();
                    System.out.println("Lechuga Vatiba       " + cantLechugaVatiba + "       " + lechugaVatiba.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantZanahoria > 0) {
                    subtotal = cantZanahoria * zanahoria.getPrecio();
                    System.out.println("Zanahoria            " + cantZanahoria + "       " + zanahoria.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantBrocoli > 0) {
                    subtotal = cantBrocoli * brocoli.getPrecio();
                    System.out.println("Brocoli              " + cantBrocoli + "       " + brocoli.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantCebollaCabezona > 0) {
                    subtotal = cantCebollaCabezona * cebollaCabezona.getPrecio();
                    System.out.println("Cebolla Cabezona     " + cantCebollaCabezona + "       " + cebollaCabezona.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantCebollaRama > 0) {
                    subtotal = cantCebollaRama * cebollaRama.getPrecio();
                    System.out.println("Cebolla Larga     " + cantCebollaRama + "       " + cebollaRama.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                if (cantCebollaMorada > 0) {
                    subtotal = cantCebollaMorada * cebollaMorada.getPrecio();
                    System.out.println("Cebolla Morada     " + cantCebollaMorada + "       " + cebollaMorada.getPrecio() + "     " + subtotal);
                    total += (int) subtotal;
                }
                System.out.println("--------------------------------------------");
                iva = (total / 100) * 16;
                totaliva = iva + total;
                System.out.println("TOTAL A PAGAR: " + totaliva);
            }
            if (opcion == 3) {
                break;
            }
        }while (salir);
    }
}