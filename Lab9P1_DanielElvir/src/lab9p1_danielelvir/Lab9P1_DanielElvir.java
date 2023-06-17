/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_danielelvir;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Lab9P1_DanielElvir {

    static Scanner leer = new Scanner(System.in);
    static Scanner read = new Scanner(System.in);
    static ArrayList<Librero> libros = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;

        while (seguir) {
            System.out.println("---Menu Principal---");
            System.out.println("1. Libros y más Libros REMASTERED");
            System.out.println("2. Salir");
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    boolean continuar = true;
                    while (continuar) {
                        System.out.println("Bienvenido a Metromedia!");
                        System.out.println("1. Agregar el libro");
                        System.out.println("2. Listar libros");
                        System.out.println("3. Modificar libro");
                        System.out.println("4. Eliminar libro");
                        System.out.println("5. Buscar libro por titulo");
                        System.out.println("6. Buscar libro segun su autor");
                        System.out.println("7. Busqueda con filtro de genero");
                        System.out.println("8. Volver al menu principal");
                        int eleccion = leer.nextInt();

                        switch (eleccion) {
                            case 1: {
                                System.out.println("Ha elegido la opción para agregar un libro, por favor aporte la información solicitada");
                                System.out.println("Ingrese el titulo del libro");
                                String titulo = read.nextLine();
                                System.out.println("Ingrese el autor del libro");
                                String autor = read.nextLine();
                                System.out.println("Ingrese el genero al cual pertenece al libro");
                                String genero = read.nextLine();
                                System.out.println("Ingrese la edad minima para leer el libro");
                                int edad = leer.nextInt();

                                boolean mayor = true;
                                while (mayor) {
                                    if (edad <= 0) {
                                        System.out.println("Ingrese una edad valida");
                                        edad = leer.nextInt();
                                    } else {
                                        mayor = false;
                                    }
                                }
                                addLibro(titulo, autor, genero, edad);
                                System.out.println("El libro fue agregado exitosamente!");
                                System.out.println("");
                                break;
                            }

                            case 2: {
                                if (!libros.isEmpty()) {
                                    listarLibro();
                                } else {
                                    System.out.println("El librero está vacio, necesita agregar libros primero");
                                    System.out.println("");
                                }
                                break;
                            }

                            case 3: {
                                if (!libros.isEmpty()) {
                                    System.out.println("Ha ingresado la opción de modificar libros, elija el libro que modificara:");
                                    listarLibro();
                                    System.out.println("Seleccione su libro");
                                    int seleccion = leer.nextInt();
                                    boolean existe = true;
                                    while (existe) {
                                        if (seleccion < 0 || seleccion > libros.size()) {
                                            System.out.println("El elemento que busca no está en la lista");
                                            listarLibro();
                                            System.out.println("Seleccione su libro");
                                            seleccion = leer.nextInt();
                                        } else {
                                            existe = false;
                                        }
                                    }

                                    modificarLibro(seleccion);
                                } else {
                                    System.out.println("El librero está vacio, necesita agregar libros primero");
                                    System.out.println("");
                                }
                                break;
                            }

                            case 4: {
                                if (!libros.isEmpty()) {
                                    System.out.println("Ha ingresado la opcion de eliminar libros, elija el libro que quiere eliminar:");
                                    listarLibro();
                                    System.out.println("Seleccione el libro");
                                    int seleccion = leer.nextInt();
                                    boolean existe = true;
                                    while (existe) {
                                        if (seleccion < 0 || seleccion > libros.size()) {
                                            System.out.println("El elemento que busca no está en la lista");
                                            listarLibro();
                                            System.out.println("Seleccione su libro");
                                            seleccion = leer.nextInt();
                                        } else {
                                            existe = false;
                                        }
                                    }

                                    eliminarLibro(seleccion);
                                    System.out.println("Libro eliminado exitosamente");
                                    System.out.println("");
                                } else {
                                    System.out.println("El librero está vacio, necesita agregar libros primero");
                                    System.out.println("");
                                }
                                break;
                            }

                            case 5: {
                                if (!libros.isEmpty()) {

                                    System.out.println("Ha ingresado la opcion de filtrar por titulo");
                                    System.out.println("Ingrese el titulo del libro a buscar");
                                    String buscTitulo = read.nextLine();
                                    buscarTitulo(buscTitulo);

                                } else {
                                    System.out.println("El librero está vacio, necesita agregar libros primero");
                                    System.out.println("");
                                }
                                break;
                            }

                            case 6: {
                                if (!libros.isEmpty()) {
                                    System.out.println("Ha ingresado la opcion de filtrar por Autor");
                                    System.out.println("Ingrese el Autor del libro a buscar");
                                    String buscAutor = read.nextLine();
                                    buscarAutor(buscAutor);
                                } else {
                                    System.out.println("El librero está vacio, necesita agregar libros primero");
                                    System.out.println("");
                                }
                                break;
                            }

                            case 7: {
                                if (!libros.isEmpty()) {
                                    System.out.println("Ha ingresado la opcion de filtrar por Genero");
                                    System.out.println("Ingrese el Genero del libro a buscar");
                                    String buscGenero = read.nextLine();
                                    buscarGenero(buscGenero);
                                } else {
                                    System.out.println("El librero está vacio, necesita agregar libros primero");
                                    System.out.println("");
                                }
                                break;
                            }

                            case 8: {
                                System.out.println("Volviendo al menu principal...");
                                System.out.println("");
                                continuar = false;
                                break;
                            }

                        }
                    }
                    break;
                }

                case 2: {
                    System.out.println("Gracias por usar el programa");
                    seguir = false;
                }
            }
        }
    }

    public static void addLibro(String titulo, String autor, String genero, int edad) {
        Librero lib = new Librero(titulo, autor, genero, edad);
        libros.add(lib);
    }

    public static void listarLibro() {
        System.out.println("Libros disponibles:");
        for (int i = 0; i < libros.size(); i++) {
            Librero libro = libros.get(i);
            System.out.println("Libro " + (i + 1));
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Genero: " + libro.getGenero());
            System.out.println("Edad minimo: " + libro.getEdad());
            System.out.println("");
        }
        System.out.println("");
    }

    public static void modificarLibro(int seleccion) {
        Librero lib = libros.get(seleccion - 1);
        System.out.println("Ha seleccionado el libro " + lib.getTitulo() + " que atributo desea modificar?");
        System.out.println("1. Titulo");
        System.out.println("2. Autor");
        System.out.println("3. Genero");
        System.out.println("4. Edad minima");
        System.out.println("Ingrese una opcion");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println("Modificara el Titulo del libro, ingrese un nuevo titulo:");
                String nuevoTitulo = read.nextLine();
                lib.setTitulo(nuevoTitulo);
                System.out.println("El libro fue modificado exitosamente");
                System.out.println("");
                break;
            }

            case 2: {
                System.out.println("Modificara el Autor del libro, ingrese un nuevo autor:");
                String nuevoAutor = read.nextLine();
                lib.setAutor(nuevoAutor);
                System.out.println("El libro fue modificado exitosamente");
                System.out.println("");
                break;
            }

            case 3: {
                System.out.println("Modificara el Genero del libro, ingrese un nuevo género:");
                String nuevoGenero = read.nextLine();
                lib.setGenero(nuevoGenero);
                System.out.println("El libro fue modificado exitosamente");
                System.out.println("");
                break;
            }

            case 4: {
                System.out.println("Modificara la Edad Minima del libro, ingrese uns nueva edad:");
                int nuevaEdad = leer.nextInt();

                boolean mayor = true;
                while (mayor) {
                    if (nuevaEdad <= 0) {
                        System.out.println("Ingrese una edad valida");
                        nuevaEdad = leer.nextInt();
                    } else {
                        mayor = false;
                    }
                }
                lib.setEdad(nuevaEdad);
                System.out.println("El libro fue modificado exitosamente");
                System.out.println("");
                break;
            }
        }
    }

    public static void eliminarLibro(int seleccion) {
        Librero lib = libros.get(seleccion - 1);
        libros.remove(lib);
    }

    public static void buscarTitulo(String buscTitulo) {
        boolean buscar = false;
        for (int i = 0; i < libros.size(); i++) {
            Librero lib = libros.get(i);
            if (lib.getTitulo().equalsIgnoreCase(buscTitulo)) {
                System.out.println("Libro encontrado");
                System.out.println("1. Titulo " + lib.getTitulo());
                System.out.println("2. Autor " + lib.getAutor());
                System.out.println("3. Genero " + lib.getGenero());
                System.out.println("4. Edad Minima " + lib.getEdad());
                System.out.println("");
                buscar = true;
            }
        }
        if (!buscar) {
            System.out.println("El libro no fue encontrado");
        }
    }

    public static void buscarAutor(String buscAutor) {
        boolean buscar = false;
        for (int i = 0; i < libros.size(); i++) {
            Librero lib = libros.get(i);
            if (lib.getAutor().equalsIgnoreCase(buscAutor)) {
                System.out.println("Libro encontrado");
                System.out.println("1. Titulo " + lib.getTitulo());
                System.out.println("2. Autor " + lib.getAutor());
                System.out.println("3. Genero " + lib.getGenero());
                System.out.println("4. Edad Minima " + lib.getEdad());
                System.out.println("");
                buscar = true;
            }
        }
        if (!buscar) {
            System.out.println("El libro no fue encontrado");
        }
    }

    public static void buscarGenero(String buscGenero) {
        boolean buscar = false;
        for (int i = 0; i < libros.size(); i++) {
            Librero lib = libros.get(i);
            if (lib.getGenero().equalsIgnoreCase(buscGenero)) {
                System.out.println("Libro encontrado");
                System.out.println("1. Titulo " + lib.getTitulo());
                System.out.println("2. Autor " + lib.getAutor());
                System.out.println("3. Genero " + lib.getGenero());
                System.out.println("4. Edad Minima " + lib.getEdad());
                System.out.println("");
                buscar = true;
            }
        }
        if (!buscar) {
            System.out.println("El libro no fue encontrado");
        }
    }
}
