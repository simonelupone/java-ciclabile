import org.collections.java.Ciclabile;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int[] array = { 16, 77, 91, 447, 50 };
        Ciclabile nuovoArray = new Ciclabile(array);

        nuovoArray.addElement(6);

        System.out.println(nuovoArray.toString());

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        System.out.print("Elemento Current: " + nuovoArray.getCurrent() + " | ");
        System.out.print("getElementoSuccessivo(): " +
                nuovoArray.getElementoSuccessivo());
        System.out.println("\nhas next--->" + nuovoArray.hasAncoraElementi());

        System.out.println("--------------------------------------------------------");

        nuovoArray.addElement(586);

        System.out.println(nuovoArray.toString());

    }

}
