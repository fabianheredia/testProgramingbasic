import java.util.*;

class numbers {
  public static void main(String args[]) {
    System.out.println("Hola, este programa evalua un listado de numeros enteros y muestra los repetidos");
    System.out.println("por favor ingrese los numeros separados por coma");
    try {
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      //System.out.println("ud  a ingresado: [" + s + "]");
      List<String> listNumbers = new ArrayList<String>(Arrays.asList(s.split(",")));
      ArrayList<Integer> myNumberList = getListNumbers(listNumbers);
      if (myNumberList == null) {
        System.out.println("No todos los valores son numericos o de tipo entero");
      } else {
        ArrayList<Integer> myNumbeRepeat = new ArrayList<Integer>();
        System.out.println(myNumberList);
        for (int i = 1; i < myNumberList.size(); i++) {
          if (myNumberList.get(i) == myNumberList.get(i - 1)) {
            if (i <= 1) {
              myNumbeRepeat.add(myNumberList.get(i));
            }
            if (i > 1 && (myNumberList.get(i) != myNumberList.get(i - 2))) {
              myNumbeRepeat.add(myNumberList.get(i));
            } else {

            }
          }
        }
        System.out.println("Encontramos "+ myNumbeRepeat.size()+" numeros repetidos");
        System.out.println(myNumbeRepeat);
      }

    } catch (Exception e) {

      System.out.println("Alguno de los valores ingresados no corresponde con elementos numericos");
    }

  }

  private static ArrayList<Integer> getListNumbers(List<String> numbers) {
    try {
      ArrayList<Integer> al = new ArrayList<Integer>();
      for (String var : numbers) {
        al.add(Integer.parseInt(var));
      }
      Collections.sort(al);
      return al;
    } catch (Exception e) {
      return null;
    }
  }

}