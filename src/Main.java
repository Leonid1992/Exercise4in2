// someone enters “ alphabet “ (notice the spaces) as input into a method, make that
      //  method output “alphabeT” instead


public class Main {
    public static void main(String[] args) {
       String input = "Alphabet";
       System.out.println("Prima: " + input);

       String stripInput = input.strip();
       String nrInput = stripInput.substring(0,stripInput.length()-1);
       System.out.println("Durante: " + nrInput);

       Character cambioLett = stripInput.charAt(stripInput.length()-1);
       System.out.println("Fine: " + nrInput + cambioLett.toString().toUpperCase());
    }
}